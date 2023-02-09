/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Datos;

import Datos.Conexion;
import Modelos.Vigilante;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class DAOVigilante {

    private static final Conexion con = Conexion.saberEstado();

    public int Modificar(String cedula, String nombre, String apellidos, String direccion, String correo, String telefono, Date fechaNacimiento, double sueldo) {
        String sql = "UPDATE  vigilante SET nombre = '"
                + nombre + "',apellido='"
                + apellidos + "',direccion='"
                + direccion + "',correo='"
                + correo + "',telefono='"
                + telefono + "',fechanacimiento='"
                + fechaNacimiento + "',sueldo='"
                + sueldo + "' WHERE cedula='"
                + cedula + "'";
        return con.actualizar(sql);
    }

    public Vigilante Buscar(String cedula) {
        String sql = "SELECT * FROM  vigilante WHERE cedula = '"
                + cedula + "'";

        List<Map> registros = con.ejecutar(sql);
        Vigilante vigi = null;

        for (Map registro : registros) {
            vigi = new Vigilante((String) registro.get("cedula"),
                    (String) registro.get("nombre"),
                    (String) registro.get("apellido"),
                    (String) registro.get("direccion"),
                    (String) registro.get("correo"),
                    (String) registro.get("telefono"),
                    (Date) registro.get("fechanacimiento"),
                    (double) registro.get("sueldo"),
                    (String) registro.get("estado"));
        }
        return vigi;
    }

    public int Eliminar(String cedula) {
        String sql = "DELETE FROM  vigilante WHERE cedula = '"
                + cedula + "'";
        return con.actualizar(sql);
    }

    public Vigilante Agregar(String cedula, String nombre, String apellidos, String direccion, String correo, String telefono, Date fechaNacimiento, double sueldo, String estatus) {
        String sql = "INSERT INTO vigilante (cedula,nombre,apellido,direccion,correo,telefono,fechanacimiento,sueldo,estado) VALUES('"
                + cedula + "','"
                + nombre + "','"
                + apellidos + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + direccion + "','"
                + correo + "','"
                + telefono + "','"
                + fechaNacimiento + "','"
                + sueldo + "','"
                + estatus + "')";

        if (con.actualizar(sql) > 0) {

            return new Vigilante(cedula, nombre, apellidos, direccion, correo, telefono, fechaNacimiento, sueldo, estatus);
        }
        return null;
    }
}

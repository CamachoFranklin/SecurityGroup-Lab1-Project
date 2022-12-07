/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Datos;

import Modelos.Vigilante;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class DAOVigilante {

    public Vigilante Agregar(
            String cedula,
            String nombre,
            String apellidos,
            String direccion,
            String correo,
            Date fechaNacimiento,
            String telefono,
            double sueldo,
            char estado) {
        String sql = "INSERT INTO vigilante (cedula,nombre,apellido,direccion,correo,fechaNacimiento,telefono,sueldo,estado) VALUES('"
                + cedula + "','"
                + nombre + "','"
                + apellidos + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + direccion + "','"
                + correo + "','"
                + fechaNacimiento + "','"
                + telefono + "','"
                + sueldo + "','"
                + estado + "')";

        if (new Conexion().queryInsertar(sql)> 0) {

            return new Vigilante(cedula, nombre, apellidos, direccion, correo, telefono, fechaNacimiento, sueldo, estado);

        }
        return null;

    }

    public int Modificar(String cedula, String nombre, String apellidos, String direccion, String correo, Date fechaNacimiento, String telefono, double sueldo) {
        String sql = "UPDATE  vigilante SET nombre = '"
                + nombre + "',apellido='"
                + apellidos + "',direccion='"
                + direccion + "',correo='"
                + correo + "',fechaNacimiento='"
                + fechaNacimiento + "',telefono='"
                + telefono + "',sueldo='"
                + sueldo + "' WHERE cedula='"
                + cedula + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Vigilante Buscar(String cedula) {
        String sql = "SELECT * FROM  vigilante WHERE cedula = '"
                + cedula + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Vigilante vigi = null;

        for (Map registro : registros) {
            vigi = new Vigilante((String) registro.get("cedula"),
                    (String) registro.get("nombre"),
                    (String) registro.get("apellido"),
                    (String) registro.get("direccion"),
                    (String) registro.get("correo"),
                    (String) registro.get("telefono"),
                    (Date) registro.get("fechaNacimiento"),
                    (double) registro.get("sueldo"),
                    (char) registro.get("estatus"));

        }
        return vigi;
    }

    public int Eliminar(String cedula) {
        String sql = "DELETE FROM  vigilante WHERE cedula = '"
                + cedula + "'";
        return new Conexion().queryInsertar(sql);

    }
}

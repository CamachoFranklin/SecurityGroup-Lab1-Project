/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Datos;

import Modelos.Cliente;
import java.util.List;
import java.util.Map;

public class DAOCliente {

    private static final Conexion con = Conexion.saberEstado();

    public Cliente Agregar(
            String rif,
            String nombre,
            String descripcion,
            String telefono,
            String direccion,
            String tipoCliente,
            String estatus
    ) {
        String sql = "INSERT INTO cliente (rif,nombre,descripcion,telefono,direccion,tipocliente,estatus) VALUES('"
                + rif + "','"
                + nombre + "','"
                + descripcion + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + telefono + "','"
                + direccion + "','"
                + tipoCliente + "','"
                + estatus + "')";

        if (con.actualizar(sql) > 0) {

            return new Cliente(rif, nombre, descripcion, telefono, direccion, tipoCliente, estatus);
        }
        return null;
    }

    public int Modificar(String rif, String nombre,
            String descripcion, String telefono,
            String direccion, String tipoCliente, String estatus) {
        String sql = "UPDATE  cliente SET nombre = '"
                + nombre + "',descripcion='"
                + descripcion + "',direccion='"
                + direccion + "',telefono='"
                + telefono + "',tipocliente='"
                + tipoCliente + "',estatus='"
                + estatus + "' WHERE rif='"
                + rif + "'";
        return con.actualizar(sql);
    }

    public Cliente Buscar(String rif) {
        String sql = "SELECT * FROM  cliente WHERE rif = '"
                + rif + "'";

        List<Map> registros = con.ejecutar(sql);
        Cliente clie = null;

        for (Map registro : registros) {
            clie = new Cliente((String) registro.get("rif"),
                    (String) registro.get("nombre"),
                    (String) registro.get("descripcion"),
                    (String) registro.get("telefono"),
                    (String) registro.get("direccion"),
                    (String) registro.get("tipocliente"),
                    (String) registro.get("estatus")
            );
        }
        return clie;
    }

    public int Eliminar(String rif) {
        String sql = "DELETE FROM  cliente WHERE rif = '"
                + rif + "'";
        return con.actualizar(sql);
    }
}

/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Datos;

import Modelos.Ubicacion;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class DAOUbicacion {

    private static final Conexion con = Conexion.saberEstado();

    public Ubicacion Agregar(
            String cedulaVigilante,
            int tipoTurno,
            String idServicio,
            Date fecha,
            String estatus) {
        String sql = "INSERT INTO ubicacion (cedulaVigilante,tipoTurno,idServicio,estatus) VALUES('"
                + cedulaVigilante + "','"
                + tipoTurno + "','"
                + idServicio + "','"
                + estatus + "')";

        if (con.actualizar(sql) > 0) {

            return new Ubicacion(cedulaVigilante, tipoTurno, idServicio, estatus);
        }
        return null;
    }

    public int Modificar(String cedulaVigilante, int tipoTurno, String idServicio, String estatus) {
        String sql = "UPDATE  ubicacion SET tipoTurno = '"
                + tipoTurno + "',idServicio='"
                + idServicio + "',estatus='"
                + estatus + "' WHERE cedulaVigilante='"
                + cedulaVigilante + "'";
        return con.actualizar(sql);
    }

    public Ubicacion Buscar(String cedulaVigilante) {
        String sql = "SELECT * FROM  ubicacion WHERE cedulaVigilante = '"
                + cedulaVigilante + "'";

        List<Map> registros = con.ejecutar(sql);
        Ubicacion ubi = null;

        for (Map registro : registros) {
            ubi = new Ubicacion((String) registro.get("cedulaVigilante"),
                    (int) registro.get("tipoTurno"),
                    (String) registro.get("idServicio"),
                    (String) registro.get("estatus"));
        }
        return ubi;
    }

    public int Eliminar(String cedulaVigilante) {
        String sql = "DELETE FROM  ubicacion WHERE cedulaVigilante = '"
                + cedulaVigilante + "'";
        return con.actualizar(sql);
    }
}

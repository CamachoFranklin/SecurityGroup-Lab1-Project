
package Datos;

import Modelos.Servicio;
import java.sql.Date;
import java.util.List;
import java.util.Map;

/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
public class DAOServicio {

    public Servicio Agregar(
            int idServicio,
            int cantidadVigilantes,
             double monto,
            double costo,
            Date fechaInicio,
           
            String descripcion,
            char estatus) {
        String sql = "INSERT INTO servicio (idServicio,cantidadVigilantes,monto,costo,fechaInicio,descripcion,estatus) VALUES('"
                + idServicio + "','"
                + cantidadVigilantes + "','"
                 + costo + "','" //se esta concatenando lo que se esta recibiendo como parametro
                 + fechaInicio + "','"
                 + descripcion + "','"
                + estatus + "')";

        if (new Conexion().queryInsertar(sql) > 0) {

            return new Servicio(idServicio, cantidadVigilantes,monto,costo,fechaInicio, descripcion, estatus);

        }
        return null;

    }

    public int Modificar(int idServicio, String descripcion,
            double costo, Date fechaInicio, Date fechaFinal,
            int cantidadVigilantes, char estatus) {
        String sql = "UPDATE  servicio SET descripcion = '"
                + descripcion + "',costo='"
                + costo + "',fechaInicio='"
                + fechaInicio + "',fechaFinal='"
                + fechaFinal + "',cantidadVigilantes='"
                + cantidadVigilantes + "',estatus='"
                + estatus + "' WHERE idServicio='"
                + idServicio + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Servicio Buscar(String idServicio) {
        String sql = "SELECT * FROM  servicio WHERE idServicio = '"
                + idServicio + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Servicio serv = null;

        for (Map registro : registros) {
            serv = new Servicio((int) registro.get("idServicio"),
                     (int) registro.get("cantidadVigilantes"),
                    (double) registro.get("monto"),
                    (double) registro.get("costo"),
                    (Date) registro.get("fechaInicio"),                   
                    (String) registro.get("descripcion"),
                    (char) registro.get("estatus")
            );

        }
        return serv;
    }

    public int Eliminar(String idServicio) {
        String sql = "DELETE FROM  Servicio WHERE idServicio = '"
                + idServicio + "'";
        return new Conexion().queryInsertar(sql);

    }

}

package Datos;

import Modelos.Servicio;
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

    public Servicio Agregar(String Id,
            String descripcion,
             String fechaInicio,
            String rif,
            int cantidadvigi,
            int cantidadbici,
            int cantidadradio,
            double costo,
            double monto,
            double preciobici,
            double precioradio,
            String estado) {
        String sql = "INSERT INTO servicio (id, descripcion, fechainicio, rif, cantidadvigi,  cantidadbici,"
                + "                          cantidadradio,  costo,  monto,  preciobici,  precioradio, estado) VALUES('"
                + Id + "','"
                + descripcion + "','"
                + fechaInicio + "','"
                + rif + "','"
                + cantidadvigi + "','"
                + cantidadbici + "','"
                + cantidadradio + "','"
                + costo + "','"
                + monto + "','"
                + preciobici + "','"
                + precioradio + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + estado + "')";

        if (new Conexion().queryInsertar(sql) > 0) {

            return new Servicio(Id, descripcion, fechaInicio, rif, cantidadvigi, cantidadbici, cantidadradio, costo, monto, preciobici, precioradio, estado);

        }
        return null;

    }

    public int Modificar(String Id,
            String descripcion,
             String fechaInicio,
            String rif,
            int cantidadvigi,
            int cantidadbici,
            int cantidadradio,
            double costo,
            double monto,
            double preciobici,
            double precioradio,
            String estado) {
        String sql = "UPDATE  servicio SET descripcion = '"
                + descripcion + "',rif='"
                + rif + "',cantidadvigi='"
                + cantidadvigi + "',cantidadradio='"
                + cantidadradio + "',costo='"
                + costo + "',monto='"
                + monto + "',preciobici='"
                + preciobici + "',precioradio='"
                + precioradio + "',estado='"
                + estado + "' WHERE id='"
                + Id + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Servicio Buscar(String Id) {
        String sql = "SELECT * FROM  servicio WHERE id = '"
                + Id + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Servicio serv = null;

        for (Map registro : registros) {
            serv = new Servicio((String) registro.get("id"),
                    (String) registro.get("descripcion"),
                    (String) registro.get("fechainicio"),
                    (String) registro.get("rif"),
                    (int) registro.get("cantidadvigi"),
                    (int) registro.get("cantidadbici"),
                    (int) registro.get("cantidadradio"),
                    (double) registro.get("costo"),
                    (double) registro.get("monto"),
                    (double) registro.get("preciobici"),
                    (double) registro.get("precioradio"),
                    (String) registro.get("estado"));
        }
        return serv;
    }

    public int Eliminar(String Id) {
        String sql = "DELETE FROM  Servicio WHERE id = '"
                + Id + "'";
        return new Conexion().queryInsertar(sql);

    }

}

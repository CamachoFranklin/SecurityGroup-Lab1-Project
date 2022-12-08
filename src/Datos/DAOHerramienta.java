/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelos.Herramienta;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class DAOHerramienta {

    public int Modificar(int cantidad, String tipoHerramienta,
            double mantenimiento, double precio, String estado) {
        String sql = "UPDATE  herramienta SET mantenimiento='"
                + mantenimiento + "',cantidad='"
                + cantidad + "',precio='"
                + precio + "',estado='"
                + estado + "' WHERE tipoherramienta='"
                + tipoHerramienta + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Herramienta Buscar(String tipoHerramienta) {
        String sql = "SELECT * FROM  herramienta WHERE tipoherramienta = '"
                + tipoHerramienta + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Herramienta herra = null;

        for (Map registro : registros) {
            herra = new Herramienta(
                    (int) registro.get("cantidad"),
                    (String) registro.get("tipoherramienta"),
                    (double) registro.get("mantenimiento"),
                    (double) registro.get("precio"),
                    (String) registro.get("estado")
            );

        }
        return herra;
    }

    public int Eliminar(String id) {
        String sql = "DELETE FROM  herramienta WHERE id = '"
                + id + "'";
        return new Conexion().queryInsertar(sql);

    }
}
  /*  public Herramienta Buscar(String tipoHerramientas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}/*



/* public Herramienta Agregar(
             int cantidad,
            String tipoHerramienta,
           // double mantenimiento,
            //double precio,
            String estado
           ) {
        String sql = "INSERT INTO  herramienta (cantidad,tipoherramienta,estado) VALUES('"
                + cantidad + "','"
                + tipoHerramienta + "','"
               // + mantenimiento + "','"
              //  + precio + "','"//se esta concatenando lo que se esta recibiendo como parametro
                + estado + "')";

        if (new Conexion().queryInsertar(sql) > 0) {

            return new Herramienta(cantidad, tipoHerramienta, estado);

        }
        return null;

    }*/

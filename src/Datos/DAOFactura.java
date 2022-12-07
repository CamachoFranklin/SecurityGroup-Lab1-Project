/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.Factura;
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
public class DAOFactura {

    public Factura Agregar(
            int idFactura,
            int idServicio,
            Date fechaFactura,
            double montoFactura,
            String rifCliente,
            char estado) {
        String sql = "INSERT INTO factura (idFactura,idServicio,fechaFactura,montoFactura,rifCliente,estado) VALUES('"
                + idFactura + "','"
                + idServicio + "','"
                + fechaFactura + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + montoFactura + "','"
                + rifCliente + "','"
                + estado + "')";

        if (new Conexion().queryInsertar(sql) > 0) {

            return new Factura(idFactura, idServicio, fechaFactura, montoFactura, rifCliente, estado);

        }
        return null;

    }

    public int Modificar(int idFactura, int idServicio, Date fechaFactura, double montoFactura, String rifCliente, char estado) {
        String sql = "UPDATE  factura SET idServicio = '"
                + idServicio + "',fechaFactura='"
                + fechaFactura + "',montoFactura='"
                + montoFactura + "',rifCliente='"
                + rifCliente + "',estado='"
                + estado + "' WHERE idFactura='"
                + idFactura + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Factura Buscar(String idServicio) {
        String sql = "SELECT * FROM  factura WHERE idServicio = '"
                + idServicio + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Factura fact = null;

        for (Map registro : registros) {
            fact = new Factura((int) registro.get("idFactura"),
                    (int) registro.get("idServicio"),
                    (Date) registro.get("fechaFactura"),
                    (double) registro.get("montoFactura"),
                    (String) registro.get("rifCliente"),
                    (char) registro.get("estado"));

        }
        return fact;
    }

    public int Eliminar(String cedula) {
        String sql = "DELETE FROM  factura WHERE cedula = '"
                + cedula + "'";
        return new Conexion().queryInsertar(sql);

    }
}

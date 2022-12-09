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
            String idFactura,
            String idServicio,
            Date fechaFactura,
            double montoFactura,
            String rifCliente,
            String estado) {
        String sql = "INSERT INTO factura (idfactura,idservicio,fechafactura,montofactura,rifcliente,estado) VALUES('"
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

    public int Modificar(String idFactura, String idServicio, Date fechaFactura, double montoFactura, String rifCliente, String estado) {
        String sql = "UPDATE  factura SET idservicio = '"
                + idServicio + "',fechafactura='"
                + fechaFactura + "',montofactura='"
                + montoFactura + "',rifcliente='"
                + rifCliente + "',estado='"
                + estado + "' WHERE idfactura='"
                + idFactura + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Factura Buscar(String idServicio) {
        String sql = "SELECT * FROM  factura WHERE idservicio = '"
                + idServicio + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Factura fact = null;

        for (Map registro : registros) {
            fact = new Factura((String) registro.get("idfactura"),
                    (String) registro.get("idservicio"),
                    (Date) registro.get("fechafactura"),
                    (double) registro.get("montofactura"),
                    (String) registro.get("rifcliente"),
                    (String) registro.get("estado"));

        }
        return fact;
    }

    public int Eliminar(String idfactura) {
        String sql = "DELETE FROM  factura WHERE idfactura = '"
                + idfactura + "'";
        return new Conexion().queryInsertar(sql);

    }
}

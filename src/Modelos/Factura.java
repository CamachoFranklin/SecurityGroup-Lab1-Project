/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

//Para usar el tipo de variable Date es necesario importar
import java.util.Date;

public class Factura {

    // Declaración de atributos
    private int idFactura, idServicio;
    private Date fechaFactura;
    private double montoFactura;
    private String rifCliente;

    // Constructor de la clase
    public Factura(int idFactura, int idServicio, Date fechaFactura, double montoFactura, String rifCliente) {
        this.idFactura = idFactura;
        this.idServicio = idServicio;
        this.fechaFactura = fechaFactura;
        this.montoFactura = montoFactura;
        this.rifCliente = rifCliente;
    }

    // Creación de los Metodos Getter y Setter
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public String getRifCliente() {
        return rifCliente;
    }

    public void setRifCliente(String rifCliente) {
        this.rifCliente = rifCliente;
    }

}

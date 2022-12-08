/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

public class Herramienta {

    private String tipoHerramienta;
    private int cantidad;
    private double mantenimiento, precio;
    private String estado;

    public Herramienta(int cantidad, String tipoHerramienta, double mantenimiento, double precio, String estado) {
        super();
        this.cantidad = cantidad;
        this.tipoHerramienta = tipoHerramienta;
        this.mantenimiento = mantenimiento;
        this.precio = precio;
        this.estado = estado;

    }

    public Herramienta() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoHerramienta() {
        return tipoHerramienta;
    }

    public void setTipoHerramienta(String tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

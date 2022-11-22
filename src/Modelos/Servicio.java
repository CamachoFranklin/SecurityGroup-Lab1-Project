/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I: 
 */
package Modelos;

import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Servicio {

    private int idServicio,
            cantidadVigilantes,
            cantidadTurnos;
    private double costo;
    private Date fechaInicio;
    private String descripcion;
    private char estatus;

    public Servicio(int idServicio, int cantidadVigilantes,
            int cantidadTurnos, double costo, Date fechaInicio,
            String descripcion, char estatus) {
        this.idServicio = idServicio;
        this.cantidadVigilantes = cantidadVigilantes;
        this.cantidadTurnos = cantidadTurnos;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getCantidadVigilantes() {
        return cantidadVigilantes;
    }

    public void setCantidadVigilantes(int cantidadVigilantes) {
        this.cantidadVigilantes = cantidadVigilantes;
    }

    public int getCantidadTurnos() {
        return cantidadTurnos;
    }

    public void setCantidadTurnos(int cantidadTurnos) {
        this.cantidadTurnos = cantidadTurnos;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

}

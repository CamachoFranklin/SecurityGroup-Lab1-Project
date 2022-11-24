/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Servicio {

    // Declaración de atributos
    private int idServicio,
            cantidadVigilantes;
    private double costo;
    private Date fechaInicio, fechaFinal;
    private String descripcion;
    private char estatus;

    // Constructor de la clase
    public Servicio(int idServicio, int cantidadVigilantes, double costo,
            Date fechaInicio, Date fechaFinal, String descripcion,
            char estatus) {
        this.idServicio = idServicio;
        this.cantidadVigilantes = cantidadVigilantes;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    // Creación de los Metodos Getter y Setter
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

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
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

    // Método para calcular cantidad de turnos
    public int calcularCantidadTurnos(JDateChooser fechaI,
            JDateChooser fechaF, String tipoCliente) {

        // Inicialización de variable local
        int cantidadTurnos = 0;

        // Si el  tipo de cliente es tienda
        if ("Tienda".equals(tipoCliente)) {

            // Validando JDateChooser != null
            if (fechaI.getDate() != null && fechaF.getDate() != null) {
                Calendar fInicio = fechaI.getCalendar();
                Calendar fFinal = fechaF.getCalendar();

                // Inicialización de varible temporal
                int dias = -1;

                /*
                * Validación fechaInicio > fechaFinal
                * Validación fechaInicio = fechaFinal
                 */
                while (fInicio.before(fFinal) || fInicio.equals(fFinal)) {
                    // Se incrementa la variable temporal
                    dias++;
                    // Se realiza el respectivo cálculo para el tipo de cliente
                    cantidadTurnos = dias;
                    fInicio.add(Calendar.DATE, 1);
                }

                // Si las fechas son nulas
            } else {
                System.out.println("Los campos no pueden estar vacíos");
            }

            // Si el cliente no es tipo "tienda"
        } else {

            // Validando JDateChooser != null
            if (fechaI.getDate() != null && fechaF.getDate() != null) {
                Calendar fInicio = fechaI.getCalendar();
                Calendar fFinal = fechaF.getCalendar();

                // Inicialización de varible temporal
                int dias = -1;

                /*
                * Validación fechaInicio > fechaFinal
                * Validación fechaInicio = fechaFinal
                 */
                while (fInicio.before(fFinal) || fInicio.equals(fFinal)) {
                    // Se incrementa la variable temporal
                    dias++;

                    // Se realiza el respectivo cálculo para el tipo de cliente
                    cantidadTurnos = dias * 2;
                    fInicio.add(Calendar.DATE, 1);
                }
                // Si las fechas son nulas
            } else {
                System.out.println("Los campos no pueden estar vacíos");
            }
        }
        // se retorna el valor obtenido
        return cantidadTurnos;
    }
}

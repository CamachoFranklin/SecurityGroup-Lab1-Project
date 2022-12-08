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
    private String Id, descripcion, rif, estado;
    private int cantidadvigi, cantidadbici, cantidadradio;
    private double monto, costo, preciobici, precioradio;
    private String fechaInicio;

    // Constructor de la clase
    public Servicio(String Id, String descripcion, String fechaInicio, String rif, int cantidadvigi, int cantidadbici, int cantidadradio, double costo, double monto, double preciobici, double precioradio, String estado) {
        this.Id = Id;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.rif = rif;
        this.cantidadvigi = cantidadvigi;
        this.cantidadbici = cantidadbici;
        this.cantidadradio = cantidadradio;
        this.costo = costo;
        this.monto = monto;
        this.preciobici = preciobici;
        this.precioradio = precioradio;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Servicio() {
    }

    // Creación de los Metodos Getter y Setter
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadvigi() {
        return cantidadvigi;
    }

    public void setCantidadvigi(int cantidadvigi) {
        this.cantidadvigi = cantidadvigi;
    }

    public int getCantidadbici() {
        return cantidadbici;
    }

    public void setCantidadbici(int cantidadbici) {
        this.cantidadbici = cantidadbici;
    }

    public int getCantidadradio() {
        return cantidadradio;
    }

    public void setCantidadradio(int cantidadradio) {
        this.cantidadradio = cantidadradio;
    }

    public double getPreciobici() {
        return preciobici;
    }

    public void setPreciobici(double preciobici) {
        this.preciobici = preciobici;
    }

    public double getPrecioradio() {
        return precioradio;
    }

    public void setPrecioradio(double precioradio) {
        this.precioradio = precioradio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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

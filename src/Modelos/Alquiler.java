/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I: 
 */
package Modelos;

//Para usar el tipo de variable Date es necesario importar
import java.util.Date;

public class Alquiler {
    
    // Declaración de atributos
    private Date fechaInicio, fechaFinal;
    private double precio;
    
    // Constructor de la clase
    public Alquiler(Date fechaInicio, Date fechaFinal, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precio = precio;
    }
    
    // Creación de los Metodos Getter y Setter
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

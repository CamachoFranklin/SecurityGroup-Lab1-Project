/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

public class Asistencia {

    // Declaración de atributos
    private String cedulaVigilante, mes, anio;
    private int inasistencia, inasistenciaJus;
    private String estado;

    // Constructor de la clase
    public Asistencia(String cedulaVigilante, String mes, String anio,
            int inasistencia, int inasistenciaJus, String estado) {
        this.cedulaVigilante = cedulaVigilante;
        this.mes = mes;
        this.anio = anio;
        this.inasistencia = inasistencia;
        this.inasistenciaJus = inasistenciaJus;
        this.estado = estado;
    }

    public Asistencia() {
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getInasistencia() {
        return inasistencia;
    }

    public void setInasistencia(int inasistencia) {
        this.inasistencia = inasistencia;
    }

    // Creación de los Metodos Getter y Setter
    public String getCedulaVigilante() {
        return cedulaVigilante;
    }

    public void setCedulaVigilante(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }

    public int getInasistenciaJus() {
        return inasistenciaJus;
    }

    public void setInasistenciaJus(int inasistenciaJus) {
        this.inasistenciaJus = inasistenciaJus;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

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
    private String descripcion, cedulaVigilante;
    private int tipoAsistencia, contadorAsistencia;

    // Constructor de la clase
    public Asistencia(String descripcion, String cedulaVigilante,
            int tipoAsistencia, int contadorAsistencia) {
        this.descripcion = descripcion;
        this.cedulaVigilante = cedulaVigilante;
        this.tipoAsistencia = tipoAsistencia;
        this.contadorAsistencia = contadorAsistencia;
    }

    // Creación de los Metodos Getter y Setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCedulaVigilante() {
        return cedulaVigilante;
    }

    public void setCedulaVigilante(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }

    public int getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(int tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public int getContadorAsistencia() {
        return contadorAsistencia;
    }

    public void setContadorAsistencia(int contadorAsistencia) {
        this.contadorAsistencia = contadorAsistencia;
    }

}

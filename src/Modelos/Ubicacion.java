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

public class Ubicacion {

    // Declaración de atributos
    private String cedulaVigilante;
    private int tipoTurno;
    private String idServicio;
    private String estatus;

    public Ubicacion() {
    }

    public String getCedulaVigilante() {
        return cedulaVigilante;
    }

    public void setCedulaVigilante(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    // Constructor de la clase
    public Ubicacion(String cedulaVigilante, int tipoTurno, String idServicio, String estatus) {
        this.tipoTurno = tipoTurno;

        this.estatus = estatus;
    }

    // Creación de los Metodos Getter y Setter
    public int getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(int tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}

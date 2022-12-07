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

    public String getCedulaVigilante() {
        return cedulaVigilante;
    }

    public void setCedulaVigilante(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }
    private int tipoTurno;
    private String idServicio;
        private char estatus;

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    // Constructor de la clase
    public Ubicacion(String cedulaVigilante, int tipoTurno,String idServicio, char estatus) {
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

    

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

}

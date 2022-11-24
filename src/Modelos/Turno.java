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

public class Turno {

    // Declaración de atributos
    private int tipoTurno;
    private Date fecha;
    private char estatus;

    // Constructor de la clase
    public Turno(int tipoTurno, Date fecha, char estatus) {
        this.tipoTurno = tipoTurno;
        this.fecha = fecha;
        this.estatus = estatus;
    }

    // Creación de los Metodos Getter y Setter
    public int getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(int tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

}

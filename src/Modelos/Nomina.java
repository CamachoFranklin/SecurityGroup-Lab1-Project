/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I: 
 */
package Modelos;

public class Nomina {

    // Declaración de atributos
    private String cedulaVigilante;

    // Constructor de la clase
    public Nomina(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }

    // Creación de los Metodos Getter y Setter
    public String getCedulaVigilante() {
        return cedulaVigilante;
    }

    public void setCedulaVigilante(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }

}

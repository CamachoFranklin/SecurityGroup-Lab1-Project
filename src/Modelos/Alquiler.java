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

public class Alquiler {

    
    
    // Declaración de atributos
    
   private int cantBicicletas, cantRadios;
    
    // Constructor de la clase
    public Alquiler(int cantBicicletas, int cantRadios) {
        this.cantBicicletas = cantBicicletas;
        this.cantRadios = cantRadios;
        
    }
    
    // Creación de los Metodos Getter y Setter
    
public int getCantBicicletas() {
        return cantBicicletas;
    }

    public void setCantBicicletas(int cantBicicletas) {
        this.cantBicicletas = cantBicicletas;
    }

    public int getCantRadios() {
        return cantRadios;
    }

    public void setCantRadios(int cantRadios) {
        this.cantRadios = cantRadios;
    }
}

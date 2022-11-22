/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I: 
 */
package Modelos;

// se hace uso de "extends" para heredar de la clase Cliente
public class ClienteUrbanizacion extends Cliente {

    // Declaración de atributos
    private int numeroCasas;

    // Constructor de la clase
    public ClienteUrbanizacion(int numeroCasas, String rif, String nombre,
            String descripcion, String telefono, String direccion,
            int tipoCliente, char estatus) {

        // Caracteristicas heredadas
        super(rif, nombre, descripcion, telefono, direccion, tipoCliente, estatus);
        this.numeroCasas = numeroCasas;
    }

    // Creación de los Metodos Getter y Setter
    public int getNumeroCasas() {
        return numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

}

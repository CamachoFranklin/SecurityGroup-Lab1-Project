/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

// se hace uso de "extends" para heredar de la clase Cliente
public class ClienteTienda extends Cliente {

    // Declaración de atributos
    private int numeroLocal;

    // Constructor de la clase
    public ClienteTienda(int numeroLocal, String rif, String nombre,
            String descripcion, String telefono, String direccion,
            String tipoCliente, String estatus) {

        // Caracteristicas heredadas
        super(rif, nombre, descripcion, telefono,
                direccion, tipoCliente, estatus);
        this.numeroLocal = numeroLocal;
    }

    // Creación de los Metodos Getter y Setter
    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }
}

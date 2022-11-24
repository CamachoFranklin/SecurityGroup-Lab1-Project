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
public class ClienteEdificio extends Cliente {

    // Declaración de atributos
    private int cantidadPisos, cantidadApartamentos;

    // Constructor de la clase
    public ClienteEdificio(int cantidadPisos, int cantidadApartamentos,
            String rif, String nombre, String descripcion, String telefono,
            String direccion, int tipoCliente, char estatus) {

        // Caracteristicas heredadas
        super(rif, nombre, descripcion, telefono, direccion,
                tipoCliente, estatus);
        this.cantidadPisos = cantidadPisos;
        this.cantidadApartamentos = cantidadApartamentos;
    }

    // Creación de los Metodos Getter y Setter
    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadApartamentos() {
        return cantidadApartamentos;
    }

    public void setCantidadApartamentos(int cantidadApartamentos) {
        this.cantidadApartamentos = cantidadApartamentos;
    }

}

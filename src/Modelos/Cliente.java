/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

public class Cliente {

    // Declaración de atributos
    private String rif,
            nombre,
            descripcion,
            telefono,
            direccion;
    private String tipoCliente;
    private String estatus;

    // Constructor de la clase
    public Cliente(String rif, String nombre,
            String descripcion, String telefono,
            String direccion, String tipoCliente,String estatus) {

        //Características que se heredarán
        super();
        this.rif = rif;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
        
       this.estatus = estatus;
    }

    // Creación de los Metodos Getter y Setter
    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}

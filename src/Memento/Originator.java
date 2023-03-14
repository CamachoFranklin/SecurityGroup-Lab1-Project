/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Jesús Lopez C.I 27.479.039: 
 */

package Memento;

import java.util.Date;

//CREA UN MEMENTO QUE CONTIENE UNA INSTANCIA DE SU ESTADO INTERNO ACTUAL
public class Originator {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String estado;
    private double sueldo;
    private Date fechaNacimiento;

    public Originator(String cedula, String nombre, String apellido, String direccion, String correo, String telefono, String estado, double sueldo, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public void setMemento(Memento meme) // Asigna la informacion de tipo memento a los atributos del originator
    { 
        this.cedula = meme.getCedula();
        this.nombre = meme.getNombre();
        this.apellido = meme.getApellido();
        this.direccion = meme.getDireccion();
        this.correo = meme.getCorreo();
        this.telefono = meme.getTelefono();
        this.estado = meme.getEstado();
        this.sueldo = meme.getSueldo();
        this.fechaNacimiento = meme.getFechaNacimiento();
    }

    public Memento cearMemento() // CREA E INSTANCIA UN NUEVO OBJETO DE TIPO MEMENTO
    {
        return new Memento(cedula, nombre, apellido, direccion, correo, telefono, estado, sueldo, fechaNacimiento);

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}

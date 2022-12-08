/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

import Datos.DAOVigilante;

import Modelos.Vigilante;
import Vistas.VGestionVigilante;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Date;

public class ControladorVigilante implements ActionListener {

    private final VGestionVigilante vvigilante;

    public ControladorVigilante() {

        vvigilante = new VGestionVigilante();

        // Botones de la vista
        this.vvigilante.btnBuscar.addActionListener(this);
        this.vvigilante.btnAgregar.addActionListener(this);
        this.vvigilante.btnLimpiar.addActionListener(this);
        this.vvigilante.btnEliminar.addActionListener(this);
        this.vvigilante.btnModificar.addActionListener(this);
        this.vvigilante.btnVolver.addActionListener(this);
        this.vvigilante.btnMinimizar.addActionListener(this);
        this.vvigilante.btnSalir.addActionListener(this);

        // Inicializamos los JTextField
        vvigilante.txtCedula.setEditable(true);
        vvigilante.txtNombre.setEditable(false);
        vvigilante.txtApellido.setEditable(false);
        vvigilante.txtDireccion.setEditable(false);
        vvigilante.txtCorreo.setEditable(false);
        vvigilante.txtSueldo.setEditable(false);
        vvigilante.txtTelefono.setEditable(false);

        // Inicializamos el JDateChooser
        vvigilante.jDateFechaNaci.setEnabled(false);

        // Inhabilitamos el boton "Agregar"
        vvigilante.btnAgregar.setEnabled(false);

        // Botones
        vvigilante.btnModificar.setEnabled(false);
        vvigilante.btnEliminar.setEnabled(false);

        // Muestra el Jframe      
        vvigilante.setVisible(true);
        vvigilante.setLocationRelativeTo(null);
    }

    // Metodo Buscar
    public void Buscar() {
        String cedula = vvigilante.txtCedula.getText();

        //COMPARA SI ESTA VACIO EL TEXT-FIELD 
        if (cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la cedula del vigilante ");
            return;
        }
        Vigilante vigi = new DAOVigilante().Buscar(cedula);
        if (vigi == null) {
            //JOptionPane.showMessageDialog(null, "Vigilante No encontrado"); 
            int confirmar = JOptionPane.showConfirmDialog(null, " No existe ningun vigilante con esta cedula, desea agregarlo?");

            if (confirmar == JOptionPane.YES_OPTION) {
                System.out.println("Entrada");
                //HABILITAMOS EL BOTON AGREGAR 
                vvigilante.btnAgregar.setEnabled(true);
                // HABILITAMOS LOS JTEXTFIELD 
                vvigilante.txtCedula.setEditable(false);
                vvigilante.txtNombre.setEditable(true);
                vvigilante.txtApellido.setEditable(true);
                vvigilante.txtDireccion.setEditable(true);
                vvigilante.txtCorreo.setEditable(true);
                vvigilante.txtSueldo.setEditable(true);
                vvigilante.txtTelefono.setEditable(true);
                // INICIALIZAMOS el JDateChooser 
                vvigilante.jDateFechaNaci.setEnabled(true);

                System.out.println("Salida");
            }
            return;
        }

        // Muestra los datos en los txt 
        vvigilante.txtCedula.setEditable(false);
        vvigilante.txtNombre.setText(vigi.getNombre());
        vvigilante.txtApellido.setText(vigi.getApellido());
        vvigilante.txtDireccion.setText(vigi.getDireccion());
        vvigilante.txtCorreo.setText(vigi.getCorreo());
        vvigilante.txtTelefono.setText(vigi.getTelefono());

        String Sueldo = String.valueOf(vigi.getSueldo());
        vvigilante.txtSueldo.setText(Sueldo);
        vvigilante.jDateFechaNaci.setDate(vigi.getFechaNacimiento());

        //NO SE EXPLICARLO :b 
        vvigilante.btnModificar.setEnabled(true);
        vvigilante.btnEliminar.setEnabled(true);
        vvigilante.txtCedula.setEditable(false);
        vvigilante.txtNombre.setEditable(true);
        vvigilante.txtApellido.setEditable(true);
        vvigilante.txtDireccion.setEditable(true);
        vvigilante.txtCorreo.setEditable(true);
        vvigilante.txtSueldo.setEditable(true);
        vvigilante.txtTelefono.setEditable(true);
        // INICIALIZAMOS el JDateChooser 
        vvigilante.jDateFechaNaci.setEnabled(true);
        vvigilante.btnAgregar.setEnabled(false);

    }

    public void Registrar() {

        String cedula = vvigilante.txtCedula.getText();
        String nombre = vvigilante.txtNombre.getText();
        String apellidos = vvigilante.txtApellido.getText();
        String direccion = vvigilante.txtDireccion.getText();
        String telefono = vvigilante.txtTelefono.getText();
        String correo = vvigilante.txtCorreo.getText();
        Date fecha = vvigilante.jDateFechaNaci.getDate();

        long d = fecha.getTime();
        java.sql.Date fechaNacimiento = new java.sql.Date(d);
        Double sueldo = Double.parseDouble(vvigilante.txtSueldo.getText());

        if (cedula.equals("") || nombre.equals("") || apellidos.equals("") || telefono.equals("") || direccion.equals("") || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }

        Vigilante nuevoVigilante = new DAOVigilante().Agregar(cedula, nombre, apellidos, direccion, correo, telefono, fechaNacimiento, sueldo, "A");

        if (nuevoVigilante == null) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el nuevo Vigilante");
            return;
        }
        JOptionPane.showMessageDialog(null, "Nuevo Vigilante Registrado");

        Limpiar();
    }

    public void Limpiar() {
        vvigilante.txtCedula.setText("");
        vvigilante.txtNombre.setText("");
        vvigilante.txtApellido.setText("");
        vvigilante.txtDireccion.setText("");
        vvigilante.txtTelefono.setText("");
        vvigilante.txtCorreo.setText("");
        vvigilante.txtSueldo.setText("");
        vvigilante.jDateFechaNaci.setCalendar(null);
        vvigilante.txtCedula.setEditable(true);
        vvigilante.btnModificar.setEnabled(false);
        vvigilante.btnEliminar.setEnabled(false);
        vvigilante.btnAgregar.setEnabled(false);
        vvigilante.jDateFechaNaci.setEnabled(false);
        vvigilante.txtNombre.setEditable(false);
        vvigilante.txtApellido.setEditable(false);
        vvigilante.txtDireccion.setEditable(false);
        vvigilante.txtCorreo.setEditable(false);
        vvigilante.txtSueldo.setEditable(false);
        vvigilante.txtTelefono.setEditable(false);
    }

    public void Eliminar() {

        String cedula = vvigilante.txtCedula.getText();

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está Seguro de Eliminar?");

        if (confirmar == JOptionPane.YES_OPTION) {
            new DAOVigilante().Eliminar(cedula);
            JOptionPane.showMessageDialog(null, "La informacion del vigilante ha sido eliminada satisfacctoriamente ");
            Limpiar();
        }
    }

    public void Modificar() {

        String cedula = vvigilante.txtCedula.getText();
        String nombre = vvigilante.txtNombre.getText();
        String apellidos = vvigilante.txtApellido.getText();
        String direccion = vvigilante.txtDireccion.getText();
        String telefono = vvigilante.txtTelefono.getText();
        String correo = vvigilante.txtCorreo.getText();
        Date fecha = vvigilante.jDateFechaNaci.getDate();
        long d = fecha.getTime();
        java.sql.Date fechaNacimiento = new java.sql.Date(d);
        Double sueldo = Double.parseDouble(vvigilante.txtSueldo.getText());

        if (cedula.equals("") || nombre.equals("") || apellidos.equals("") || telefono.equals("") || direccion.equals("") || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(null, "Los datos del vigilante seran modificados, desea continuar?");

        if (confirmar == JOptionPane.YES_OPTION) {
            System.out.println("Entrada");
            new DAOVigilante().Modificar(cedula, nombre, apellidos, direccion, correo, telefono, fechaNacimiento, sueldo);
            JOptionPane.showMessageDialog(null, "La informacion del vigilante ha sido modificada con exito");
            Limpiar();
            System.out.println("Salida");
        }
    }

    /*
     private boolean validarcampos() {
        boolean estado = false;

        if (vvigilante.txtCedula.getText().length() < 8) {
            Mensajes.mvacio("Ingrese un numero de cedula valido", "Error", vvigilante.txtCedula);
        } else if (vvigilante.txtNombre.getText().isEmpty()) {
            Mensajes.mvacio("Ingrese Nombre", "Error", vvigilante.txtNombre);
        } else if (vvigilante.txtApellido.getText().isEmpty()) {
            Mensajes.mvacio("Ingrese Apellido", "Error", vvigilante.txtApellido);
        } else if (vvigilante.txtDireccion.getText().isEmpty() || vvigilante.txtDireccion.getText().length() < 4) {
            Mensajes.mvacio("Ingrese una Direccion valida", "Error", vvigilante.txtDireccion);
        } else if (vvigilante.txtTelefono.getText().isEmpty() || vvigilante.txtTelefono.getText().length() < 5) {
            Mensajes.mvacio("Ingrese Nro de telefono valido", "Error", vvigilante.txtTelefono);
        } else if (vvigilante.txtCorreo.getText().isEmpty()) {
            Mensajes.mvacio("Ingrese un Correo electronico", "Error", vvigilante.txtCorreo);
        } else {
            estado = true;
        }

        return estado;

    }
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vvigilante.btnBuscar) {
            Buscar();
        }
        if (e.getSource() == vvigilante.btnAgregar) {
            Registrar();
        }

        if (e.getSource() == vvigilante.btnLimpiar) {
            Limpiar();
        }

        if (e.getSource() == vvigilante.btnEliminar) {
            Eliminar();
        }

        /*  Boton Modificar.
            Ejecuta el metodo de modificación
         */
        if (e.getSource() == vvigilante.btnModificar) {
            Modificar();
        }

        /*  Boton Volver.
            Cierra la Vista Vigilante
            Regresa al Menu Principal
         */
        if (e.getSource() == vvigilante.btnVolver) {
            vvigilante.dispose();
            new ControladorMenuPrincipal();
        }

        /*  Boton Minimizar.
            Minimiza la vista actual
         */
        if (e.getSource() == vvigilante.btnMinimizar) {
            vvigilante.setExtendedState(ICONIFIED);
        }

        /*  Boton Salir.
            Cierra el programa
         */
        if (e.getSource() == vvigilante.btnSalir) {
            System.exit(0);
        }
    }
}

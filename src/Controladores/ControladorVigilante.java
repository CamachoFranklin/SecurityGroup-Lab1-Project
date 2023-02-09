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
import Memento.*;
import Modelos.Vigilante;
import Vistas.VGestionVigilante;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.List;

public class ControladorVigilante implements ActionListener {

    private final VGestionVigilante vvigilante;
    private Vigilante vigi;
    private Originator creator;
    private Caretaker care;

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
        this.vvigilante.btnDeshacer.addActionListener(this);

        // Evento de de los txt
        this.vvigilante.txtCedula.addKeyListener(kl);
        this.vvigilante.txtNombre.addKeyListener(kl);
        this.vvigilante.txtApellido.addKeyListener(kl);
        this.vvigilante.txtDireccion.addKeyListener(kl);
        this.vvigilante.txtCorreo.addKeyListener(kl);
        this.vvigilante.txtTelefono.addKeyListener(kl);
        this.vvigilante.txtSueldo.addKeyListener(kl);
        this.vvigilante.jDateFechaNaci.addKeyListener(kl);

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
        vvigilante.btnDeshacer.setEnabled(false);
        // Muestra el Jframe      
        vvigilante.setVisible(true);
        vvigilante.setLocationRelativeTo(null);
    }
    KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            //Evalua solamente letras y numeros
        }

        @Override
        public void keyPressed(KeyEvent e) //Programamos los eventos para cuando se presiona una tecla en los textfield
        {
            // presiono un boton 
            if (vvigilante.txtNombre == e.getSource()) {
                String cadena = vvigilante.txtNombre.getText();
                if (!cadena.matches("^[a-zA-Z]{1,40}$")) {
                    vvigilante.txtNombre.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vvigilante.txtApellido == e.getSource()) {
                String cadena = vvigilante.txtApellido.getText();
                if (!cadena.matches("^[a-zA-Z]{1,40}$")) {
                    vvigilante.txtApellido.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vvigilante.txtTelefono == e.getSource()) {
                String cadena = vvigilante.txtTelefono.getText();
                if (!cadena.matches("^[0-9]{1,11}$")) {
                    vvigilante.txtTelefono.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vvigilante.txtSueldo == e.getSource()) {
                String cadena = vvigilante.txtSueldo.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vvigilante.txtSueldo.setText(cadena.replaceFirst(".$", ""));
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) //Programamos los eventos para cuando se suelta una tecla en los textfield
        {
            //presiono soltamos el boton

            if (vvigilante.txtNombre == e.getSource()) {
                String cadena = vvigilante.txtNombre.getText();
                if (!cadena.matches("^[a-zA-Z]{1,40}$")) {
                    vvigilante.txtNombre.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vvigilante.txtApellido == e.getSource()) {
                String cadena = vvigilante.txtApellido.getText();
                if (!cadena.matches("^[a-zA-Z]{1,40}$")) {
                    vvigilante.txtApellido.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vvigilante.txtTelefono == e.getSource()) {
                String cadena = vvigilante.txtTelefono.getText();
                if (!cadena.matches("^[0-9]{1,11}$")) {
                    vvigilante.txtTelefono.setText(cadena.replaceFirst(".$", ""));
                }
            }
            if (vvigilante.txtSueldo == e.getSource()) {
                String cadena = vvigilante.txtSueldo.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vvigilante.txtSueldo.setText(cadena.replaceFirst(".$", ""));
                }
            }
        }
    };

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
                vvigilante.btnDeshacer.setEnabled(false);
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
        vvigilante.btnDeshacer.setEnabled(false);

        restaurarDatos(vigi.getCedula(), vigi.getNombre(), vigi.getApellido(), vigi.getDireccion(), vigi.getCorreo(), vigi.getTelefono(), vigi.getEstado(), vigi.getSueldo(), vigi.getFechaNacimiento());
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
        //Limpia la informacion de los textfield y regresa los botones a su estado inicial
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
            vvigilante.btnDeshacer.setEnabled(true);
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

    public void restaurarDatos(String cedula, String nombre, String apellido, String direccion, String correo, String telefono, String estado, double sueldo, Date fechaNacimiento) {

        //Creamos el objeto Originador
        creator = new Originator(cedula, nombre, apellido, direccion, correo, telefono, estado, sueldo, fechaNacimiento);
        //Creamos Caretaker
        care = new Caretaker();

        //Creamos el Memento y vinculamos al objeto que va a gestionarlo
        care.setMemento(creator.cearMemento());
    }

    public void Desmontar() {
        // Obtiene los datos del objeto
        creator.setMemento(care.getMemento());
        vvigilante.txtCedula.setText(creator.getCedula());
        vvigilante.txtNombre.setText(creator.getNombre());
        vvigilante.txtApellido.setText(creator.getApellido());
        vvigilante.txtDireccion.setText(creator.getDireccion());
        vvigilante.txtCorreo.setText(creator.getCorreo());
        String Sueldo = String.valueOf(creator.getSueldo());
        vvigilante.txtSueldo.setText(Sueldo);
        vvigilante.jDateFechaNaci.setDate(creator.getFechaNacimiento());

        vigi = new DAOVigilante().Buscar(creator.getCedula());

        if (vigi != null) {

            ActualizarDesmontar();

        } else {
            RegistroDesmontar();
        }
    }

    public void ActualizarDesmontar() {
        String cedula = vvigilante.txtCedula.getText();
        String nombre = vvigilante.txtNombre.getText();
        String apellido = vvigilante.txtApellido.getText();
        String direccion = vvigilante.txtDireccion.getText();
        String correo = vvigilante.txtCorreo.getText();
        String telefono = vvigilante.txtTelefono.getText();
        Double sueldo = Double.parseDouble(vvigilante.txtSueldo.getText());

        Date fecha = vvigilante.jDateFechaNaci.getDate();
        long d = fecha.getTime();
        java.sql.Date fechaNacimiento = new java.sql.Date(d);
        new DAOVigilante().Modificar(cedula, nombre, apellido, direccion, correo, telefono, fechaNacimiento, sueldo);
    }

    public void RegistroDesmontar() {

        String cedula = vvigilante.txtCedula.getText();
        String nombre = vvigilante.txtNombre.getText();
        String apellido = vvigilante.txtApellido.getText();
        String direccion = vvigilante.txtDireccion.getText();
        String correo = vvigilante.txtCorreo.getText();
        String telefono = vvigilante.txtTelefono.getText();
        Double sueldo = Double.parseDouble(vvigilante.txtSueldo.getText());
        Date fecha = vvigilante.jDateFechaNaci.getDate();
        long d = fecha.getTime();
        java.sql.Date fechaNacimiento = new java.sql.Date(d);

        Vigilante vigi = new DAOVigilante().Agregar(cedula, nombre, apellido, direccion, correo, telefono, fechaNacimiento, sueldo, "A");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vvigilante.btnBuscar) {
            Buscar();
        }
        if (e.getSource() == vvigilante.btnAgregar) {

            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();

            if (!vvigilante.txtSueldo.getText().matches("^[0-9]+([\\.][0-9]*)?$") || vvigilante.txtSueldo.getText().equals("") || vvigilante.txtSueldo.getText().equals("0")) {
                listaErrores.add("No haz introducido un sueldo.");
            }
            if (!vvigilante.txtTelefono.getText().matches("^[0-9]{11,11}$") || vvigilante.txtTelefono.getText().equals("")) {
                listaErrores.add("No haz introducido un numero de telefono o esta incompleto.");
            }
            if (!vvigilante.txtNombre.getText().matches("^[a-zA-Z]{1,40}$") || vvigilante.txtNombre.getText().equals("")) {
                listaErrores.add("No haz introducido un nombre.");
            }
            if (!vvigilante.txtApellido.getText().matches("^[a-zA-Z]{1,40}$") || vvigilante.txtApellido.getText().equals("")) {
                listaErrores.add("No haz introducido un apellido.");
            }
            if (vvigilante.txtDireccion.getText().equals("")) {
                listaErrores.add("No haz introducido una direccion.");
            }
            if (!vvigilante.txtCorreo.getText().matches("^(([^<>()\\[\\]\\\\.,;:\\s@”]+(\\.[^<>()\\[\\]\\\\.,;:\\s@”]+)*)|(“.+”))@((\\[[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}])|(([a-zA-Z\\-0–9]+\\.)+[a-zA-Z]{2,}))$") || vvigilante.txtCorreo.getText().equals("")) {
                listaErrores.add("El correo no es valido o esta vacio.");
            }
            if (vvigilante.jDateFechaNaci.getDate() == null) {
                listaErrores.add("No haz introducido una fecha.");
            }

            if (listaErrores.isEmpty()) {
                Registrar();
            } else {

                String errores = "";

                for (int i = 0; i < listaErrores.toArray().length; i++) {
                    errores += "* ";
                    errores += (String) listaErrores.get(i);
                    errores += "\n";
                }

                JOptionPane.showMessageDialog(null, "No cumples los parametros.\nVerifica los errores a continuación:\n\n" + errores);
            }
        }

        if (e.getSource() == vvigilante.btnLimpiar) {
            Limpiar();
        }

        if (e.getSource() == vvigilante.btnEliminar) {
            Eliminar();
        }

        if (e.getSource() == vvigilante.btnDeshacer) {
            Desmontar();
        }

        if (e.getSource() == vvigilante.btnModificar) {
            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();

            if (!vvigilante.txtSueldo.getText().matches("^[0-9]+([\\.][0-9]*)?$") || vvigilante.txtSueldo.getText().equals("") || vvigilante.txtSueldo.getText().equals("0")) {
                listaErrores.add("No haz introducido un sueldo.");
            }
            if (!vvigilante.txtTelefono.getText().matches("^[0-9]{11,11}$") || vvigilante.txtTelefono.getText().equals("")) {
                listaErrores.add("No haz introducido un numero de telefono o esta incompleto.");
            }
            if (!vvigilante.txtNombre.getText().matches("^[a-zA-Z]{1,40}$") || vvigilante.txtNombre.getText().equals("")) {
                listaErrores.add("No haz introducido un nombre.");
            }
            if (!vvigilante.txtApellido.getText().matches("^[a-zA-Z]{1,40}$") || vvigilante.txtApellido.getText().equals("")) {
                listaErrores.add("No haz introducido un apellido.");
            }
            if (vvigilante.txtDireccion.getText().equals("")) {
                listaErrores.add("No haz introducido una direccion.");
            }
            if (!vvigilante.txtCorreo.getText().matches("^(([^<>()\\[\\]\\\\.,;:\\s@”]+(\\.[^<>()\\[\\]\\\\.,;:\\s@”]+)*)|(“.+”))@((\\[[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}])|(([a-zA-Z\\-0–9]+\\.)+[a-zA-Z]{2,}))$") || vvigilante.txtCorreo.getText().equals("")) {
                listaErrores.add("El correo no es valido o esta vacio.");
            }
            if (vvigilante.jDateFechaNaci.getDate() == null) {
                listaErrores.add("No haz introducido una fecha.");
            }

            if (listaErrores.isEmpty()) {
                Modificar();
            } else {

                String errores = "";

                for (int i = 0; i < listaErrores.toArray().length; i++) {
                    errores += "* ";
                    errores += (String) listaErrores.get(i);
                    errores += "\n";
                }

                JOptionPane.showMessageDialog(null, "No cumples los parametros.\nVerifica los errores a continuación:\n\n" + errores);
            }
        }

        if (e.getSource() == vvigilante.btnVolver) {
            vvigilante.dispose();
            new ControladorMenuPrincipal();
        }

        if (e.getSource() == vvigilante.btnMinimizar) {
            vvigilante.setExtendedState(ICONIFIED);
        }

        if (e.getSource() == vvigilante.btnSalir) {
            System.exit(0);
        }
    }
}

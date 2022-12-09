/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

import Datos.DAOCliente;
import Modelos.Cliente;
import Vistas.VGestionCliente;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener {

    private final VGestionCliente vcliente;

    public ControladorCliente() {
        //Se instancia la vista de cliente
        vcliente = new VGestionCliente();

        // Botones de la vista
        this.vcliente.btnBuscar.addActionListener(this);
        this.vcliente.btnAgregar.addActionListener(this);
        this.vcliente.btnLimpiar.addActionListener(this);
        this.vcliente.btnEliminar.addActionListener(this);
        this.vcliente.btnModificar.addActionListener(this);
        this.vcliente.btnVolver.addActionListener(this);
        // Campo de la llave primaria
        vcliente.txtNombre.setEditable(true);
        // Se desactivan los botones
        vcliente.btnModificar.setEnabled(false);
        vcliente.btnEliminar.setEnabled(false);
        vcliente.btnAgregar.setEnabled(false);
        // Muestra el JFrame     
        vcliente.setVisible(true);
        vcliente.setLocationRelativeTo(null);

        // Labels de la vista
        vcliente.lblEdificio.setVisible(false);
        vcliente.lblUrbanizacion.setVisible(false);
        vcliente.lblTienda.setVisible(false);

        // Se desactivan los campos de textos
        vcliente.txtNombre.setEnabled(false);
        vcliente.txtDescripcion.setEnabled(false);
        vcliente.txtTelefono.setEnabled(false);
        vcliente.txtDireccion.setEnabled(false);
        vcliente.cbxTipoCliente.setEnabled(false);
       
    }

    //METODO BUSCAR
    public void Buscar() {

        String rif = vcliente.txtRif.getText();

        //COMPARA SI ESTA VACIO EL TEXT-FIELD
        if (rif.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Escribir el rif");
            return;
        }
        Cliente clie = new DAOCliente().Buscar(rif);
        if (clie == null) {
            JOptionPane.showMessageDialog(null, "Cliente No encontrado, registre la informacion");
            vcliente.txtNombre.setEnabled(true);
            vcliente.btnAgregar.setEnabled(true);
            vcliente.txtRif.setEnabled(false);
        vcliente.txtDescripcion.setEnabled(true);
        vcliente.txtTelefono.setEnabled(true);
        vcliente.txtDireccion.setEnabled(true);
        vcliente.cbxTipoCliente.setEnabled(true);
            return;
        }
        vcliente.txtNombre.setEnabled(true);
        vcliente.txtDescripcion.setEnabled(true);
        vcliente.txtTelefono.setEnabled(true);
        vcliente.txtDireccion.setEnabled(true);
        vcliente.cbxTipoCliente.setEnabled(true);
        // Muestra los datos en los txt
        vcliente.txtRif.setEnabled(false);
        vcliente.txtNombre.setText(clie.getNombre());
        vcliente.txtDescripcion.setText(clie.getDescripcion());
        vcliente.txtTelefono.setText(clie.getTelefono());

        vcliente.txtDireccion.setText(clie.getDireccion());
        if (clie.getTipoCliente().equals("Edificio")) {
            vcliente.cbxTipoCliente.setSelectedIndex(1);
            vcliente.lblEdificio.setVisible(true);
        } else if ("Urbanizacion".equals(clie.getTipoCliente())) {
            vcliente.cbxTipoCliente.setSelectedIndex(2);
            vcliente.lblUrbanizacion.setVisible(true);
        } else if ("Tienda".equals(clie.getTipoCliente())) {
            vcliente.cbxTipoCliente.setSelectedIndex(3);
            vcliente.lblTienda.setVisible(true);
        } else {
            vcliente.cbxTipoCliente.setSelectedIndex(0);
            vcliente.lblEdificio.setVisible(false);
            vcliente.lblUrbanizacion.setVisible(false);
            vcliente.lblTienda.setVisible(false);
        }

        //ACTIVA LOS BOTONES
        vcliente.btnModificar.setEnabled(true);
        vcliente.btnEliminar.setEnabled(true);
        
        // se activa el combobox
        vcliente.cbxTipoCliente.setEnabled(true);

    }

    public void Registrar() {
        String rif = vcliente.txtRif.getText();
        String nombre = vcliente.txtNombre.getText();
        String descripcion = vcliente.txtDescripcion.getText();
        String telefono = vcliente.txtTelefono.getText();
        String direccion = vcliente.txtDireccion.getText();
        String tipoCliente = vcliente.getCbxTipoCliente().getSelectedItem().toString();

        if (rif.equals("") || nombre.equals("") || descripcion.equals("") || telefono.equals("") || direccion.equals("") || tipoCliente.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }
        Cliente nuevoCliente = new DAOCliente().Agregar(rif, nombre, descripcion, telefono, direccion, tipoCliente, "A");
        if (nuevoCliente == null) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el nuevo Cliente");
            return;
        }
        JOptionPane.showMessageDialog(null, "Nuevo Cliente Registrado");

        // se limpian los campos y se cierra la ventana 
        vcliente.txtRif.setText("");
        vcliente.txtNombre.setText("");
        vcliente.txtDescripcion.setText("");
        vcliente.txtDireccion.setText("");
        vcliente.txtTelefono.setText("");
        vcliente.txtDireccion.setText("");
        vcliente.cbxTipoCliente.setSelectedIndex(0);
    }

    public void Limpiar() {
        vcliente.txtRif.setText("");
        vcliente.txtNombre.setText("");
        vcliente.txtDescripcion.setText("");
        vcliente.txtTelefono.setText("");
        vcliente.txtDireccion.setText("");
        vcliente.cbxTipoCliente.setSelectedIndex(0);
        vcliente.btnModificar.setEnabled(false);
        vcliente.btnEliminar.setEnabled(false);
        vcliente.txtRif.setEnabled(true);
        vcliente.lblEdificio.setVisible(false);
        vcliente.lblUrbanizacion.setVisible(false);
        vcliente.lblTienda.setVisible(false);
        vcliente.txtNombre.setEnabled(false);
        vcliente.txtDescripcion.setEnabled(false);
        vcliente.txtTelefono.setEnabled(false);
        vcliente.txtDireccion.setEnabled(false);
        vcliente.cbxTipoCliente.setEnabled(false);
    }

    /*  Metodo Eliminar.
        Metodo usado para eliminar un cliente de la BD
     */
    public void Eliminar() {

        // Se declara una variable local rif para almacenar el texto tipeado
        String rif = vcliente.txtRif.getText();

        // Se crea un panel de mensaje para consultar si el usuario esta seguro de realizar la eliminacion del cliente
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Estas Seguro de Eliminar?");

        // Si la respuesta es afirmativa
        if (confirmar == JOptionPane.YES_OPTION) {
            // Se realiza uso del metodo eliminar del DAO cliente
            new DAOCliente().Eliminar(rif);
            // se muestra el mensaje de eliminacion
            JOptionPane.showMessageDialog(null, "Eliminado");
            // se limpian los campos de la vista
            Limpiar();
        }
        return;
    }

    /*  Metodo Modificar.
        Metodo usado para realizar una modificacion en la tabla Clientes
     */
    public void Modificar() {

        //  Declaracion de variables para la insercion.
        String rif = vcliente.txtRif.getText();
        String nombre = vcliente.txtNombre.getText();
        String descripcion = vcliente.txtDescripcion.getText();
        String telefono = vcliente.txtTelefono.getText();
        String direccion = vcliente.txtDireccion.getText();
        String tipocliente = vcliente.getCbxTipoCliente().getSelectedItem().toString();

        //  Validacion de campos no nulos y combobox con opcion seleccionada
        if (rif.equals("") || nombre.equals("") || descripcion.equals("") || telefono.equals("") || direccion.equals("") || tipocliente.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }

        //  Si los campos no son nulos y el combobox tiene seleccionada una opcion.
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Modificar los datos Actuales ?");

        //  Si se presiona SI en la ventana emergente
        if (confirmar == JOptionPane.YES_OPTION) {

            //  Se realiza la insercion con el metodo creado en el DAO
            new DAOCliente().Modificar(rif, nombre, descripcion, telefono, direccion, tipocliente, "A");

            // Se muestra el mensaje informando la insercion exitosa
            JOptionPane.showMessageDialog(null, "Modificado");

            //  Se limpian los campos de la vista
            Limpiar();
        }
    }

    @Override
    // Metodos de acciones de los botones de la vista
    public void actionPerformed(ActionEvent e) {
        /*  Boton Buscar.
            Si se da click en dicho boton se ejecuta el metodo creado en el controlador
         */
        if (e.getSource() == vcliente.btnBuscar) {
            Buscar();
        }
        /*  Boton Agregar.
            Si se da click en dicho boton se ejecuta el metodo de insercion creado en el controlador
         */
        if (e.getSource() == vcliente.btnAgregar) {
            Registrar();
        }
        /*  Boton Limpiar.
            Si se da click en dicho boton se ejecuta el metodo Limpiar creado en el controlador
         */
        if (e.getSource() == vcliente.btnLimpiar) {
            Limpiar();
        }
        /*  Boton Eliminar.
            Si se da click en dicho boton se ejecuta el metodo Eliminar creado en el controlador
         */
        if (e.getSource() == vcliente.btnEliminar) {
            Eliminar();
        }
        /*  Boton Modificar.
            Si se da click en dicho boton se ejecuta el metodo Modificar creado en el controlador
         */
        if (e.getSource() == vcliente.btnModificar) {
            Modificar();
        }

        /*  Boton Volver.
            Cierra la Vista Cliente
            Regresa al Menu Principal
         */
        if (e.getSource() == vcliente.btnVolver) {
            vcliente.dispose();
            new ControladorMenuPrincipal();
        }

        /*  Boton Minimizar.
            Minimiza la vista actual
         */
        if (e.getSource() == vcliente.btnMinimizar) {
            vcliente.setExtendedState(ICONIFIED);
        }

        /*  Boton Salir.
            Cierra el programa
         */
        if (e.getSource() == vcliente.btnSalir) {
            System.exit(0);
        }
    }
}

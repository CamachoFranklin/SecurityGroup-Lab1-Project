/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

import Datos.DAOHerramienta;
import Modelos.Herramienta;
import Vistas.VHerramientas;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorHerramienta implements ActionListener {

    private final VHerramientas vherra;
    private final Herramienta herra;

    public ControladorHerramienta() {
        vherra = new VHerramientas();
        herra = new Herramienta();
        // evento de los botones
        this.vherra.btnAgregar.addActionListener(this);
        this.vherra.btnModificar.addActionListener(this);
        this.vherra.btnLimpiar.addActionListener(this);
        this.vherra.btnEliminar.addActionListener(this);
        this.vherra.jComboBoxTipo.addActionListener(this);
        this.vherra.btnRestar.addActionListener(this);
        this.vherra.btnAceptar.addActionListener(this);
        this.vherra.btnVolver.addActionListener(this);
        this.vherra.btnMinimizar.addActionListener(this);
        this.vherra.btnSalir.addActionListener(this);
        // Evento de de los txt
        this.vherra.txtCantidad.addKeyListener(kl);
        this.vherra.txtCantidadDisponible.addKeyListener(kl);
        this.vherra.txtPrecioMantenimiento.addKeyListener(kl);
        this.vherra.txtPrecioAlquiler.addKeyListener(kl);

        vherra.txtCantidad.setEditable(true);
        vherra.btnModificar.setEnabled(false);
        vherra.btnEliminar.setEnabled(false);
        vherra.txtPrecioMantenimiento.setEnabled(false);
        vherra.txtPrecioAlquiler.setEnabled(false);
        vherra.txtCantidadDisponible.setEnabled(false);
        vherra.setVisible(true);
        vherra.setLocationRelativeTo(null);
        vherra.btnRestar.setEnabled(false);
        vherra.btnAceptar.setEnabled(false);
        vherra.lblRadio.setVisible(false);
        vherra.lblBicicleta.setVisible(false);
        vherra.btnAgregar.setEnabled(false);
    }

    public void RegistrarCantidad() {
        int cantidadAgregar = Integer.parseInt(vherra.txtCantidad.getText());
        int cantidad = Integer.parseInt(vherra.txtCantidadDisponible.getText());
        String tipoHerramienta = vherra.getCbxTipoHerramienta().getSelectedItem().toString();
        double mantenimiento = Double.parseDouble(vherra.txtPrecioMantenimiento.getText());
        double precio = Double.parseDouble(vherra.txtPrecioAlquiler.getText());
        int cantidadTotal = cantidadAgregar + cantidad;

        if (tipoHerramienta.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "El campo agregar es obligatorio");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea agregar mas herramientas disponibles ?");

        if (confirmar == JOptionPane.YES_OPTION) {
            new DAOHerramienta().Modificar(cantidadTotal, tipoHerramienta, mantenimiento, precio, "A");
            JOptionPane.showMessageDialog(null, "Se han agregado");
            Limpiar();
        }
    }

    KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }
//Programamos los eventos para cuando se presiona una tecla en los textfield

        @Override
        public void keyPressed(KeyEvent e) {
            if (vherra.txtCantidad == e.getSource()) {
                String cadena = vherra.txtCantidad.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vherra.txtCantidad.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vherra.txtCantidadDisponible == e.getSource()) {
                String cadena = vherra.txtCantidadDisponible.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vherra.txtCantidadDisponible.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vherra.txtPrecioMantenimiento == e.getSource()) {
                String cadena = vherra.txtPrecioMantenimiento.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vherra.txtPrecioMantenimiento.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vherra.txtPrecioAlquiler == e.getSource()) {
                String cadena = vherra.txtPrecioAlquiler.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vherra.txtPrecioAlquiler.setText(cadena.replaceFirst(".$", ""));
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) //Programamos los eventos para cuando se suelta una tecla en los textfield
        {
            if (vherra.txtCantidad == e.getSource()) {
                String cadena = vherra.txtCantidad.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vherra.txtCantidad.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vherra.txtCantidadDisponible == e.getSource()) {
                String cadena = vherra.txtCantidadDisponible.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vherra.txtCantidadDisponible.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vherra.txtPrecioMantenimiento == e.getSource()) {
                String cadena = vherra.txtPrecioMantenimiento.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vherra.txtPrecioMantenimiento.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vherra.txtPrecioAlquiler == e.getSource()) {
                String cadena = vherra.txtPrecioAlquiler.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vherra.txtPrecioAlquiler.setText(cadena.replaceFirst(".$", ""));
                }
            }
        }
    };

    public void ModificarPrecios() {

        int cantidad = Integer.parseInt(vherra.txtCantidadDisponible.getText());
        String tipoHerramienta = vherra.getCbxTipoHerramienta().getSelectedItem().toString();
        double mantenimiento = Double.parseDouble(vherra.txtPrecioMantenimiento.getText());
        double precio = Double.parseDouble(vherra.txtPrecioAlquiler.getText());

        if (tipoHerramienta.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "El campo agregar es obligatorio");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Modificar los precios ?");

        if (confirmar == JOptionPane.YES_OPTION) {
            new DAOHerramienta().Modificar(cantidad, tipoHerramienta, mantenimiento, precio, "A");
            JOptionPane.showMessageDialog(null, "Modificado");
            Limpiar();
        }
    }

    public void EliminarCantidad() {

        int cantidadAgregar = Integer.parseInt(vherra.txtCantidad.getText());
        int cantidad = Integer.parseInt(vherra.txtCantidadDisponible.getText());
        String tipoHerramienta = vherra.getCbxTipoHerramienta().getSelectedItem().toString();
        double mantenimiento = Double.parseDouble(vherra.txtPrecioMantenimiento.getText());
        double precio = Double.parseDouble(vherra.txtPrecioAlquiler.getText());
        int cantidadTotal = cantidad - cantidadAgregar;

        if (tipoHerramienta.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "El campo agregar es obligatorio");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar la cantidad de herramientas seleccionadas ?");
        if (cantidadTotal < 0) {
            JOptionPane.showMessageDialog(null, "La cantidad que desea eliminar, no puede ser mayor a la cantidad disponible");
            return;
        }

        if (confirmar == JOptionPane.YES_OPTION) {
            new DAOHerramienta().Modificar(cantidadTotal, tipoHerramienta, mantenimiento, precio, "A");
            JOptionPane.showMessageDialog(null, "Se ha eliminado la cantidad de herramientas");
            Limpiar();
        }
    }

    public void Buscar() {

        String tipoHerramientas = vherra.getCbxTipoHerramienta().getSelectedItem().toString();

        //COMPARA SI ESTA VACIO EL TEXT-FIELD
        Herramienta he = new DAOHerramienta().Buscar(tipoHerramientas);

        if (tipoHerramientas.equals("Radio")) {

            vherra.txtCantidadDisponible.setText(Integer.toString(he.getCantidad()));
            vherra.txtPrecioAlquiler.setText(String.valueOf(he.getPrecio()));
            vherra.txtPrecioMantenimiento.setText(String.valueOf(he.getMantenimiento()));

        } else if (tipoHerramientas.equals("Bicicleta")) {
            vherra.txtCantidadDisponible.setText(String.valueOf(he.getCantidad()));
            vherra.txtPrecioAlquiler.setText(String.valueOf(he.getPrecio()));
            vherra.txtPrecioMantenimiento.setText(String.valueOf(he.getMantenimiento()));
        } else {
            return;
        }

        vherra.btnModificar.setEnabled(true);
        vherra.btnEliminar.setEnabled(true);
    }

    public void Limpiar() {
        vherra.txtCantidad.setText("");
        vherra.txtCantidadDisponible.setText("");
        vherra.txtPrecioAlquiler.setText("");
        vherra.txtPrecioMantenimiento.setText("");
        vherra.jComboBoxTipo.setSelectedIndex(0);
        vherra.lblBicicleta.setVisible(false);
        vherra.lblRadio.setVisible(false);
        vherra.txtCantidad.setEditable(true);
        vherra.btnModificar.setEnabled(false);
        vherra.btnEliminar.setEnabled(false);
        vherra.txtPrecioMantenimiento.setEnabled(false);
        vherra.txtPrecioAlquiler.setEnabled(false);
        vherra.txtCantidadDisponible.setEnabled(false);
        vherra.jComboBoxTipo.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vherra.btnAgregar) {

            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();
            if (!vherra.txtCantidad.getText().matches("^[0-9]+$") || vherra.txtCantidad.getText().equals("") || vherra.txtCantidad.getText().equals("0")) {
                listaErrores.add("No haz introducido una cantidad a sumar.");
            }

            if (listaErrores.isEmpty()) {
                RegistrarCantidad();
                vherra.btnRestar.setEnabled(false);
                vherra.btnAceptar.setEnabled(false);
                vherra.btnEliminar.setEnabled(false);
                vherra.btnModificar.setEnabled(false);
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
        if (e.getSource() == vherra.btnLimpiar) {
            Limpiar();
            vherra.btnRestar.setEnabled(false);
            vherra.btnAceptar.setEnabled(false);
            vherra.btnAgregar.setEnabled(false);
            vherra.btnEliminar.setEnabled(false);
        }

        if (e.getSource() == vherra.jComboBoxTipo) {
            String tipoHerramientas = vherra.getCbxTipoHerramienta().getSelectedItem().toString();
            if ("Seleccionar".equals(tipoHerramientas)) {
                vherra.txtCantidad.setText("");
                vherra.txtCantidadDisponible.setText("");
                vherra.txtPrecioAlquiler.setText("");
                vherra.txtPrecioMantenimiento.setText("");

                vherra.btnAgregar.setEnabled(false);
                vherra.btnEliminar.setEnabled(false);
                vherra.txtCantidad.setEnabled(false);
                vherra.btnModificar.setEnabled(false);

                vherra.lblRadio.setVisible(false);
                vherra.lblRadio.setVisible(false);

            }
            if ("Radio".equals(tipoHerramientas)) {
                Buscar();
                vherra.btnAgregar.setEnabled(true);
                vherra.btnEliminar.setEnabled(true);
                vherra.txtCantidad.setEnabled(true);
                vherra.btnModificar.setEnabled(true);
                vherra.lblRadio.setVisible(true);
                vherra.lblBicicleta.setVisible(false);
            }
            if ("Bicicleta".equals(tipoHerramientas)) {
                Buscar();
                vherra.btnAgregar.setEnabled(true);
                vherra.btnEliminar.setEnabled(true);
                vherra.txtCantidad.setEnabled(true);
                vherra.btnModificar.setEnabled(true);
                vherra.lblRadio.setVisible(false);
                vherra.lblBicicleta.setVisible(true);
            }
        }
        /*  Boton Modificar.
            Permite modificar el precio de mantenimiento
            Permite modificar el precio de alquiler
            Activa el boton "Aceptar"
         */
        if (e.getSource() == vherra.btnModificar) {
            vherra.txtPrecioMantenimiento.setEnabled(true);
            vherra.txtPrecioAlquiler.setEnabled(true);
            vherra.btnAceptar.setEnabled(true);
            vherra.txtCantidad.setEnabled(false);
            vherra.btnRestar.setEnabled(false);
            vherra.btnAgregar.setEnabled(false);
            vherra.btnEliminar.setEnabled(false);
            vherra.btnModificar.setEnabled(false);
            vherra.jComboBoxTipo.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Se ha habilitado la opcion de modificar ambos precios");
        }
        // Boton Aceptar. Se usa para aceptar la modificación realizada
        if (e.getSource() == vherra.btnAceptar) {

            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();
            if (!vherra.txtPrecioAlquiler.getText().matches("^[0-9]+([\\.][0-9]*)?$") || vherra.txtPrecioAlquiler.getText().equals("") || vherra.txtPrecioAlquiler.getText().equals("0")) {
                listaErrores.add("El valor no puede ser nulo o cero en el precio del alquiler");
            }
            if (!vherra.txtPrecioMantenimiento.getText().matches("^[0-9]+([\\.][0-9]*)?$") || vherra.txtPrecioMantenimiento.getText().equals("") || vherra.txtPrecioMantenimiento.getText().equals("0")) {
                listaErrores.add("El valor no puede ser nulo o cero en el precio del mantenimiento");
            }

            if (listaErrores.isEmpty()) {
                ModificarPrecios();
                vherra.btnAceptar.setEnabled(false);
                vherra.txtPrecioAlquiler.setEnabled(false);
                vherra.btnAceptar.setEnabled(false);
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

        /*  Boton Restar.
            Se usa para confirmar la eliminación
            Se resta cantidad total - cantidad a eliminar
            Desactiva el botón
            Desactiva el Campo de texto de cantidad a eliminar 
         */
        if (e.getSource() == vherra.btnRestar) {
            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();
            if (!vherra.txtCantidad.getText().matches("^[0-9]+$") || vherra.txtCantidad.getText().equals("") || vherra.txtCantidad.getText().equals("0")) {
                listaErrores.add("No haz introducido una cantidad a restar.");
            }

            if (listaErrores.isEmpty()) {
                EliminarCantidad();
                vherra.btnRestar.setEnabled(false);
                vherra.txtCantidad.setEnabled(false);
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

        /*  Boton Eliminar.
            Se usa para habilitar los campos cantidad a restar
         */
        if (e.getSource() == vherra.btnEliminar) {
            vherra.txtPrecioMantenimiento.setEnabled(false);
            vherra.txtPrecioAlquiler.setEnabled(false);
            vherra.txtCantidad.setEnabled(true);
            vherra.btnRestar.setEnabled(true);
            vherra.txtCantidadDisponible.setEnabled(false);
            vherra.btnAceptar.setEnabled(false);
            vherra.btnModificar.setEnabled(false);
            vherra.btnAgregar.setEnabled(false);
            vherra.btnEliminar.setEnabled(false);
            vherra.jComboBoxTipo.setEnabled(false);
            JOptionPane.showMessageDialog(null, "En la casilla de cantidad, coloque la cantidad a eliminar");
        }

        /*  Boton Volver.
            Regresa al Menu Principal
         */
        if (e.getSource() == vherra.btnVolver) {
            vherra.dispose();
            new ControladorMenuPrincipal();
        }

        /*  Boton Minimizar.
            Minimiza la pantalla
         */
        if (e.getSource() == vherra.btnMinimizar) {
            vherra.setExtendedState(ICONIFIED);
        }

        /*  Boton Salir.
            Cierra la aplicación
         */
        if (e.getSource() == vherra.btnSalir) {
            System.exit(0);
        }
    }
}

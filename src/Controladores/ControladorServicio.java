/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

import Datos.DAOServicio;
import Datos.DAOCliente;
import Datos.DAOHerramienta;
import Modelos.*;
import Vistas.*;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorServicio implements ActionListener {

    private final VServicio vservicio;
    private final Servicio servicio;
    private final Ubicacion ubi;
    //  private Herramienta herra;

    public ControladorServicio() {

        vservicio = new VServicio();
        servicio = new Servicio();
        ubi = new Ubicacion();
        // herra = new Herramienta();

        // Evento de de los botones
        this.vservicio.btnBuscarServicio.addActionListener(this);
        this.vservicio.btnLimpiar.addActionListener(this);
        this.vservicio.btnEliminar.addActionListener(this);
        this.vservicio.btnFacturar.addActionListener(this);
        this.vservicio.btnCalcular.addActionListener(this);
        this.vservicio.btnVolver.addActionListener(this);
        this.vservicio.btnMinimizar.addActionListener(this);
        this.vservicio.btnSalir.addActionListener(this);
        this.vservicio.btnBuscarR.addActionListener(this);

        // Evento de de los txt
        this.vservicio.txtCodigoServicio.addKeyListener(kl);
        this.vservicio.txtCantBicicletas.addKeyListener(kl);
        this.vservicio.txtCantRadios.addKeyListener(kl);
        this.vservicio.txtMontoPorVigilante.addKeyListener(kl);

        vservicio.txtCodigoServicio.setEditable(true);
        vservicio.txtCantBicicletas.setEditable(false);
        vservicio.txtCantRadios.setEditable(false);
        vservicio.txtCosto.setEditable(false);
        vservicio.txtRif.setEditable(false);
        vservicio.txtMontoPorVigilante.setEditable(false);
        vservicio.txtDescripcion.setEditable(false);
        vservicio.txtNombreC.setEditable(false);

        vservicio.btnBuscarR.setEnabled(false);
        vservicio.btnEliminar.setEnabled(false);
        vservicio.btnLimpiar.setEnabled(true);
        vservicio.btnFacturar.setEnabled(false);
        vservicio.btnCalcular.setEnabled(false);

        vservicio.rbtnSiServicio.setEnabled(false);
        vservicio.rbtnNoServicio.setEnabled(false);

        vservicio.cbbFechaInicio.setEnabled(false);
        vservicio.cbbVigilantesPorTurno.setEnabled(false);

        //MUESTRA EL JFRAME      
        vservicio.setVisible(true);
        vservicio.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null, "Ingrese el codigo del servicio");
    }

    KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }
//Programamos los eventos para cuando se presiona una tecla en los textfield

        @Override
        public void keyPressed(KeyEvent e) {
            if (vservicio.txtCodigoServicio == e.getSource()) {
                String cadena = vservicio.txtCodigoServicio.getText();
                if (!cadena.matches("^[\\s\\S]{1,50}$")) {
                    vservicio.txtCodigoServicio.setText(cadena.replaceFirst(".$", ""));
                }
            }

            if (vservicio.txtCantBicicletas == e.getSource()) {
                String cadena = vservicio.txtCantBicicletas.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vservicio.txtCantBicicletas.setText(cadena.replaceFirst(".$", ""));
                }
            }
            if (vservicio.txtCantRadios == e.getSource()) {
                String cadena = vservicio.txtCantRadios.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vservicio.txtCantRadios.setText(cadena.replaceFirst(".$", ""));
                }
            }
            if (vservicio.txtMontoPorVigilante == e.getSource()) {
                String cadena = vservicio.txtMontoPorVigilante.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vservicio.txtMontoPorVigilante.setText(cadena.replaceFirst(".$", ""));
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) //Programamos los eventos para cuando se suelta una tecla en los textfield
        {
            if (vservicio.txtCodigoServicio == e.getSource()) {
                String cadena = vservicio.txtCodigoServicio.getText();
                if (!cadena.matches("^[\\s\\S]{1,50}$")) {
                    vservicio.txtCodigoServicio.setText(cadena.replaceFirst(".$", ""));
                }
            }
            if (vservicio.txtCantBicicletas == e.getSource()) {
                String cadena = vservicio.txtCantBicicletas.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vservicio.txtCantBicicletas.setText(cadena.replaceFirst(".$", ""));
                }
            }
            if (vservicio.txtCantRadios == e.getSource()) {
                String cadena = vservicio.txtCantRadios.getText();
                if (!cadena.matches("^[0-9]+$")) {
                    vservicio.txtCantRadios.setText(cadena.replaceFirst(".$", ""));
                }
            }
            if (vservicio.txtMontoPorVigilante == e.getSource()) {
                String cadena = vservicio.txtMontoPorVigilante.getText();
                if (!cadena.matches("^[0-9]+([\\.][0-9]*)?$")) {
                    vservicio.txtMontoPorVigilante.setText(cadena.replaceFirst(".$", ""));
                }
            }
        }
    };

    //METODO BUSCAR
    public void Buscar() {

        String id = vservicio.txtCodigoServicio.getText();

        //COMPARA SI ESTA VACIO EL TEXT-FIELD
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Escribir el Codigo del servicio");
            return;
        }
        Servicio servi = new DAOServicio().Buscar(id);
        if (servi == null) {
            JOptionPane.showMessageDialog(null, "Servicio No encontrado");

            int confirmar = JOptionPane.showConfirmDialog(null, "¿Deseas Crear un Nuevo servicio");

            if (confirmar == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Rellene la informacion y coloque el RIF");
                vservicio.btnBuscarR.setEnabled(false);
                vservicio.btnBuscarR.setEnabled(false);
                vservicio.btnBuscarR.setEnabled(true);
                vservicio.btnLimpiar.setEnabled(true);
                vservicio.btnCalcular.setEnabled(false);

                vservicio.txtCodigoServicio.setEnabled(false);
                vservicio.txtRif.setEditable(true);
                vservicio.txtMontoPorVigilante.setEditable(true);
                vservicio.txtDescripcion.setEditable(true);

                vservicio.cbbFechaInicio.setEnabled(true);
                vservicio.cbbVigilantesPorTurno.setEnabled(true);
            }
            return;
        }
        JOptionPane.showMessageDialog(null, "Ya se ha creado el servicio");
        vservicio.btnEliminar.setEnabled(true);
        vservicio.btnBuscarR.setEnabled(false);
        vservicio.txtCodigoServicio.setEditable(false);
        vservicio.txtDescripcion.setText(servi.getDescripcion());
        vservicio.cbbVigilantesPorTurno.setSelectedItem(servi.getCantidadvigi());
        vservicio.cbbFechaInicio.setSelectedItem(servi.getFechaInicio());
        vservicio.cbbVigilantesPorTurno.setSelectedItem(String.valueOf(servi.getCantidadvigi()));
        vservicio.txtCantBicicletas.setText(String.valueOf(servi.getCantidadbici()));
        vservicio.txtCantRadios.setText(String.valueOf(servi.getCantidadradio()));
        vservicio.txtRif.setText(servi.getRif());
        Cliente clie = new DAOCliente().Buscar(servi.getRif());
        vservicio.txtNombreC.setText(clie.getNombre());
        vservicio.txtCosto.setText((String.valueOf(servi.getCosto())));
        vservicio.txtMontoPorVigilante.setText((String.valueOf(servi.getMonto())));
        if (servi.getCantidadbici() == 0 || servi.getCantidadradio() == 0) {
            vservicio.rbtnNoServicio.setSelected(true);
        }
    }

    public void BuscarCliente() {

        String rif = vservicio.txtRif.getText();

        //COMPARA SI ESTA VACIO EL TEXT-FIELD
        if (rif.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Escribir el rif");
            return;
        }
        Cliente clie = new DAOCliente().Buscar(rif);
        if (clie == null) {
            JOptionPane.showMessageDialog(null, "Cliente No encontrado");
            return;
        }
        JOptionPane.showMessageDialog(null, "Rellene la informacion y calcule el costo");
        vservicio.btnCalcular.setEnabled(true);
        vservicio.btnBuscarR.setEnabled(false);
        vservicio.txtRif.setEditable(false);
        vservicio.rbtnSiServicio.setEnabled(true);
        vservicio.rbtnNoServicio.setEnabled(true);
        vservicio.txtNombreC.setText(clie.getNombre());
        String tipo = clie.getTipoCliente();
        if (vservicio.rbtnSiServicio.isEnabled() && tipo.equals("Urbanizacion")) {
            vservicio.txtCantBicicletas.setEditable(true);
        } else if (vservicio.rbtnSiServicio.isEnabled() && (tipo.equals("Edificio") || tipo.equals("Tienda"))) {
            vservicio.txtCantRadios.setEditable(true);
        }
    }

    public void Calcular() {
        if (vservicio.txtCantBicicletas.getText().equals("")) {
            vservicio.txtCantBicicletas.setText("0");
        }
        if (vservicio.txtCantRadios.getText().equals("")) {
            vservicio.txtCantRadios.setText("0");
        }
        if (vservicio.txtCantBicicletas.getText().equals("") || vservicio.txtCantRadios.getText().equals("") || vservicio.txtMontoPorVigilante.getText().equals("") || vservicio.cbbVigilantesPorTurno.getSelectedItem().toString().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
            return;
        }
        JOptionPane.showMessageDialog(null, "Para continuar con el servicio, oprima el boton de crear");
        Herramienta nuevaherra = new DAOHerramienta().Buscar("Bicicleta");
        double preciobici = nuevaherra.getPrecio();
        Herramienta nuevaherra1 = new DAOHerramienta().Buscar("Radio");
        double precioradio = nuevaherra1.getPrecio();
        // Se almacena la cantidad de vigilantes en la variable cantv
        int cantv = Integer.parseInt(vservicio.cbbVigilantesPorTurno.getSelectedItem().toString());
        int cantradio = Integer.parseInt(vservicio.txtCantRadios.getText());
        int cantbici = Integer.parseInt(vservicio.txtCantBicicletas.getText());
        double preciovigi = Double.parseDouble(vservicio.txtMontoPorVigilante.getText());

        double costo = ((preciobici * cantbici) + (precioradio * cantradio) + (cantv * preciovigi));
        vservicio.txtCosto.setText(String.valueOf(costo));
        vservicio.btnFacturar.setEnabled(true);
    }

    public void Limpiar() {
        JOptionPane.showMessageDialog(null, "Ingrese el codigo del servicio");
        vservicio.txtCodigoServicio.setText("");
        vservicio.txtCantBicicletas.setText("0");
        vservicio.txtCantRadios.setText("0");
        vservicio.txtCosto.setText("");
        vservicio.txtRif.setText("");
        vservicio.txtMontoPorVigilante.setText("");
        vservicio.txtDescripcion.setText("");
        vservicio.txtNombreC.setText("");
        vservicio.cbbFechaInicio.setSelectedIndex(0);
        vservicio.cbbVigilantesPorTurno.setSelectedIndex(0);

        vservicio.txtCodigoServicio.setEditable(true);
        vservicio.txtCodigoServicio.setEnabled(true);
        vservicio.txtCantBicicletas.setEditable(false);
        vservicio.txtCantRadios.setEditable(false);
        vservicio.txtCosto.setEditable(false);
        vservicio.txtRif.setEditable(false);
        vservicio.txtMontoPorVigilante.setEditable(false);
        vservicio.txtDescripcion.setEditable(false);
        vservicio.txtNombreC.setEditable(false);

        vservicio.btnBuscarR.setEnabled(true);
        vservicio.btnBuscarR.setEnabled(false);
        vservicio.btnEliminar.setEnabled(false);
        vservicio.btnLimpiar.setEnabled(true);
        vservicio.btnFacturar.setEnabled(false);
        vservicio.btnCalcular.setEnabled(false);
        vservicio.btnBuscarR.setEnabled(true);

        vservicio.rbtnSiServicio.setEnabled(false);
        vservicio.rbtnNoServicio.setEnabled(false);

        vservicio.cbbFechaInicio.setEnabled(false);
        vservicio.cbbVigilantesPorTurno.setEnabled(false);
    }

    public void Eliminar() {

        String cod = vservicio.txtCodigoServicio.getText();

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Estas Seguro de Eliminar?");

        if (confirmar == JOptionPane.YES_OPTION) {

            new DAOServicio().Eliminar(cod);
            JOptionPane.showMessageDialog(null, "Eliminado");
            Limpiar();
        }
        return;
    }

    public void Registrar() {

        String cod = vservicio.txtCodigoServicio.getText();
        String des = vservicio.txtDescripcion.getText();
        String fecha = vservicio.cbbFechaInicio.getSelectedItem().toString();
        String rif = vservicio.txtRif.getText();
        int cant = Integer.parseInt(vservicio.cbbVigilantesPorTurno.getSelectedItem().toString());
        int cantbici = Integer.parseInt(vservicio.txtCantBicicletas.getText());
        int cantradio = Integer.parseInt(vservicio.txtCantRadios.getText());
        double costo = Double.parseDouble(vservicio.txtCosto.getText());
        double monto = Double.parseDouble(vservicio.txtMontoPorVigilante.getText());
        Herramienta nuevaherra = new DAOHerramienta().Buscar("Bicicleta");
        double preciobici = nuevaherra.getPrecio();
        Herramienta nuevaherra1 = new DAOHerramienta().Buscar("Radio");
        double precioradio = nuevaherra1.getPrecio();

        if (rif.equals("") || des.equals("") || fecha.equals("") || rif.equals("") || vservicio.txtCantBicicletas.getText().equals("") || vservicio.txtCantBicicletas.getText().equals("")
                || vservicio.txtCantRadios.getText().equals("") || vservicio.txtCosto.getText().equals("") || vservicio.txtMontoPorVigilante.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }
        Servicio nuevoServicio = new DAOServicio().Agregar(cod, des, fecha, rif, cant, cantbici, cantradio, costo, monto, preciobici, precioradio, "A");
        if (nuevoServicio == null) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Servicio");
            return;
        }
        JOptionPane.showMessageDialog(null, "Nuevo servicio registrado");
        Limpiar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vservicio.btnBuscarServicio) {
            Buscar();
        }
        if (e.getSource() == vservicio.btnCalcular) {
            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();

            if (!vservicio.txtMontoPorVigilante.getText().matches("^[0-9]+([\\.][0-9]*)?$") || vservicio.txtMontoPorVigilante.getText().equals("") || vservicio.txtMontoPorVigilante.getText().equals("0")) {
                listaErrores.add("El valor no puede ser nulo o cero en el monto por vigilante");
            }

            if (listaErrores.isEmpty()) {
                Calcular();
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

        if (e.getSource() == vservicio.btnBuscarR) {
            BuscarCliente();
        }
        if (e.getSource() == vservicio.btnLimpiar) {
            Limpiar();
        }
        if (e.getSource() == vservicio.btnFacturar) {
            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();

            if (vservicio.txtDescripcion.getText().equals("")) {
                listaErrores.add("No haz introducido una Descripcion.");
            }
            if (vservicio.cbbFechaInicio.getSelectedIndex() <= 0) {
                listaErrores.add("No haz seleccionado un mes.");
            }
            if (vservicio.cbbVigilantesPorTurno.getSelectedIndex() <= 0) {
                listaErrores.add("No haz seleccionado la cantidad de vigilantes por turno.");
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
        if (e.getSource() == vservicio.btnEliminar) {
            Eliminar();
        }
        /*  Boton Volver.
            Cierra la Vista Servicio
            Regresa al Menu Principal
         */
        if (e.getSource() == vservicio.btnVolver) {
            vservicio.dispose();
            new ControladorMenuPrincipal();
        }

        /*  Boton Minimizar.
            Minimiza la vista actual
         */
        if (e.getSource() == vservicio.btnMinimizar) {
            vservicio.setExtendedState(ICONIFIED);
        }

        /*  Boton Salir.
            Cierra el programa
         */
        if (e.getSource() == vservicio.btnSalir) {
            System.exit(0);
        }
    }
}

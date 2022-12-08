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

        this.vservicio.btnBuscarR.addActionListener(this);
        this.vservicio.btnLimpiar.addActionListener(this);
        this.vservicio.btnEliminar.addActionListener(this);
        this.vservicio.btnFacturar.addActionListener(this);
        this.vservicio.btnCalcular.addActionListener(this);
        this.vservicio.btnVolver.addActionListener(this);
        this.vservicio.btnMinimizar.addActionListener(this);
        this.vservicio.btnSalir.addActionListener(this);
        
        vservicio.txtCodigo.setEditable(true);
        vservicio.txtCantBicicletas.setEditable(false);
        vservicio.txtCantRadios.setEditable(false);
        vservicio.txtCosto.setEditable(false);
        vservicio.txtRif.setEditable(false);
        vservicio.txtmonto.setEditable(false);
        vservicio.txtDescripcion.setEditable(false);
        vservicio.txtNombreC.setEditable(false);

        vservicio.btnBuscarR.setEnabled(false);
        vservicio.btnEliminar.setEnabled(false);
        vservicio.btnLimpiar.setEnabled(true);
        vservicio.btnFacturar.setEnabled(false);
        vservicio.btnCalcular.setEnabled(false);

        vservicio.jRadioButtonSiServicio.setEnabled(false);
        vservicio.jRadioButtonNoServicio.setEnabled(false);

        vservicio.jComboBoxMes.setEnabled(false);
        vservicio.jComboBoxVigilantes.setEnabled(false);

        //MUESTRA EL JFRAME      
        vservicio.setVisible(true);
        vservicio.setLocationRelativeTo(null);
    }

    //METODO BUSCAR
    public void Buscar() {

        String id = vservicio.txtCodigo.getText();

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

                vservicio.btnBuscarR.setEnabled(false);

                vservicio.btnBuscarR.setEnabled(true);
                vservicio.btnLimpiar.setEnabled(true);
                vservicio.btnFacturar.setEnabled(true);
                vservicio.btnCalcular.setEnabled(false);

                vservicio.txtCodigo.setEnabled(false);
                vservicio.txtRif.setEditable(true);
                vservicio.txtmonto.setEditable(true);
                vservicio.txtDescripcion.setEditable(true);

                vservicio.btnFacturar.setEnabled(true);

                vservicio.jComboBoxMes.setEnabled(true);
                vservicio.jComboBoxVigilantes.setEnabled(true);
                vservicio.btnCalcular.setEnabled(true);
            }
            return;
        }
        vservicio.btnEliminar.setEnabled(true);
        vservicio.btnBuscarR.setEnabled(false);
        vservicio.txtCodigo.setEditable(false);
        vservicio.txtDescripcion.setText(servi.getDescripcion());
        vservicio.jComboBoxVigilantes.setSelectedItem(servi.getCantidadvigi());
        vservicio.jComboBoxMes.setSelectedItem(servi.getFechaInicio());
        vservicio.jComboBoxVigilantes.setSelectedItem(String.valueOf(servi.getCantidadvigi()));
        vservicio.txtCantBicicletas.setText(String.valueOf(servi.getCantidadbici()));
        vservicio.txtCantRadios.setText(String.valueOf(servi.getCantidadradio()));
        vservicio.txtRif.setText(servi.getRif());
        Cliente clie = new DAOCliente().Buscar(servi.getRif());
        vservicio.txtNombreC.setText(clie.getNombre());
        vservicio.txtCosto.setText((String.valueOf(servi.getCosto())));
        vservicio.txtmonto.setText((String.valueOf(servi.getMonto())));
        if (servi.getCantidadbici() == 0 || servi.getCantidadradio() == 0) {
            vservicio.jRadioButtonNoServicio.setSelected(true);
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
        vservicio.btnBuscarR.setEnabled(false);
        vservicio.txtRif.setEditable(false);
        vservicio.jRadioButtonSiServicio.setEnabled(true);
        vservicio.jRadioButtonNoServicio.setEnabled(true);
        vservicio.txtNombreC.setText(clie.getNombre());
        String tipo = clie.getTipoCliente();
        if (vservicio.jRadioButtonSiServicio.isEnabled() && tipo.equals("Urbanizacion")) {
            vservicio.txtCantBicicletas.setEditable(true);
        } else if (vservicio.jRadioButtonSiServicio.isEnabled() && (tipo.equals("Edificio") || tipo.equals("Tienda"))) {
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
        if (vservicio.txtCantBicicletas.getText().equals("") || vservicio.txtCantRadios.getText().equals("") || vservicio.txtmonto.getText().equals("") || vservicio.jComboBoxVigilantes.getSelectedItem().toString().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
            return;
        }
        Herramienta nuevaherra = new DAOHerramienta().Buscar("Bicicleta");
        double preciobici = nuevaherra.getPrecio();
        Herramienta nuevaherra1 = new DAOHerramienta().Buscar("Radio");
        double precioradio = nuevaherra1.getPrecio();
        int cantv = Integer.parseInt(vservicio.jComboBoxVigilantes.getSelectedItem().toString());
        double preciovigi = Double.parseDouble(vservicio.txtmonto.getText());
        double costo = (preciobici + precioradio + cantv * preciovigi);
        vservicio.txtCosto.setText(String.valueOf(costo));
    }

    public void Limpiar() {

        vservicio.txtCodigo.setText("");
        vservicio.txtCantBicicletas.setText("0");
        vservicio.txtCantRadios.setText("0");
        vservicio.txtCosto.setText("");
        vservicio.txtRif.setText("");
        vservicio.txtmonto.setText("");
        vservicio.txtDescripcion.setText("");
        vservicio.txtNombreC.setText("");
        vservicio.jComboBoxMes.setSelectedIndex(0);
        vservicio.jComboBoxVigilantes.setSelectedIndex(0);

        vservicio.txtCodigo.setEditable(true);
        vservicio.txtCodigo.setEnabled(true);
        vservicio.txtCantBicicletas.setEditable(false);
        vservicio.txtCantRadios.setEditable(false);
        vservicio.txtCosto.setEditable(false);
        vservicio.txtRif.setEditable(false);
        vservicio.txtmonto.setEditable(false);
        vservicio.txtDescripcion.setEditable(false);
        vservicio.txtNombreC.setEditable(false);

        vservicio.btnBuscarR.setEnabled(true);
        vservicio.btnBuscarR.setEnabled(false);
        vservicio.btnEliminar.setEnabled(false);
        vservicio.btnLimpiar.setEnabled(true);
        vservicio.btnFacturar.setEnabled(false);
        vservicio.btnCalcular.setEnabled(false);

        vservicio.jRadioButtonSiServicio.setEnabled(false);
        vservicio.jRadioButtonNoServicio.setEnabled(false);

        vservicio.jComboBoxMes.setEnabled(false);
        vservicio.jComboBoxVigilantes.setEnabled(false);
    }

    public void Eliminar() {

        String cod = vservicio.txtCodigo.getText();

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Estas Seguro de Eliminar?");

        if (confirmar == JOptionPane.YES_OPTION) {

            new DAOCliente().Eliminar(cod);
            JOptionPane.showMessageDialog(null, "Eliminado");
            Limpiar();

        }
        return;

    }

    public void Registrar() {

        String cod = vservicio.txtCodigo.getText();
        String des = vservicio.txtDescripcion.getText();
        String fecha = vservicio.jComboBoxMes.getSelectedItem().toString();
        String rif = vservicio.txtRif.getText();
        int cant = Integer.parseInt(vservicio.jComboBoxVigilantes.getSelectedItem().toString());
        int cantbici = Integer.parseInt(vservicio.txtCantBicicletas.getText());
        int cantradio = Integer.parseInt(vservicio.txtCantRadios.getText());
        double costo = Double.parseDouble(vservicio.txtCosto.getText());
        double monto = Double.parseDouble(vservicio.txtmonto.getText());
        Herramienta nuevaherra = new DAOHerramienta().Buscar("Bicicleta");
        double preciobici = nuevaherra.getPrecio();
        Herramienta nuevaherra1 = new DAOHerramienta().Buscar("Radio");
        double precioradio = nuevaherra1.getPrecio();

        if (rif.equals("") || des.equals("") || fecha.equals("") || rif.equals("") || vservicio.txtCantBicicletas.getText().equals("") || vservicio.txtCantBicicletas.getText().equals("")
                || vservicio.txtCantRadios.getText().equals("") || vservicio.txtCosto.getText().equals("") || vservicio.txtmonto.getText().equals("")) {
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
        if (e.getSource() == vservicio.btnBuscarR) {
            Buscar();
        }
        if (e.getSource() == vservicio.btnCalcular) {
            Calcular();
        }

        if (e.getSource() == vservicio.btnBuscarR) {
            BuscarCliente();
        }
        if (e.getSource() == vservicio.btnLimpiar) {
            Limpiar();
        }
        if (e.getSource() == vservicio.btnFacturar) {
            Registrar();
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

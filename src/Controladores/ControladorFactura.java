/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

import Datos.DAOFactura;
import Datos.DAOServicio;
import Modelos.Factura;
import Modelos.Servicio;
import Vistas.VFactura;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import Datos.DAOHerramienta;
import Modelos.Herramienta;
import java.util.ArrayList;
import java.util.List;

public class ControladorFactura implements ActionListener {

    private final Servicio servi;
    private final VFactura vfac;

    public ControladorFactura() {
        vfac = new VFactura();
        servi = new Servicio();
        this.vfac.btnbuscar.addActionListener(this);
        this.vfac.btnAgregar.addActionListener(this);
        this.vfac.btnVolver.addActionListener(this);
        this.vfac.btnMinimizar.addActionListener(this);
        this.vfac.btnSalir.addActionListener(this);
        this.vfac.btnLimpiar.addActionListener(this);
        vfac.setVisible(true);
        vfac.setLocationRelativeTo(null);
        vfac.txtnumfac.setText(getRandomString(4));
        vfac.txtCantidadBicicletas.setEditable(false);
        vfac.txtCantidadRadios.setEditable(false);
        vfac.txtCantidadVigilantes.setEditable(false);
        vfac.txtDescripcion.setEditable(false);
        vfac.txtMantenimientoBicicletas.setEditable(false);
        vfac.txtMantenimientoRadio.setEditable(false);
        vfac.txtPrecioAdicional.setEditable(false);
        vfac.txtPrecioServicio.setEditable(false);
        vfac.txtSubTotal.setEditable(false);
        vfac.txtTotal.setEditable(false);
        vfac.txtnumfac.setEditable(false);
        vfac.txtpreciounitario.setEditable(false);
        vfac.txtRif.setEditable(false);
        vfac.jDateChooserfecha.setEnabled(false);
    }

    //METODO BUSCAR
    public void Buscar() {

        String rif = vfac.txtcodigo.getText();

        //COMPARA SI ESTA VACIO EL TEXT-FIELD
        if (rif.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Escribir el Codigo");
            return;
        }
        Servicio serv = new DAOServicio().Buscar(rif);
        if (serv == null) {
            JOptionPane.showMessageDialog(null, "Servicio No encontrado");

            return;
        }

        // Muestra los datos en los txt
        vfac.txtRif.setText(serv.getRif());
        vfac.txtDescripcion.setText(serv.getDescripcion());
        vfac.txtCantidadVigilantes.setText(String.valueOf(serv.getCantidadvigi()));
        vfac.txtpreciounitario.setText(String.valueOf(serv.getMonto()));
        vfac.txtCantidadRadios.setText(String.valueOf(serv.getCantidadradio()));
        vfac.txtCantidadBicicletas.setText(String.valueOf(serv.getCantidadbici()));
        vfac.btnbuscar.setEnabled(false);
        vfac.jDateChooserfecha.setEnabled(true);
        Herramienta nuevaherra = new DAOHerramienta().Buscar("Bicicleta");
        double mantebici = nuevaherra.getMantenimiento();
        Herramienta nuevaherra1 = new DAOHerramienta().Buscar("Radio");
        double manteradio = nuevaherra1.getMantenimiento();
        vfac.txtMantenimientoBicicletas.setText(String.valueOf(mantebici));
        vfac.txtMantenimientoRadio.setText(String.valueOf(manteradio));

        Double PrecioServ = serv.getCantidadvigi() * serv.getMonto();
        vfac.txtPrecioServicio.setText(String.valueOf(PrecioServ));

        Double PrecioAdi = (serv.getPreciobici() * serv.getCantidadbici()) + (serv.getCantidadradio() * serv.getPrecioradio() + manteradio + mantebici);

        vfac.txtPrecioAdicional.setText(String.valueOf(PrecioAdi));
        Double SubTotal = PrecioServ + PrecioAdi;
        vfac.txtSubTotal.setText(String.valueOf(SubTotal));
        vfac.txtTotal.setText(String.valueOf(SubTotal));
        vfac.txtcodigo.setEditable(false);
    }

    public void Registrar() {
        String numfactura = vfac.txtnumfac.getText();
        String idservicio = vfac.txtcodigo.getText();

        Date fecha = vfac.jDateChooserfecha.getDate();
        long d = fecha.getTime();
        java.sql.Date fecha2 = new java.sql.Date(d);

        Double montot = Double.valueOf(vfac.txtTotal.getText());
        String rif = vfac.txtRif.getText();

        if (numfactura.equals("") || idservicio.equals("") || fecha2.equals("") || montot.equals("") || rif.equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }
        Factura fact = new DAOFactura().Agregar(numfactura, idservicio, fecha2, montot, rif, "A");
        if (fact == null) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la factura");
            return;
        }
        vfac.jDateChooserfecha.setEnabled(false);
        vfac.btnAgregar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Nueva Factura Registrada");
    }

    // GENERA CODIGOS ALEATORIOS
    static String getRandomString(int i) {
        String theAlphaNumericS;
        StringBuilder builder;

        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";

        //create the StringBuffer
        builder = new StringBuilder(i);

        for (int m = 0; m < i; m++) {

            // generate numeric
            int myindex
                    = (int) (theAlphaNumericS.length()
                    * Math.random());

            // add the characters
            builder.append(theAlphaNumericS
                    .charAt(myindex));
        }

        return builder.toString();
    }

    public void Limpiar() {
        vfac.txtRif.setText("");
        vfac.txtcodigo.setEditable(true);
        vfac.txtCantidadBicicletas.setText("");
        vfac.txtCantidadRadios.setText("");
        vfac.txtCantidadVigilantes.setText("");
        vfac.txtDescripcion.setText("");
        vfac.txtMantenimientoBicicletas.setText("");
        vfac.txtMantenimientoRadio.setText("");
        vfac.txtPrecioAdicional.setText("");
        vfac.txtPrecioServicio.setText("");
        vfac.txtSubTotal.setText("");
        vfac.txtTotal.setText("");
        vfac.txtnumfac.setText("");
        vfac.txtpreciounitario.setText("");
        vfac.txtcodigo.setText("");
        vfac.btnbuscar.setEnabled(true);
        vfac.jDateChooserfecha.setCalendar(null);
        vfac.jDateChooserfecha.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vfac.btnbuscar) {
            Buscar();
        }
        if (e.getSource() == vfac.btnAgregar) {
            //Validamos los textfield, para que se introduzcan los datos correspodientes, agredando los errores a un array
            List listaErrores = new ArrayList();

            if (vfac.jDateChooserfecha.getDate() == null) {
                listaErrores.add("No haz introducido la fecha de la factura.");
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
        if (e.getSource() == vfac.btnLimpiar) {
            Limpiar();
        }

        /*  Boton Volver.
            Cierra la Vista Cliente
            Regresa al Menu Principal
         */
        if (e.getSource() == vfac.btnVolver) {
            vfac.dispose();
            new ControladorMenuPrincipal();
        }

        /*  Boton Minimizar.
            Minimiza la vista actual
         */
        if (e.getSource() == vfac.btnMinimizar) {
            vfac.setExtendedState(ICONIFIED);
        }

        /*  Boton Salir.
            Cierra el programa
         */
        if (e.getSource() == vfac.btnSalir) {
            System.exit(0);
        }
    }
}

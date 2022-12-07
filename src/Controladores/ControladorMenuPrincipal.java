/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

// Se importan las views que se van a utilizar
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenuPrincipal implements ActionListener {

    private final VMenuPrincipal vmp;

    public ControladorMenuPrincipal() {
        vmp = new VMenuPrincipal();
        vmp.setVisible(true);
        vmp.setLocationRelativeTo(null);
        this.vmp.btnCliente.addActionListener(this);
        this.vmp.btnVigilante.addActionListener(this);
        this.vmp.btnHerramientas.addActionListener(this);
        this.vmp.btnServicios.addActionListener(this);
        this.vmp.btnFacturacion.addActionListener(this);
        this.vmp.btnReportes.addActionListener(this);
        this.vmp.btnConsultas.addActionListener(this);
        this.vmp.btnVolver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Botón Gestion clientes. Abre la vista gestión de clientes.
        if (e.getSource() == vmp.btnCliente) {
            vmp.dispose();
            new ControladorCliente();
        }

        //Botón Gestion vigilantes. Abre la vista gestión de vigilantes.
        if (e.getSource() == vmp.btnVigilante) {
            vmp.dispose();
            new ControladorVigilante();
        }

        //Botón Gestion Herramientas. Abre la vista gestión de Herramientas.
        if (e.getSource() == vmp.btnHerramientas) {
            vmp.dispose();
            VHerramientas vh = new VHerramientas();
            vh.setVisible(true);
        }

        //Botón Gestion Servicios. Abre la vista gestión de Servicios.
        if (e.getSource() == vmp.btnServicios) {
            vmp.dispose();
            VServicio vs = new VServicio();
            vs.setVisible(true);
        }

        //Botón Facturación. Abre la vista de Facturación.
        if (e.getSource() == vmp.btnFacturacion) {
            vmp.dispose();
            VFactura vf = new VFactura();
            vf.setVisible(true);
        }

        //Botón Reporte. Abre la vista de Reporte.
        if (e.getSource() == vmp.btnReportes) {
            vmp.dispose();
            VNomina vn = new VNomina();
            vn.setVisible(true);
        }

        //Botón Reporte. Abre la vista de Reporte.
        if (e.getSource() == vmp.btnConsultas) {
            vmp.dispose();
            VConsultas vc = new VConsultas();
            vc.setVisible(true);
        }
        
        //Boton Volver. Regresa a Login
        if (e.getSource() == vmp.btnVolver){
            vmp.dispose();
            new ControladorLogin();
        }
    }
}

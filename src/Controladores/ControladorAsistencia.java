/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.DAOVigilante;
import Datos.DAOAsistencia;
import Modelos.Asistencia;
import Modelos.Vigilante;
import Vistas.VAsistencia;
import Vistas.VGestionVigilante;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ControladorAsistencia implements ActionListener {
    
   private VAsistencia vasistencia;
   private Asistencia masistencia;
    private VGestionVigilante vvigilante;
    private Vigilante mvigilante;

   
   public ControladorAsistencia(){
    vasistencia = new VAsistencia();
    masistencia = new Asistencia();
    
     vvigilante = new VGestionVigilante();
     mvigilante = new Vigilante();
    
        this.vasistencia.btnBuscarMes.addActionListener(this);
        this.vasistencia.btnAgregar.addActionListener(this);
        this.vasistencia.btnLimpiar.addActionListener(this);
        this.vasistencia.btnBuscarCedula.addActionListener(this);
        this.vasistencia.btnLimpiarMes.addActionListener(this);
        
        
        vasistencia.setVisible(true);
        vasistencia.setLocationRelativeTo(null);
        
        vasistencia.btnAgregar.setEnabled(false);
        vasistencia.btnBuscarMes.setEnabled(false);
        vasistencia.txtApellido.setEnabled(false);
        vasistencia.txtNombre.setEnabled(false);
        vasistencia.txtAnio.setEnabled(false);
        vasistencia.txtMes.setEnabled(false);
        vasistencia.txtInasistencias.setEnabled(false);
        vasistencia.txtInasistenciasJus.setEnabled(false);
        vasistencia.btnLimpiarMes.setEnabled(false);
        
        
    
}
   
   
   public void BuscarCedula() {
   String cedula = vasistencia.txtCedula.getText();
   
   
   if (cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la cedula del vigilante ");
            return;
        }
   Vigilante vigi = new DAOVigilante().Buscar(cedula);
        if (vigi == null) {
           JOptionPane.showMessageDialog(null, "No existe la cedula del vigilante");
        
            return;
            
        }
        
         JOptionPane.showMessageDialog(null, "Cedula encontrada");
        vasistencia.txtMes.setEnabled(true);
        vasistencia.txtAnio.setEnabled(true);
        
        vasistencia.txtCedula.setEditable(false);
        vasistencia.txtNombre.setText(vigi.getNombre());
        vasistencia.txtApellido.setText(vigi.getApellido());
        vasistencia.btnBuscarMes.setEnabled(true);
        
   }
   
    public void BuscarMes() {
         String cedula = vasistencia.txtCedula.getText();
         String anio = vasistencia.txtAnio.getText();
         String mes = vasistencia.txtMes.getSelectedItem().toString();
   
       
      Asistencia asis = new DAOAsistencia().BuscarMes(cedula, mes, anio);
        if (asis == null) {
            JOptionPane.showMessageDialog(null, "Fecha no encontrada, ingrese las inasistencias");
          vasistencia.txtInasistencias.setEnabled(true);
        vasistencia.txtInasistenciasJus.setEnabled(true);
        vasistencia.txtMes.setEnabled(false);
        vasistencia.txtAnio.setEnabled(false);
        vasistencia.btnLimpiarMes.setEnabled(true);
        vasistencia.btnBuscarMes.setEnabled(false);
        vasistencia.btnAgregar.setEnabled(true);
            return;
        }
         JOptionPane.showMessageDialog(null, "Las fecha ya ha sido utilizada");
         vasistencia.btnBuscarMes.setEnabled(false);
  vasistencia.txtInasistencias.setText(Integer.toString(asis.getInasistencia()));
   vasistencia.txtInasistenciasJus.setText(Integer.toString(asis.getInasistenciaJus()));
   vasistencia.btnLimpiarMes.setEnabled(true);
   vasistencia.txtInasistencias.setEnabled(true);
        vasistencia.txtInasistenciasJus.setEnabled(true);
        vasistencia.txtInasistencias.setEnabled(false);
        vasistencia.txtInasistenciasJus.setEnabled(false);
        vasistencia.txtMes.setEnabled(false);
        vasistencia.txtAnio.setEnabled(false);
    }
   public void AgregarAsistencia() {
        String cedula = vasistencia.txtCedula.getText();
         String anio = vasistencia.txtAnio.getText();
         String mes = vasistencia.txtMes.getSelectedItem().toString();
       int inasistencia = Integer.parseInt(vasistencia.txtInasistencias.getText());
       int inasistenciaJus = Integer.parseInt(vasistencia.txtInasistenciasJus.getText());
       
   if (cedula.equals("") || mes.equals("Seleccione el mes") ) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }
   
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea agregar las inasistencias ?");

        if (confirmar == JOptionPane.YES_OPTION) {
             Asistencia nuevaAsistencia = new DAOAsistencia().Agregar(cedula,mes, anio, inasistencia, inasistenciaJus,"A");
            JOptionPane.showMessageDialog(null, "Se han agregado");
            Limpiar();
          
        }
   }
   
   public void Limpiar() {
   vasistencia.txtCedula.setText("Ingrese la Cedula");
   vasistencia.txtNombre.setText("");
   vasistencia.txtApellido.setText("");
   vasistencia.txtAnio.setText("2022");
   vasistencia.txtMes.setSelectedIndex(0);
   vasistencia.txtInasistencias.setText("");
   vasistencia.txtInasistenciasJus.setText("");
   
      vasistencia.txtCedula.setEditable(true);
   vasistencia.btnAgregar.setEnabled(false);
        vasistencia.btnBuscarMes.setEnabled(false);
        vasistencia.txtApellido.setEnabled(false);
        vasistencia.txtNombre.setEnabled(false);
        vasistencia.txtAnio.setEnabled(false);
        vasistencia.txtInasistencias.setEnabled(false);
        vasistencia.txtMes.setEnabled(false);
        vasistencia.txtInasistenciasJus.setEnabled(false);
        vasistencia.btnLimpiarMes.setEnabled(false);
   
   }
   
   public void LimpiarMes() {
   
   vasistencia.txtAnio.setText("2022");
   vasistencia.txtMes.setSelectedIndex(0);
   vasistencia.txtInasistencias.setText("");
   vasistencia.txtInasistenciasJus.setText("");
   
vasistencia.txtCedula.setEnabled(false);
     vasistencia.txtInasistencias.setEnabled(false);
        vasistencia.txtInasistenciasJus.setEnabled(false);
        vasistencia.txtMes.setEnabled(true);
        vasistencia.txtAnio.setEnabled(true);   
        vasistencia.btnBuscarMes.setEnabled(true);
   
   
   }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == vasistencia.btnBuscarCedula) {
            BuscarCedula();
        }
       
       if (e.getSource() == vasistencia.btnBuscarMes) {
            BuscarMes();
        }
       
       if (e.getSource() == vasistencia.btnAgregar) {
            AgregarAsistencia();
        }
       
        if (e.getSource() == vasistencia.btnLimpiar) {
            Limpiar();
        }
        
          if (e.getSource() == vasistencia.btnLimpiarMes) {
            LimpiarMes();
        }
    }
    
    
    
    
}

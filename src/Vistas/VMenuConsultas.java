/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Vistas;

import java.awt.Color;

public class VMenuConsultas extends javax.swing.JFrame {

    public VMenuConsultas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMenuPrincipal = new javax.swing.JLabel();
        btnServicios = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        lblSeparador1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuPrincipal.setFont(new java.awt.Font("Roboto Black", 1, 60)); // NOI18N
        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setText("MENÚ CONSULTAS");
        jPanel1.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 67, 560, -1));

        btnServicios.setBackground(new java.awt.Color(38, 172, 239));
        btnServicios.setForeground(new java.awt.Color(95, 255, 217));
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconGestionServicio.png"))); // NOI18N
        btnServicios.setBorder(null);
        btnServicios.setBorderPainted(false);
        btnServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnServiciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnServiciosMouseExited(evt);
            }
        });
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 325, 110));

        btnFacturacion.setBackground(new java.awt.Color(38, 172, 239));
        btnFacturacion.setForeground(new java.awt.Color(95, 255, 217));
        btnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconFacturacion.png"))); // NOI18N
        btnFacturacion.setBorder(null);
        btnFacturacion.setBorderPainted(false);
        btnFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturacionMouseExited(evt);
            }
        });
        btnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 325, 110));

        btnReportes.setBackground(new java.awt.Color(38, 172, 239));
        btnReportes.setForeground(new java.awt.Color(95, 255, 217));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconReportes.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 325, 110));

        btnConsultas.setBackground(new java.awt.Color(38, 172, 239));
        btnConsultas.setForeground(new java.awt.Color(95, 255, 217));
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconConsultas_2.png"))); // NOI18N
        btnConsultas.setBorder(null);
        btnConsultas.setBorderPainted(false);
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultasMouseExited(evt);
            }
        });
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 325, 110));

        lblSeparador1.setBackground(new java.awt.Color(0, 203, 130));
        lblSeparador1.setForeground(new java.awt.Color(0, 203, 130));
        lblSeparador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblSeparador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 668, 3));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconVolver.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setHideActionText(true);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        Header.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        btnMinimizar.setText("_");
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        Header.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnSalir.setText("X");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPreferredSize(new java.awt.Dimension(40, 40));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        Header.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Login_Logo.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 70, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseEntered
        // Se cambia el boton a otro color
        btnServicios.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnServiciosMouseEntered

    private void btnServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseExited
        // Se cambio el boton al color original
        btnServicios.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnServiciosMouseExited

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnFacturacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturacionMouseEntered
        // Se cambia el boton a otro color
        btnFacturacion.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnFacturacionMouseEntered

    private void btnFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturacionMouseExited
        // Se cambio el boton al color original
        btnFacturacion.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnFacturacionMouseExited

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturacionActionPerformed

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        // Se cambia el boton a otro color
        btnReportes.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        // Se cambio el boton al color original
        btnReportes.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseEntered
        // Se cambia el boton a otro color
        btnConsultas.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnConsultasMouseEntered

    private void btnConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseExited
        // Se cambio el boton al color original
        btnConsultas.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnConsultasMouseExited

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        // Se cambia el color de fondo del boton a cyan
        btnVolver.setBackground(Color.cyan);

        // Se cambio el color de la letra a blanco del boton
        btnVolver.setForeground(Color.white);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        // Se cambia el color de fondo del boton al original
        btnVolver.setBackground(Color.white);

        // Se cambia el color de la letra del boton a negro
        btnVolver.setForeground(Color.black);
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(Color.GRAY);
        btnMinimizar.setForeground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(Color.white);
        btnMinimizar.setForeground(Color.black);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // Se cambia el color a Rojo
        btnSalir.setBackground(Color.red);
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.black);
    }//GEN-LAST:event_btnSalirMouseExited

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        // Obtenemos la posición del Mouse en la pantalla en el eje X
        int x = evt.getXOnScreen();

        // Obtenemos la posición del Mouse en la pantalla en el eje Y
        int y = evt.getYOnScreen();

        // Movemos la pantalla a la posición especificada
      
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        
    }//GEN-LAST:event_HeaderMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenuConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Header;
    public javax.swing.JButton btnConsultas;
    public javax.swing.JButton btnFacturacion;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnServicios;
    public javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblSeparador1;
    // End of variables declaration//GEN-END:variables
}

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

public class VMenuPrincipal extends javax.swing.JFrame {

    // creamos variables para saber en que posición se encuenta el mouse
    int xMouse, yMouse;

    public VMenuPrincipal() {
        // Inicializa todas las variables (o mejor dicho componentes) que usa el JFrame.
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

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCliente5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblMenuPrincipal = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        btnVigilante = new javax.swing.JButton();
        btnHerramientas = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        lblSeparador = new javax.swing.JLabel();
        lblSeparador1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        jLabel12.setText("jLabel3");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gestión Cliente");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCliente5.setBackground(new java.awt.Color(95, 255, 217));
        btnCliente5.setForeground(new java.awt.Color(95, 255, 217));
        btnCliente5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuPrincipal.setFont(new java.awt.Font("Roboto Black", 1, 60)); // NOI18N
        lblMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setText("MENÚ PRINCIPAL");
        jPanel1.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 67, 560, -1));

        btnCliente.setBackground(new java.awt.Color(38, 172, 239));
        btnCliente.setForeground(new java.awt.Color(95, 255, 217));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconGestionCliente.png"))); // NOI18N
        btnCliente.setBorder(null);
        btnCliente.setBorderPainted(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteMouseExited(evt);
            }
        });
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 144, 200, 110));

        btnVigilante.setBackground(new java.awt.Color(38, 172, 239));
        btnVigilante.setForeground(new java.awt.Color(95, 255, 217));
        btnVigilante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconGestionVigilante.png"))); // NOI18N
        btnVigilante.setBorder(null);
        btnVigilante.setBorderPainted(false);
        btnVigilante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVigilante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVigilante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVigilanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVigilanteMouseExited(evt);
            }
        });
        btnVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVigilanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnVigilante, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 144, 200, 110));

        btnHerramientas.setBackground(new java.awt.Color(38, 172, 239));
        btnHerramientas.setForeground(new java.awt.Color(95, 255, 217));
        btnHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconGestionHerramientas.png"))); // NOI18N
        btnHerramientas.setBorder(null);
        btnHerramientas.setBorderPainted(false);
        btnHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHerramientas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHerramientasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHerramientasMouseExited(evt);
            }
        });
        btnHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHerramientasActionPerformed(evt);
            }
        });
        jPanel1.add(btnHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 144, 200, 110));

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
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 274, 325, 110));

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
        jPanel1.add(btnFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 274, 325, 110));

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
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 404, 325, 110));

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
        jPanel1.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 404, 325, 110));

        lblSeparador.setBackground(new java.awt.Color(0, 203, 130));
        lblSeparador.setForeground(new java.awt.Color(0, 203, 130));
        lblSeparador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 263, 668, 3));

        lblSeparador1.setBackground(new java.awt.Color(0, 203, 130));
        lblSeparador1.setForeground(new java.awt.Color(0, 203, 130));
        lblSeparador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblSeparador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 393, 668, 3));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed

    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVigilanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVigilanteActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHerramientasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHerramientasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnCliente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCliente5ActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturacionActionPerformed

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
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

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

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        // Se cambia el boton a otro color
        btnCliente.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        // Se cambio el boton al color original
        btnCliente.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnVigilanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVigilanteMouseEntered
        // Se cambia el boton a otro color
        btnVigilante.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnVigilanteMouseEntered

    private void btnVigilanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVigilanteMouseExited
        // Se cambio el boton al color original
        btnVigilante.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnVigilanteMouseExited

    private void btnHerramientasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHerramientasMouseEntered
        // Se cambia el boton a otro color
        btnHerramientas.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnHerramientasMouseEntered

    private void btnHerramientasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHerramientasMouseExited
        // Se cambio el boton al color original
        btnHerramientas.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnHerramientasMouseExited

    private void btnServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseEntered
        // Se cambia el boton a otro color
        btnServicios.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnServiciosMouseEntered

    private void btnServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseExited
        // Se cambio el boton al color original
        btnServicios.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnServiciosMouseExited

    private void btnFacturacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturacionMouseEntered
        // Se cambia el boton a otro color
        btnFacturacion.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnFacturacionMouseEntered

    private void btnFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturacionMouseExited
        // Se cambio el boton al color original
        btnFacturacion.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnFacturacionMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        // Se cambia el boton a otro color
        btnReportes.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        // Se cambio el boton al color original
        btnReportes.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseEntered
        // Se cambia el boton a otro color
        btnConsultas.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnConsultasMouseEntered

    private void btnConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseExited
        // Se cambio el boton al color original
        btnConsultas.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnConsultasMouseExited

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
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Header;
    public javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente5;
    public javax.swing.JButton btnConsultas;
    public javax.swing.JButton btnFacturacion;
    public javax.swing.JButton btnHerramientas;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnServicios;
    public javax.swing.JButton btnVigilante;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblSeparador;
    private javax.swing.JLabel lblSeparador1;
    // End of variables declaration//GEN-END:variables
}

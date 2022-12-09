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
import javax.swing.JComboBox;

public class VHerramientas extends javax.swing.JFrame {

    // creamos variables para saber en que posición se encuenta el mouse
    int xMouse, yMouse;

    public VHerramientas() {
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

        jPanel1 = new javax.swing.JPanel();
        lblGestionHerramientas = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblLineaCantidad = new javax.swing.JLabel();
        lblCantidadDisponible = new javax.swing.JLabel();
        txtCantidadDisponible = new javax.swing.JTextField();
        lblLineaCantDisponible = new javax.swing.JLabel();
        lblPrecioAlquiler = new javax.swing.JLabel();
        txtPrecioAlquiler = new javax.swing.JTextField();
        lblLineaPrecioAlquiler = new javax.swing.JLabel();
        lblPrecioMantenimiento = new javax.swing.JLabel();
        txtPrecioMantenimiento = new javax.swing.JTextField();
        lblLineaPrecioMant = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        lblTipoHerramienta = new javax.swing.JLabel();
        lblBicicleta = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        btnRestar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGestionHerramientas.setBackground(new java.awt.Color(204, 255, 204));
        lblGestionHerramientas.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblGestionHerramientas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionHerramientas.setText("Gestion Herramientas");
        jPanel1.add(lblGestionHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        lblCantidad.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblCantidad.setText("Cantidad ");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 26));

        txtCantidad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidad.setText("0");
        txtCantidad.setBorder(null);
        txtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 20));

        lblLineaCantidad.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaCantidad.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jPanel1.add(lblLineaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 3));

        lblCantidadDisponible.setBackground(new java.awt.Color(0, 0, 0));
        lblCantidadDisponible.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblCantidadDisponible.setText("Cantidad disponible");
        jPanel1.add(lblCantidadDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 26));

        txtCantidadDisponible.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtCantidadDisponible.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidadDisponible.setText("0");
        txtCantidadDisponible.setBorder(null);
        txtCantidadDisponible.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidadDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadDisponibleActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, 20));

        lblLineaCantDisponible.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaCantDisponible.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaCantDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblLineaCantDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 3));

        lblPrecioAlquiler.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblPrecioAlquiler.setText("Precio del Alquiler");
        jPanel1.add(lblPrecioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 27));

        txtPrecioAlquiler.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtPrecioAlquiler.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioAlquiler.setText("0");
        txtPrecioAlquiler.setBorder(null);
        txtPrecioAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioAlquilerActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, 20));

        lblLineaPrecioAlquiler.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaPrecioAlquiler.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaPrecioAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jPanel1.add(lblLineaPrecioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 3));

        lblPrecioMantenimiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblPrecioMantenimiento.setText("Precio del Mantenimiento");
        jPanel1.add(lblPrecioMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 24));

        txtPrecioMantenimiento.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtPrecioMantenimiento.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioMantenimiento.setText("0");
        txtPrecioMantenimiento.setBorder(null);
        txtPrecioMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMantenimientoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 200, 20));

        lblLineaPrecioMant.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaPrecioMant.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaPrecioMant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblLineaPrecioMant, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 200, 3));

        btnAgregar.setBackground(new java.awt.Color(38, 172, 239));
        btnAgregar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        btnModificar.setBackground(new java.awt.Color(38, 172, 239));
        btnModificar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(38, 172, 239));
        btnLimpiar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 98, -1));

        btnEliminar.setBackground(new java.awt.Color(38, 172, 239));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jComboBoxTipo.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Radio", "Bicicleta" }));
        jComboBoxTipo.setToolTipText("");
        jComboBoxTipo.setBorder(null);
        jComboBoxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));

        lblTipoHerramienta.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTipoHerramienta.setText("Tipo de Herramienta");
        jPanel1.add(lblTipoHerramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblBicicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/VHerramientas_Bicicletas.png"))); // NOI18N
        jPanel1.add(lblBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 450, 350));

        lblRadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/VHerramientas_Radios.png"))); // NOI18N
        jPanel1.add(lblRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 450, 350));

        btnRestar.setBackground(new java.awt.Color(38, 172, 239));
        btnRestar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("Restar");
        btnRestar.setBorder(null);
        btnRestar.setBorderPainted(false);
        btnRestar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestarMouseExited(evt);
            }
        });
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(38, 172, 239));
        btnAceptar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
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
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    public JComboBox<String> getCbxTipoHerramienta() {
        return jComboBoxTipo;
    }

    public void setCbxElegirEstatus(JComboBox<String> cbxElegirEstatus) {
        this.jComboBoxTipo = cbxElegirEstatus;
    }

    private void txtPrecioAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioAlquilerActionPerformed

    private void txtPrecioMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioMantenimientoActionPerformed

    private void txtCantidadDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadDisponibleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCantidadDisponibleActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // Si se da click al boton volver
    }//GEN-LAST:event_btnVolverMouseClicked

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

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(Color.GRAY);
        btnMinimizar.setForeground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(Color.white);
        btnMinimizar.setForeground(Color.black);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // Se cierra el sistema
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

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

    // Evento cuando el mouse entra al boton "Agregar"
    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnAgregarMouseEntered

    // Evento cuando el mouse sale al boton "Agregar"
    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnAgregarMouseExited

    // Evento cuando el mouse entra al boton "Modificar"
    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnModificarMouseEntered

    // Evento cuando el mouse sale al boton "Modificar"
    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnModificarMouseExited

    // Evento cuando el mouse entra al boton "Aceptar"
    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnAceptarMouseEntered

    // Evento cuando el mouse sale al boton "Aceptar"
    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnAceptarMouseExited

    // Evento cuando el mouse entra al boton "Eliminar"
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnEliminarMouseEntered

    // Evento cuando el mouse sale al boton "Eliminar"
    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnEliminarMouseExited

    // Evento cuando el mouse entra al boton "Restar"
    private void btnRestarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseEntered
        btnRestar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnRestarMouseEntered

    // Evento cuando el mouse sale al boton "Restar"
    private void btnRestarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseExited
        btnRestar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnRestarMouseExited

    // Evento cuando el mouse entra al boton "Limpiar"
    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    // Evento cuando el mouse sale al boton "Limpiar"
    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        // Si el campo tiene el valor por defecto
        if (txtCantidad.getText().equals("0")) {
            // Se le hace un set a vacío
            txtCantidad.setText("");
            // Se cambia el color de la letra
            txtCantidad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCantidadMousePressed

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
            java.util.logging.Logger.getLogger(VGestionVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VGestionVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VGestionVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VGestionVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VHerramientas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Header;
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRestar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblBicicleta;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadDisponible;
    private javax.swing.JLabel lblGestionHerramientas;
    private javax.swing.JLabel lblLineaCantDisponible;
    private javax.swing.JLabel lblLineaCantidad;
    private javax.swing.JLabel lblLineaPrecioAlquiler;
    private javax.swing.JLabel lblLineaPrecioMant;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPrecioAlquiler;
    private javax.swing.JLabel lblPrecioMantenimiento;
    public javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblTipoHerramienta;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCantidadDisponible;
    public javax.swing.JTextField txtPrecioAlquiler;
    public javax.swing.JTextField txtPrecioMantenimiento;
    // End of variables declaration//GEN-END:variables
}

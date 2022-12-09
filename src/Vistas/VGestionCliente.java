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

public class VGestionCliente extends javax.swing.JFrame {

    // Creamos variables para saber en que posición se encuenta el mouse
    int xMouse, yMouse;

    public VGestionCliente() {
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
        cbxTipoCliente = new javax.swing.JComboBox<>();
        lblRif = new javax.swing.JLabel();
        lblLineaRif = new javax.swing.JLabel();
        txtRif = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblLineaNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblLineaDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblLineaTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblLineaDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblTipoCliente = new javax.swing.JLabel();
        lblGestionCliente = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblEdificio = new javax.swing.JLabel();
        lblUrbanizacion = new javax.swing.JLabel();
        lblTienda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTipoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cbxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Edificio", "Urbanizacion", "Tienda" }));
        cbxTipoCliente.setToolTipText("");
        cbxTipoCliente.setBorder(null);
        cbxTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 200, 25));

        lblRif.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblRif.setText("Rif");
        jPanel1.add(lblRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 31, -1));

        lblLineaRif.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaRif.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaRif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jPanel1.add(lblLineaRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 3));

        txtRif.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtRif.setForeground(new java.awt.Color(153, 153, 153));
        txtRif.setText("Ingrese el Rif");
        txtRif.setBorder(null);
        txtRif.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRifMousePressed(evt);
            }
        });
        txtRif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRifActionPerformed(evt);
            }
        });
        jPanel1.add(txtRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 155, 20));

        lblNombre.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 21));

        lblLineaNombre.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaNombre.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblLineaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 3));

        txtNombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el nombre");
        txtNombre.setBorder(null);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 20));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDescripcion.setText("Descripcion");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lblLineaDescripcion.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaDescripcion.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jPanel1.add(lblLineaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 3));

        txtDescripcion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setText("Ingrese la descripcion");
        txtDescripcion.setBorder(null);
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, 20));

        lblTelefono.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTelefono.setText("Telefono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        lblLineaTelefono.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaTelefono.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/5FFFD9.jpg"))); // NOI18N
        jPanel1.add(lblLineaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 200, 3));

        txtTelefono.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese el telefono");
        txtTelefono.setBorder(null);
        txtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 20));

        lblDireccion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblDireccion.setText("Direccion");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        lblLineaDireccion.setBackground(new java.awt.Color(0, 203, 130));
        lblLineaDireccion.setForeground(new java.awt.Color(0, 203, 130));
        lblLineaDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jPanel1.add(lblLineaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 200, 3));

        txtDireccion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setText("Ingrese la direccion");
        txtDireccion.setBorder(null);
        txtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 20));

        btnEliminar.setBackground(new java.awt.Color(38, 172, 239));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 100, 40));

        btnLimpiar.setBackground(new java.awt.Color(38, 172, 239));
        btnLimpiar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 100, 40));

        btnModificar.setBackground(new java.awt.Color(38, 172, 239));
        btnModificar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 100, 40));

        btnAgregar.setBackground(new java.awt.Color(38, 172, 239));
        btnAgregar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 100, 40));

        btnBuscar.setBackground(new java.awt.Color(38, 172, 239));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Iconos/IconBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 128, -1, -1));

        lblTipoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTipoCliente.setText("Tipo de cliente");
        jPanel1.add(lblTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        lblGestionCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionCliente.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblGestionCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGestionCliente.setText("Gestion Cliente");
        jPanel1.add(lblGestionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 760, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Login_Logo.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 70, 70));

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

        lblEdificio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/VCliente_Edificio.png"))); // NOI18N
        jPanel1.add(lblEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 290, 560));

        lblUrbanizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/VCliente_Urbanizacion.png"))); // NOI18N
        jPanel1.add(lblUrbanizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 290, 560));

        lblTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/VCliente_Tienda.png"))); // NOI18N
        jPanel1.add(lblTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 290, 560));

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

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbxTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoClienteActionPerformed
        // TODO add your handling code here:

        /*   String valor=(String)jComboBox.getSelectedItem();
        if(valor.equals("Seleccionar")){
            txtNumeroLocal.setVisible(false);
            txtNumeroCasas.setVisible(false);
            txtCantPisos.setVisible(false);
            txtCantApart.setVisible(false);
            txtNumeroLocal.setText("");
            txtNumeroCasas.setText("");
            txtCantPisos.setText("");
            txtCantApart.setText("");

        }
        if (valor.equals("Urbanizacion")){
            txtNumeroLocal.setVisible(false);
            txtNumeroCasas.setVisible(true);
            txtCantPisos.setVisible(false);
            txtCantApart.setVisible(false);

            txtNumeroLocal.setText("");
            txtNumeroCasas.setText("");
            txtCantPisos.setText("");
            txtCantApart.setText("");

        }
        if (valor.equals("Edificio")){
            txtNumeroLocal.setVisible(false);
            txtNumeroCasas.setVisible(false);
            txtCantPisos.setVisible(true);
            txtCantApart.setVisible(true);
            txtNumeroLocal.setText("");
            txtNumeroCasas.setText("");

        }
        if (valor.equals("Tienda")){
            txtNumeroLocal.setVisible(true);
            txtNumeroCasas.setVisible(false);
            txtCantPisos.setVisible(false);
            txtCantApart.setVisible(false);
            txtNumeroLocal.setText("");
            txtNumeroCasas.setText("");
            txtCantPisos.setText("");
            txtCantApart.setText("");
        }*/
    }//GEN-LAST:event_cbxTipoClienteActionPerformed

    private void txtRifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRifActionPerformed

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

    private void txtRifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRifMousePressed
        // Si el campo tiene el valor por defecto
        if (txtRif.getText().equals("Ingrese el Rif")) {
            // Se le hace un set a vacío
            txtRif.setText("");
            // Se cambia el color de la letra
            txtRif.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtRifMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // Si el campo tiene el valor por defecto
        if (txtNombre.getText().equals("Ingrese el nombre")) {
            // Se le hace un set a vacío
            txtNombre.setText("");
            // Se cambia el color de la letra
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed
        // Si el campo tiene el valor por defecto
        if (txtDescripcion.getText().equals("Ingrese la descripcion")) {
            // Se le hace un set a vacío
            txtDescripcion.setText("");
            // Se cambia el color de la letra
            txtDescripcion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        // Si el campo tiene el valor por defecto
        if (txtTelefono.getText().equals("Ingrese el telefono")) {
            // Se le hace un set a vacío
            txtTelefono.setText("");
            // Se cambia el color de la letra
            txtTelefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        // Si el campo tiene el valor por defecto
        if (txtDireccion.getText().equals("Ingrese la direccion")) {
            // Se le hace un set a vacío
            txtDireccion.setText("");
            // Se cambia el color de la letra
            txtDireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new java.awt.Color(0, 203, 130));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new java.awt.Color(38, 172, 239));
    }//GEN-LAST:event_btnEliminarMouseExited
    
    public JComboBox<String> getCbxTipoCliente() {
        return cbxTipoCliente;
    }

    public void setCbxElegirEstatus(JComboBox<String> cbxElegirEstatus) {
        this.cbxTipoCliente = cbxElegirEstatus;
    }

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
            java.util.logging.Logger.getLogger(VGestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VGestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VGestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VGestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VGestionCliente().setVisible(true);

            }
        });
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Header;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbxTipoCliente;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDireccion;
    public javax.swing.JLabel lblEdificio;
    private javax.swing.JLabel lblGestionCliente;
    private javax.swing.JLabel lblLineaDescripcion;
    private javax.swing.JLabel lblLineaDireccion;
    private javax.swing.JLabel lblLineaNombre;
    private javax.swing.JLabel lblLineaRif;
    private javax.swing.JLabel lblLineaTelefono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRif;
    private javax.swing.JLabel lblTelefono;
    public javax.swing.JLabel lblTienda;
    private javax.swing.JLabel lblTipoCliente;
    public javax.swing.JLabel lblUrbanizacion;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtRif;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

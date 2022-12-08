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

public class VServicio extends javax.swing.JFrame {

    // Creamos variables para saber en que posición se encuenta el mouse
    int xMouse, yMouse;

    public VServicio() {
        // Inicializa todas las variables (o mejor dicho componentes) que usa el JFrame.
        initComponents();
        jRadioButtonSiServicio.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServicioAdicional = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelFechaInicio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButtonNoServicio = new javax.swing.JRadioButton();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButtonSiServicio = new javax.swing.JRadioButton();
        btnFacturar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabelCantBicicletas = new javax.swing.JLabel();
        txtCantBicicletas = new javax.swing.JTextField();
        jLabel_cantBici = new javax.swing.JLabel();
        jLabelCantRadios = new javax.swing.JLabel();
        txtCantRadios = new javax.swing.JTextField();
        jLabel_CantRadios = new javax.swing.JLabel();
        jComboBoxVigilantes = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabelRif = new javax.swing.JLabel();
        btnBuscarR = new javax.swing.JButton();
        txtRif = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelCosto1 = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabelServicio = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscarS = new javax.swing.JButton();
        txtNombreC = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDescripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescripcion.setText("Descripcion");
        jPanel1.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 135, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setText("Ingrese la descripcion");
        txtDescripcion.setBorder(null);
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 163, 192, 22));

        jLabel10.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel10.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 191, 203, 3));

        jLabelCosto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCosto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCosto.setText("Costo");
        jPanel1.add(jLabelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 359, -1, -1));

        txtCosto.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(153, 153, 153));
        txtCosto.setText("Costo");
        txtCosto.setBorder(null);
        txtCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 402, 192, 22));

        jLabel11.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel11.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 330, 203, 3));

        jLabelFechaInicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaInicio.setText("Fecha de Inicio");
        jPanel1.add(jLabelFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 191, -1, -1));

        jLabel12.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel12.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 251, 203, 3));

        jLabelNombre3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelNombre3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre3.setText("Cantidad de vigilantes por turno ");
        jPanel1.add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 266, -1, 26));

        jLabel13.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel13.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 330, 203, 3));

        jLabel14.setBackground(new java.awt.Color(204, 255, 204));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Servicio de Vigilancia");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 361, -1));

        ServicioAdicional.add(jRadioButtonNoServicio);
        jRadioButtonNoServicio.setText("No");
        jRadioButtonNoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoServicioActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonNoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 373, -1, -1));

        jLabelNombre4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelNombre4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre4.setText("¿Desea un servicio adicional?");
        jPanel1.add(jLabelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 345, -1, -1));

        jLabel15.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel15.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 407, 203, 4));

        ServicioAdicional.add(jRadioButtonSiServicio);
        jRadioButtonSiServicio.setText("Si");
        jRadioButtonSiServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSiServicioActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonSiServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 373, -1, -1));

        btnFacturar.setBackground(new java.awt.Color(51, 204, 0));
        btnFacturar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFacturar.setText("Crear");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 500, 113, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 500, 98, -1));

        jLabelCantBicicletas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCantBicicletas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCantBicicletas.setText("Cantidad de Bicicletas");
        jPanel1.add(jLabelCantBicicletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 429, 184, -1));

        txtCantBicicletas.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCantBicicletas.setForeground(new java.awt.Color(153, 153, 153));
        txtCantBicicletas.setText("0");
        txtCantBicicletas.setBorder(null);
        txtCantBicicletas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantBicicletasActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantBicicletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 457, 128, 22));

        jLabel_cantBici.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel_cantBici.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel_cantBici, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 485, 128, 3));

        jLabelCantRadios.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCantRadios.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCantRadios.setText("Cantidad de Radios");
        jPanel1.add(jLabelCantRadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 509, -1, -1));

        txtCantRadios.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCantRadios.setForeground(new java.awt.Color(153, 153, 153));
        txtCantRadios.setText("0");
        txtCantRadios.setBorder(null);
        txtCantRadios.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantRadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantRadiosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantRadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 544, 130, 22));

        jLabel_CantRadios.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel_CantRadios.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel_CantRadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 572, 130, 3));

        jComboBoxVigilantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jPanel1.add(jComboBoxVigilantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 298, 203, -1));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 219, 203, -1));

        jLabelRif.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelRif.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif.setText("Rif");
        jPanel1.add(jLabelRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 118, 31, -1));

        btnBuscarR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarR.setText("Buscar");
        btnBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 146, -1, -1));

        txtRif.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtRif.setForeground(new java.awt.Color(153, 153, 153));
        txtRif.setText("Ingrese el Rif");
        txtRif.setBorder(null);
        txtRif.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRifActionPerformed(evt);
            }
        });
        jPanel1.add(txtRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 157, 192, 22));

        jLabel9.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel9.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 182, 203, 3));

        jLabelCosto1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCosto1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCosto1.setText("Monto por Vigilante");
        jPanel1.add(jLabelCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 283, -1, -1));

        txtmonto.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtmonto.setForeground(new java.awt.Color(153, 153, 153));
        txtmonto.setText("Ingrese monto");
        txtmonto.setBorder(null);
        txtmonto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 311, 166, 22));

        jLabel16.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel16.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 407, 203, 3));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 153));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 500, 113, -1));

        jLabelServicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelServicio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelServicio.setText("Servicio");
        jPanel1.add(jLabelServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigo.setText("Codigo del Servicio");
        txtCodigo.setBorder(null);
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 90, 192, 22));

        btnBuscarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarS.setText("Buscar");
        btnBuscarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 79, -1, -1));

        txtNombreC.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtNombreC.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreC.setText("Nombre del cliente");
        txtNombreC.setBorder(null);
        txtNombreC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 191, 192, 22));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular Costo");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 399, -1, 22));

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

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void jRadioButtonNoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoServicioActionPerformed
        // TODO add your handling code here:
        txtCantBicicletas.setVisible(false);
        txtCantRadios.setVisible(false);

        txtCantBicicletas.setText("");
        txtCantRadios.setText("");

        jLabelCantBicicletas.setVisible(false);
        jLabelCantRadios.setVisible(false);
        jLabelCosto.setVisible(false);
        jLabel_CantRadios.setVisible(false);
        jLabel_cantBici.setVisible(false);
    }//GEN-LAST:event_jRadioButtonNoServicioActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        // txtRif.setText("");
        // txtNombre.setText("");
        // txtDescripcion.setText("");
        // txtDireccion.setText("");
        //txtTelefono.setText("");
        // txtNumeroLocal.setText("");


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCantBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantBicicletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantBicicletasActionPerformed

    private void txtCantRadiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantRadiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantRadiosActionPerformed

    private void jRadioButtonSiServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSiServicioActionPerformed
        txtCantBicicletas.setVisible(true);
        txtCantRadios.setVisible(true);
        // TODO add your handling code here:
        jLabelCantBicicletas.setVisible(true);
        jLabelCantRadios.setVisible(true);
        jLabelCosto.setVisible(true);

        jLabel_CantRadios.setVisible(true);

        jLabel_cantBici.setVisible(true);
    }//GEN-LAST:event_jRadioButtonSiServicioActionPerformed

    private void btnBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarRActionPerformed

    private void txtRifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRifActionPerformed

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnBuscarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarSActionPerformed

    private void txtNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Header;
    private javax.swing.ButtonGroup ServicioAdicional;
    public javax.swing.JButton btnBuscarR;
    public javax.swing.JButton btnBuscarS;
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnFacturar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> jComboBoxMes;
    public javax.swing.JComboBox<String> jComboBoxVigilantes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCantBicicletas;
    private javax.swing.JLabel jLabelCantRadios;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelCosto1;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelRif;
    private javax.swing.JLabel jLabelServicio;
    private javax.swing.JLabel jLabel_CantRadios;
    private javax.swing.JLabel jLabel_cantBici;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton jRadioButtonNoServicio;
    public javax.swing.JRadioButton jRadioButtonSiServicio;
    public javax.swing.JTextField txtCantBicicletas;
    public javax.swing.JTextField txtCantRadios;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtNombreC;
    public javax.swing.JTextField txtRif;
    public javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables
}

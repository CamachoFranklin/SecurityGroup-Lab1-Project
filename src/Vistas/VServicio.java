/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Vistas;

public class VServicio extends javax.swing.JFrame {

    /**
     * Creates new form VServicio
     */
    public VServicio() {
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
        jButton6 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabelCantBicicletas = new javax.swing.JLabel();
        txtCantBicicletas = new javax.swing.JTextField();
        jLabel_cantBici = new javax.swing.JLabel();
        jLabelCantRadios = new javax.swing.JLabel();
        txtCantRadios = new javax.swing.JTextField();
        jLabel_CantRadios = new javax.swing.JLabel();
        jComboBoxVigilantes = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabelRif = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtRif = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelCosto1 = new javax.swing.JLabel();
        txtCosto1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDescripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelDescripcion.setText("Descripcion");

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

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel10.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabelCosto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCosto.setText("Costo");

        txtCosto.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(153, 153, 153));
        txtCosto.setText("Ingrese el costo");
        txtCosto.setBorder(null);
        txtCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel11.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabelFechaInicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelFechaInicio.setText("Fecha de Inicio");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel12.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabelNombre3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelNombre3.setText("Cantidad de vigilantes por turno ");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel13.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabel14.setBackground(new java.awt.Color(204, 255, 204));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel14.setText("Servicio de Vigilancia");

        ServicioAdicional.add(jRadioButtonNoServicio);
        jRadioButtonNoServicio.setText("No");
        jRadioButtonNoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoServicioActionPerformed(evt);
            }
        });

        jLabelNombre4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelNombre4.setText("¿Desea un servicio adicional?");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel15.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel15.setMinimumSize(new java.awt.Dimension(252, 2));

        ServicioAdicional.add(jRadioButtonSiServicio);
        jRadioButtonSiServicio.setText("Si");
        jRadioButtonSiServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSiServicioActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Facturar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnLimpiar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jLabelCantBicicletas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCantBicicletas.setText("Cantidad de Bicicletas");

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

        jLabel_cantBici.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel_cantBici.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel_cantBici.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabelCantRadios.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCantRadios.setText("Cantidad de Radios");

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

        jLabel_CantRadios.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel_CantRadios.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel_CantRadios.setMinimumSize(new java.awt.Dimension(252, 2));

        jComboBoxVigilantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8" }));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabelRif.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelRif.setText("Rif");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel9.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabelCosto1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCosto1.setText("Monto");

        txtCosto1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCosto1.setForeground(new java.awt.Color(153, 153, 153));
        txtCosto1.setText("Ingrese el costo");
        txtCosto1.setBorder(null);
        txtCosto1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCosto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCosto1ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\agua marina.png")); // NOI18N
        jLabel16.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel16.setMinimumSize(new java.awt.Dimension(252, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("%");

        jButton7.setBackground(new java.awt.Color(255, 204, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaInicio)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxMes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNombre4)
                            .addComponent(jLabelCantBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_cantBici, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jRadioButtonSiServicio)
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButtonNoServicio))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantRadios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_CantRadios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxVigilantes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabelCosto1)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCosto))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCantRadios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescripcion)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabelRif, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(jButton3))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(159, 159, 159))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addGap(70, 70, 70)
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(1, 1, 1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonNoServicio)
                            .addComponent(jRadioButtonSiServicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCantBicicletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_cantBici, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCantRadios)
                            .addComponent(btnLimpiar1)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantRadios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_CantRadios, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCosto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
        // txtRif.setText("");
       // txtNombre.setText("");
        // txtDescripcion.setText("");
        // txtDireccion.setText("");
        //txtTelefono.setText("");
       // txtNumeroLocal.setText("");
       

    }//GEN-LAST:event_btnLimpiar1ActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtRifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRifActionPerformed

    private void txtCosto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCosto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCosto1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(VServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ServicioAdicional;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxVigilantes;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel_CantRadios;
    private javax.swing.JLabel jLabel_cantBici;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNoServicio;
    private javax.swing.JRadioButton jRadioButtonSiServicio;
    private javax.swing.JTextField txtCantBicicletas;
    private javax.swing.JTextField txtCantRadios;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtCosto1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtRif;
    // End of variables declaration//GEN-END:variables
}

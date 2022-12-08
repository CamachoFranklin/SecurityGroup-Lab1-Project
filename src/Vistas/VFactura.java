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


public class VFactura extends javax.swing.JFrame {

    // Creamos variables para saber en que posición se encuenta el mouse
    int xMouse, yMouse;

    public VFactura() {
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
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRif = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabelRif2 = new javax.swing.JLabel();
        txtnumfac = new javax.swing.JTextField();
        jDateChooserfecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabelRif3 = new javax.swing.JLabel();
        jLabelRif4 = new javax.swing.JLabel();
        txtRif = new javax.swing.JTextField();
        jLabelRif5 = new javax.swing.JLabel();
        txtCantidadVigilantes = new javax.swing.JTextField();
        jLabelRif6 = new javax.swing.JLabel();
        txtpreciounitario = new javax.swing.JTextField();
        jLabelRif7 = new javax.swing.JLabel();
        txtPrecioServicio = new javax.swing.JTextField();
        jLabelRif8 = new javax.swing.JLabel();
        txtCantidadBicicletas = new javax.swing.JTextField();
        jLabelRif9 = new javax.swing.JLabel();
        txtPrecioAdicional = new javax.swing.JTextField();
        jLabelRif10 = new javax.swing.JLabel();
        txtCantidadRadios = new javax.swing.JTextField();
        jLabelRif11 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabelRif13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabelRif14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelRif16 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jLabelRif12 = new javax.swing.JLabel();
        txtMantenimientoBicicletas = new javax.swing.JTextField();
        jLabelRif17 = new javax.swing.JLabel();
        txtMantenimientoRadio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(204, 255, 204));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Factura");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 530, 10));

        jLabelRif.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabelRif.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif.setText("Fecha");
        jPanel1.add(jLabelRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 50, 30));

        txtcodigo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(153, 153, 153));
        txtcodigo.setBorder(null);
        txtcodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 192, 30));

        jLabel9.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel9.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 203, 3));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/Login_Logo.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("J-102454174-0");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Security Group");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("securitygroup@gmail.com");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 170, 30));

        txtDescripcion.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setBorder(null);
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 290, 30));

        jLabel10.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel10.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 203, 3));

        jLabelRif2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif2.setText("Nro. Factura#");
        jPanel1.add(jLabelRif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 100, 20));

        txtnumfac.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtnumfac.setForeground(new java.awt.Color(153, 153, 153));
        txtnumfac.setBorder(null);
        txtnumfac.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnumfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumfacActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 80, 20));
        jPanel1.add(jDateChooserfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 170, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 100, 10));

        jLabelRif3.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabelRif3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif3.setText("Codigo");
        jPanel1.add(jLabelRif3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

        jLabelRif4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabelRif4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif4.setText("Descripcion");
        jPanel1.add(jLabelRif4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 120, 20));

        txtRif.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtRif.setForeground(new java.awt.Color(153, 153, 153));
        txtRif.setBorder(null);
        txtRif.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRifActionPerformed(evt);
            }
        });
        jPanel1.add(txtRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 192, 30));

        jLabelRif5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabelRif5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif5.setText("Rif");
        jPanel1.add(jLabelRif5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 40, 20));

        txtCantidadVigilantes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCantidadVigilantes.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidadVigilantes.setBorder(null);
        txtCantidadVigilantes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidadVigilantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVigilantesActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadVigilantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 50, 30));

        jLabelRif6.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif6.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif6.setText("Cantidad");
        jPanel1.add(jLabelRif6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 70, 20));

        txtpreciounitario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtpreciounitario.setForeground(new java.awt.Color(153, 153, 153));
        txtpreciounitario.setBorder(null);
        txtpreciounitario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtpreciounitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreciounitarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtpreciounitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 30));

        jLabelRif7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif7.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif7.setText("Precio unitario");
        jPanel1.add(jLabelRif7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 100, 20));

        txtPrecioServicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPrecioServicio.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioServicio.setBorder(null);
        txtPrecioServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioServicioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 100, 40));

        jLabelRif8.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif8.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif8.setText("Precio servicio");
        jPanel1.add(jLabelRif8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 100, 20));

        txtCantidadBicicletas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCantidadBicicletas.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidadBicicletas.setBorder(null);
        txtCantidadBicicletas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidadBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadBicicletasActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadBicicletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 100, 40));

        jLabelRif9.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif9.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif9.setText("Cantidad Bicicletas");
        jPanel1.add(jLabelRif9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 130, 20));

        txtPrecioAdicional.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPrecioAdicional.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioAdicional.setBorder(null);
        txtPrecioAdicional.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioAdicionalActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 100, 40));

        jLabelRif10.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif10.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif10.setText("Precio adicional");
        jPanel1.add(jLabelRif10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 120, 20));

        txtCantidadRadios.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCantidadRadios.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidadRadios.setBorder(null);
        txtCantidadRadios.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidadRadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadRadiosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadRadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 40));

        jLabelRif11.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif11.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif11.setText("Mantenimiento Radio");
        jPanel1.add(jLabelRif11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 150, 20));

        txtSubTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtSubTotal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubTotal.setBorder(null);
        txtSubTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 100, 40));

        jLabelRif13.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif13.setText("Al firmar este documento, el cliente acepta los servicios y condiciones de vigilancia");
        jPanel1.add(jLabelRif13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 620, 20));

        txtTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(153, 153, 153));
        txtTotal.setBorder(null);
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 120, 30));

        jLabelRif14.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabelRif14.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif14.setText("Total");
        jPanel1.add(jLabelRif14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 100, 20));

        jLabel11.setMaximumSize(new java.awt.Dimension(252, 2));
        jLabel11.setMinimumSize(new java.awt.Dimension(252, 2));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 800, 8));

        jLabelRif16.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif16.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif16.setText("SubTotal");
        jPanel1.add(jLabelRif16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 100, 20));

        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        btnagregar.setBackground(new java.awt.Color(51, 204, 0));
        btnagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, -1));

        jLabelRif12.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif12.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif12.setText("Cantidad Radio");
        jPanel1.add(jLabelRif12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 110, 20));

        txtMantenimientoBicicletas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtMantenimientoBicicletas.setForeground(new java.awt.Color(153, 153, 153));
        txtMantenimientoBicicletas.setBorder(null);
        txtMantenimientoBicicletas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMantenimientoBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMantenimientoBicicletasActionPerformed(evt);
            }
        });
        jPanel1.add(txtMantenimientoBicicletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 100, 40));

        jLabelRif17.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabelRif17.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRif17.setText("Mantenimiento Radio");
        jPanel1.add(jLabelRif17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, 20));

        txtMantenimientoRadio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtMantenimientoRadio.setForeground(new java.awt.Color(153, 153, 153));
        txtMantenimientoRadio.setBorder(null);
        txtMantenimientoRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMantenimientoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMantenimientoRadioActionPerformed(evt);
            }
        });
        jPanel1.add(txtMantenimientoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 100, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Security Group");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 190, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 500, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel12.setText("jLabel1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 190, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel13.setText("jLabel1");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 100, 10));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel15.setText("jLabel1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 120, 10));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas.imagenes/00CB82.jpg"))); // NOI18N
        jLabel16.setText("jLabel1");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 100, 10));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMantenimientoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMantenimientoRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMantenimientoRadioActionPerformed

    private void txtMantenimientoBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMantenimientoBicicletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMantenimientoBicicletasActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtCantidadRadiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadRadiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadRadiosActionPerformed

    private void txtPrecioAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioAdicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioAdicionalActionPerformed

    private void txtCantidadBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadBicicletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadBicicletasActionPerformed

    private void txtPrecioServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioServicioActionPerformed

    private void txtpreciounitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreciounitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciounitarioActionPerformed

    private void txtCantidadVigilantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVigilantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVigilantesActionPerformed

    private void txtRifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRifActionPerformed

    private void txtnumfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumfacActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Header;
    public javax.swing.JButton btnMinimizar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVolver;
    public javax.swing.JButton btnagregar;
    public javax.swing.JButton btnbuscar;
    public com.toedter.calendar.JDateChooser jDateChooserfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRif;
    private javax.swing.JLabel jLabelRif10;
    private javax.swing.JLabel jLabelRif11;
    private javax.swing.JLabel jLabelRif12;
    private javax.swing.JLabel jLabelRif13;
    private javax.swing.JLabel jLabelRif14;
    private javax.swing.JLabel jLabelRif16;
    private javax.swing.JLabel jLabelRif17;
    private javax.swing.JLabel jLabelRif2;
    private javax.swing.JLabel jLabelRif3;
    private javax.swing.JLabel jLabelRif4;
    private javax.swing.JLabel jLabelRif5;
    private javax.swing.JLabel jLabelRif6;
    private javax.swing.JLabel jLabelRif7;
    private javax.swing.JLabel jLabelRif8;
    private javax.swing.JLabel jLabelRif9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    public javax.swing.JTextField txtCantidadBicicletas;
    public javax.swing.JTextField txtCantidadRadios;
    public javax.swing.JTextField txtCantidadVigilantes;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtMantenimientoBicicletas;
    public javax.swing.JTextField txtMantenimientoRadio;
    public javax.swing.JTextField txtPrecioAdicional;
    public javax.swing.JTextField txtPrecioServicio;
    public javax.swing.JTextField txtRif;
    public javax.swing.JTextField txtSubTotal;
    public javax.swing.JTextField txtTotal;
    public javax.swing.JTextField txtcodigo;
    public javax.swing.JTextField txtnumfac;
    public javax.swing.JTextField txtpreciounitario;
    // End of variables declaration//GEN-END:variables
}

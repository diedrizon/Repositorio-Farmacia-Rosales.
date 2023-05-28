
package Vistas;

import Controlador.CRUD_Cliente;
import Controlador.Clase_Cliente;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.SQLException;
import Controlador_Conexion_DB.Conexion;
import java.awt.BorderLayout;
import java.sql.Connection;
import javax.swing.JPanel;



/**
 *
 * @author diedr
 */
public class InternalFrame_Cliente extends javax.swing.JInternalFrame {

    private JPanel panel;
     public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    public InternalFrame_Cliente() {
        // Configuración del JInternalFrame
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setTitle("Internal Frame Cliente");
        setSize(100, 600);

        // Crear el panel
        panel = new JPanel();
        // Configurar el panel con los componentes y diseño deseado

        // Configurar el BorderLayout para el contenido del JInternalFrame
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
    
          initComponents();
    }

    public void limpiar() {
        JtextFiel_Nombre_1.setText("");
        JtextFiel_Nombre_2.setText("");
        jTextFiel_Apellido_1.setText("");
        jTextField_Apellido_2.setText("");
        jTextField_telefono.setText("");
        jTextArea_Dirrecion.setText("");

        
    }
    
    public void guardarCliente() {
    CRUD_Cliente cc = new CRUD_Cliente();
    int Id_Cliente = Integer.parseInt(jTextField_Id_Ciente.getText());
    String Nombre_1 = JtextFiel_Nombre_1.getText();
    String Nombre_2 = JtextFiel_Nombre_2.getText();
    String Apellido_1 = jTextFiel_Apellido_1.getText();
    String Apellido_2 = jTextField_Apellido_2.getText();
    String Telefono = jTextField_telefono.getText();
    String Direccion = jTextArea_Dirrecion.getText();

    Clase_Cliente cl = new Clase_Cliente(Id_Cliente, Nombre_1, Nombre_2, Apellido_1, Apellido_2, Telefono, Direccion);
    cc.Guardar(cl);
}
    
     public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUD_Cliente cli = new CRUD_Cliente();
            modelo = cli.mostrarDatos();
            jTable_Cliente.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       


    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Dirrecion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        JtextFiel_Nombre_2 = new javax.swing.JTextField();
        JtextFiel_Nombre_1 = new javax.swing.JTextField();
        jTextField_Apellido_2 = new javax.swing.JTextField();
        jTextFiel_Apellido_1 = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jButton_Buscar_Cliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField_Buscar = new javax.swing.JTextField();
        jTextField_Id_Ciente = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton_Editar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Borrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id Cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Nombre 1");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Nombre 2");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Apellido 1");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Apellido 2");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Dirección");

        jTextArea_Dirrecion.setColumns(20);
        jTextArea_Dirrecion.setRows(5);
        jTextArea_Dirrecion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea_Dirrecion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea_Dirrecion(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea_Dirrecion);

        JtextFiel_Nombre_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtextFiel_Nombre_2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        JtextFiel_Nombre_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextFiel_Nombre_2(evt);
            }
        });

        JtextFiel_Nombre_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtextFiel_Nombre_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        JtextFiel_Nombre_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextFiel_nombre1(evt);
            }
        });

        jTextField_Apellido_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Apellido_2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_Apellido_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Apellido_2(evt);
            }
        });

        jTextFiel_Apellido_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFiel_Apellido_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextFiel_Apellido_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiel_Apellido_1(evt);
            }
        });

        jTextField_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(JtextFiel_Nombre_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(217, 217, 217))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtextFiel_Nombre_2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFiel_Apellido_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Apellido_2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(61, 61, 61)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtextFiel_Nombre_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiel_Apellido_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Apellido_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextFiel_Nombre_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 710, -1));

        jButton_Buscar_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/Buscar.png"))); // NOI18N
        jButton_Buscar_Cliente.setBorder(null);
        jButton_Buscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Buscar_Cliente(evt);
            }
        });
        jPanel1.add(jButton_Buscar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 20, 20));

        jTable_Cliente.setForeground(new java.awt.Color(0, 153, 153));
        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id cliente", "Nombre 1", "Nombre 2", "Apellido 1", "Apellido 2", "Telefono", "Dirección"
            }
        ));
        jTable_Cliente.setGridColor(new java.awt.Color(0, 153, 153));
        jTable_Cliente.setShowGrid(false);
        jTable_Cliente.setShowHorizontalLines(true);
        jTable_Cliente.setShowVerticalLines(true);
        jTable_Cliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_Cliente(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable_ClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable_ClienteMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Cliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 661, 130));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/casa.png"))); // NOI18N
        jButton5.setText("Inicio");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/anadir.png"))); // NOI18N
        jButton7.setText("Cliente");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/anadir-al-carrito.png"))); // NOI18N
        jButton11.setText("Venta");
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton11.setBorderPainted(false);

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/frasco-de-pastillas.png"))); // NOI18N
        jButton12.setText("Producto");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton12.setBorderPainted(false);

        jButton10.setBackground(new java.awt.Color(0, 153, 153));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/repartidor.png"))); // NOI18N
        jButton10.setText("Proveedor");
        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton10.setBorderPainted(false);

        jButton13.setBackground(new java.awt.Color(0, 153, 153));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/lista-de-la-compra.png"))); // NOI18N
        jButton13.setText("Compra");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton13.setBorderPainted(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton5)
                .addGap(56, 56, 56)
                .addComponent(jButton7)
                .addGap(57, 57, 57)
                .addComponent(jButton11)
                .addGap(58, 58, 58)
                .addComponent(jButton12)
                .addGap(70, 70, 70)
                .addComponent(jButton10)
                .addGap(70, 70, 70)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton10)
                    .addComponent(jButton13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        jTextField_Buscar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField_Buscar.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_Buscar.setText("Buscar");
        jTextField_Buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Buscar(evt);
            }
        });
        jPanel1.add(jTextField_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, -1));

        jTextField_Id_Ciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Id_Ciente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField_Id_Ciente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Id_Ciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Id_Ciente(evt);
            }
        });
        jPanel1.add(jTextField_Id_Ciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 130, 20));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/agregar-usuario.png"))); // NOI18N
        jButton6.setText("Agregar");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_Cliente(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 93, -1));

        jButton_Editar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Editar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_Editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/Editar Usuario.png"))); // NOI18N
        jButton_Editar.setText("Editar");
        jButton_Editar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Editar(evt);
            }
        });
        jPanel1.add(jButton_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 93, -1));

        jButton_Actualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Actualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/Actualizar uduario.png"))); // NOI18N
        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Actualizar(evt);
            }
        });
        jPanel1.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        jButton_Borrar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Borrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_Borrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas_Iconos/Eliminar usuario.png"))); // NOI18N
        jButton_Borrar.setText("Eliminar");
        jButton_Borrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Borrar(evt);
            }
        });
        jPanel1.add(jButton_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Cliente(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_Cliente
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_Cliente

    private void jTable_ClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ClienteMouseEntered

    private void jTable_ClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClienteMouseExited
       
    }//GEN-LAST:event_jTable_ClienteMouseExited

    private void jTextArea_Dirrecion(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea_Dirrecion
        
    }//GEN-LAST:event_jTextArea_Dirrecion

    private void Guardar_Cliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_Cliente
        CRUD_Cliente cl = new CRUD_Cliente();
        try {
            if ((JtextFiel_Nombre_1.getText().equals(""))
                    || (JtextFiel_Nombre_2.getText().equals(""))
                    || (jTextFiel_Apellido_1.getText().equals(""))
                    || (jTextField_Apellido_2.getText().equals(""))
                    || (jTextField_telefono.getText().equals("    -    "))
                    || (jTextArea_Dirrecion.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                    guardarCliente();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_Guardar_Cliente

    private void jButton_Buscar_Cliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Buscar_Cliente
       try {
         DefaultTableModel modelo;
          CRUD_Cliente cli = new CRUD_Cliente();
    modelo = cli.buscarDatos(jTextField_Buscar.getText());
    if (jTextField_Buscar.getText().equals("Escribe el Id, nombres o apellidos")
       || jTextField_Buscar.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
        jTextField_Buscar.setText("Escribe el Id, nombres o apellidos");
        jTextField_Buscar.setForeground(Color.GRAY);
        mostrar();
    } else {
        jTable_Cliente.setModel(modelo);
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_jButton_Buscar_Cliente

    private void jButton_Editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Editar
     int filaSeleccionada = jTable_Cliente.getSelectedRow();
if (filaSeleccionada == -1) {
    JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla para editar");
} else {
    String Id_Cliente = jTable_Cliente.getValueAt(filaSeleccionada, 0) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 0).toString() : "";

    String nombre1 = jTable_Cliente.getValueAt(filaSeleccionada, 1) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 1).toString() : "";
    String nombre2 = jTable_Cliente.getValueAt(filaSeleccionada, 2) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 2).toString() : "";
    String apellido1 = jTable_Cliente.getValueAt(filaSeleccionada, 3) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 3).toString() : "";
    String apellido2 = jTable_Cliente.getValueAt(filaSeleccionada, 4) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 4).toString() : "";
    String telefono = jTable_Cliente.getValueAt(filaSeleccionada, 5) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 5).toString() : "";
    String direccion = jTable_Cliente.getValueAt(filaSeleccionada, 6) != null ? jTable_Cliente.getValueAt(filaSeleccionada, 6).toString() : "";

    jTextField_Id_Ciente.setText(Id_Cliente);
    JtextFiel_Nombre_1.setText(nombre1);
    JtextFiel_Nombre_2.setText(nombre2);
    jTextFiel_Apellido_1.setText(apellido1);
    jTextField_Apellido_2.setText(apellido2);
    jTextField_telefono.setText(telefono);
    jTextArea_Dirrecion.setText(direccion);

    // Desactivar la edición del campo de texto para el ID del cliente
    jTextField_Id_Ciente.setEditable(false);
}



    }//GEN-LAST:event_jButton_Editar

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField_Buscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Buscar
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Buscar

    private void JtextFiel_nombre1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextFiel_nombre1
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextFiel_nombre1

    private void JtextFiel_Nombre_2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextFiel_Nombre_2
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextFiel_Nombre_2

    private void jTextFiel_Apellido_1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiel_Apellido_1
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiel_Apellido_1

    private void jTextField_Id_Ciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Id_Ciente
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Id_Ciente

    private void jTextField_Apellido_2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Apellido_2
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Apellido_2

    private void jTextField_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoActionPerformed

    private void jButton_Actualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Actualizar
    String nombre1 = JtextFiel_Nombre_1.getText();
    String nombre2 = JtextFiel_Nombre_2.getText();
    String apellido1 = jTextFiel_Apellido_1.getText();
    String apellido2 = jTextField_Apellido_2.getText();
    String numeroCelular = jTextField_telefono.getText();
    String direccion = jTextArea_Dirrecion.getText();

    try {
        String query = "{call ActualizarCliente( ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement cbst = cn.prepareCall(query);
        cbst.setInt(1, Integer.parseInt(jTextField_Id_Ciente.getText())); 
        cbst.setString(2, nombre1);
        cbst.setString(3, nombre2);
        cbst.setString(4, apellido1);
        cbst.setString(5, apellido2);
        cbst.setString(6, numeroCelular);
        cbst.setString(7, direccion);

        // Ejecutar la actualización en la base de datos
        cbst.executeUpdate();

        // Restablecer los campos de texto
        JtextFiel_Nombre_1.setText("");
        JtextFiel_Nombre_2.setText("");
        jTextFiel_Apellido_1.setText("");
        jTextField_Apellido_2.setText("");
        jTextField_telefono.setText("");
        jTextArea_Dirrecion.setText("");
        jTextField_Id_Ciente.setEditable(true);

        JOptionPane.showMessageDialog(this, "Actualización realizada con éxito");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar los datos: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton_Actualizar

    private void jButton_Borrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Borrar
    int fila = this.jTable_Cliente.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione el registro de la tabla");
    } else {
        int cod = Integer.parseInt(this.jTable_Cliente.getValueAt(fila, 0).toString());
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCliente(?)}");
            cbst.setInt(1, cod);
            cbst.executeUpdate();
            
            // Eliminar la fila seleccionada de la tabla
            DefaultTableModel modelo = (DefaultTableModel) jTable_Cliente.getModel();
            modelo.removeRow(fila);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
}


    }//GEN-LAST:event_jButton_Borrar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextFiel_Nombre_1;
    private javax.swing.JTextField JtextFiel_Nombre_2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_Buscar_Cliente;
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Cliente;
    private javax.swing.JTextArea jTextArea_Dirrecion;
    private javax.swing.JTextField jTextFiel_Apellido_1;
    private javax.swing.JTextField jTextField_Apellido_2;
    private javax.swing.JTextField jTextField_Buscar;
    private javax.swing.JTextField jTextField_Id_Ciente;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}

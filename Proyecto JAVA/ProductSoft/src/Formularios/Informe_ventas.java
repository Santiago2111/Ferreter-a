package Formularios;

import Clases.Cls_Entrada;
import Clases.Cls_Inventario;
import Clases.Cls_Salida;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;

public class Informe_ventas extends javax.swing.JInternalFrame {

    private final Cls_Salida CP;
    TableColumnModel columnModel;
    public static int enviar = 0;
    int num = 0;
    public Informe_ventas() {
       
        initComponents();
        CP = new Cls_Salida();
        columnModel = jtb_inventario.getColumnModel();
        bt_factura.setEnabled(false);
        listar();
    }

    private void listar() {
        jtb_inventario.setModel(CP.getDatosSalida());
        columnModel.getColumn(1).setPreferredWidth(300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_inventario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bt_factura = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ferreteria \"El mundo de las herramientas\"");

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        jtb_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtb_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_inventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_inventario);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informe de Ventas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Informe de productos vendidos.");

        bt_factura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_factura.setForeground(new java.awt.Color(255, 255, 255));
        bt_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ic_factura.png"))); // NOI18N
        bt_factura.setText("Ver factura");
        bt_factura.setBorderPainted(false);
        bt_factura.setContentAreaFilled(false);
        bt_factura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_facturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(63, 63, 63)
                        .addComponent(bt_factura)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(bt_factura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_inventarioMouseClicked
        bt_factura.setEnabled(true);
    }//GEN-LAST:event_jtb_inventarioMouseClicked

    private void bt_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_facturaActionPerformed
        int row = jtb_inventario.getSelectedRow();
        String factura = jtb_inventario.getValueAt(row, 0).toString();
        String descripcion = jtb_inventario.getValueAt(row, 1).toString();
        String fecha = jtb_inventario.getValueAt(row, 2).toString();
        String codigo = jtb_inventario.getValueAt(row, 3).toString();
        int cantidad = (int) jtb_inventario.getValueAt(row, 4);
        int precio=(int) jtb_inventario.getValueAt(row, 5);
        int total=cantidad*precio;
      
       //Factura fac= new Factura(factura,descripcion,fecha,cantidad,precio,total);
        //fac.setSize(465, 417);
        //fac.show();
        
        Factura_venta factu=new Factura_venta(factura, descripcion, fecha, cantidad, precio, total);
        factu.setVisible(true);
      
     
       
        //JPanel dg= new JPanel();
        //gh.setSize(700, 500);
        
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular la posición para centrar la ventana en la pantalla
        //int x = (screenSize.width - gh.getWidth()) / 2;
        //int y = (screenSize.height - gh.getHeight()) / 2;
        //gh.setLocation(x,y);
       
       
       // JLabel n1=new JLabel(cantidad);
       
       
 //n1.setBounds(1, 1, 0, 0);     
 //n1.setLocation(50, 100);
 //gh.add(new JLabel("hola"));

   //     gh.setVisible(true);
     //   bt_factura.setEnabled(false);


     
    }//GEN-LAST:event_bt_facturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_factura;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_inventario;
    // End of variables declaration//GEN-END:variables
}

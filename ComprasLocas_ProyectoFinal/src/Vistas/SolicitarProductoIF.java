/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

/**
 *
 * @author ariel
 */
public class SolicitarProductoIF extends javax.swing.JInternalFrame {

    /** Creates new form SolicitarProductoIF */
    public SolicitarProductoIF() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AzulIzq = new javax.swing.JLabel();
        AzulDer = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Solicitar Productos");
        setMaximumSize(new java.awt.Dimension(1008, 605));
        setMinimumSize(new java.awt.Dimension(1008, 605));
        setPreferredSize(new java.awt.Dimension(1008, 605));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Solicitar Productos a Proveedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 33, -1, -1));

        jLabel2.setText("Producto :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 181, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 101, 306, -1));

        jLabel3.setText("Unidades :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 265, -1, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 151, -1));

        jLabel4.setText("Fecha :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 334, -1, 29));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 334, 306, -1));

        jLabel5.setText("Proveedor :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 106, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 176, 306, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 91, -1, 336));

        jButton1.setText("Agregar al Carrito");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 501, 352, -1));

        jButton2.setText("Comprar Todo");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 501, 206, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Carrito");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 33, -1, -1));

        jButton3.setText("Eliminar Item");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 501, 218, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 459, 229, -1));

        jLabel7.setText("Precio Total");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 463, -1, -1));

        AzulIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul.png"))); // NOI18N
        AzulIzq.setMaximumSize(new java.awt.Dimension(905, 593));
        AzulIzq.setMinimumSize(new java.awt.Dimension(905, 593));
        AzulIzq.setPreferredSize(new java.awt.Dimension(905, 593));
        getContentPane().add(AzulIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 560));

        AzulDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul.png"))); // NOI18N
        AzulDer.setMaximumSize(new java.awt.Dimension(905, 593));
        AzulDer.setMinimumSize(new java.awt.Dimension(905, 593));
        AzulDer.setPreferredSize(new java.awt.Dimension(905, 593));
        getContentPane().add(AzulDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 490, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AzulDer;
    private javax.swing.JLabel AzulIzq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}

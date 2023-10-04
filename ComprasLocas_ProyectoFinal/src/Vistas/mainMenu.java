/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ComprasData;
import AccesoADatos.DetalleData;
import AccesoADatos.ProductosData;
import AccesoADatos.ProveedorData;
import Entidades.Productos;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class mainMenu extends javax.swing.JFrame {

    private ProductosData prodD;
    private ProveedorData provD;
    private ComprasData compD;
    private DetalleData detaD;
    
    public mainMenu() {
        this.prodD = new ProductosData();
        this.provD = new ProveedorData();
        this.compD = new ComprasData();
        this.detaD = new DetalleData();
        initComponents();
        setLocationRelativeTo(null);
        loggin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        ProductosB = new javax.swing.JButton();
        SolicitarB = new javax.swing.JButton();
        ProveedoresB = new javax.swing.JButton();
        HistorialB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setMaximumSize(new java.awt.Dimension(1010, 610));
        Escritorio.setMinimumSize(new java.awt.Dimension(1010, 610));
        Escritorio.setPreferredSize(new java.awt.Dimension(1010, 610));

        ProductosB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.png"))); // NOI18N
        ProductosB.setMaximumSize(new java.awt.Dimension(100, 100));
        ProductosB.setMinimumSize(new java.awt.Dimension(100, 100));
        ProductosB.setPreferredSize(new java.awt.Dimension(100, 100));
        ProductosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosBActionPerformed(evt);
            }
        });

        SolicitarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SolicitarCompra.png"))); // NOI18N
        SolicitarB.setMaximumSize(new java.awt.Dimension(100, 100));
        SolicitarB.setMinimumSize(new java.awt.Dimension(100, 100));
        SolicitarB.setPreferredSize(new java.awt.Dimension(100, 100));
        SolicitarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarBActionPerformed(evt);
            }
        });

        ProveedoresB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.png"))); // NOI18N
        ProveedoresB.setMaximumSize(new java.awt.Dimension(100, 100));
        ProveedoresB.setMinimumSize(new java.awt.Dimension(100, 100));
        ProveedoresB.setPreferredSize(new java.awt.Dimension(100, 100));
        ProveedoresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresBActionPerformed(evt);
            }
        });

        HistorialB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Historial.png"))); // NOI18N
        HistorialB.setMaximumSize(new java.awt.Dimension(100, 100));
        HistorialB.setMinimumSize(new java.awt.Dimension(100, 100));
        HistorialB.setPreferredSize(new java.awt.Dimension(100, 100));
        HistorialB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialBActionPerformed(evt);
            }
        });

        jLabel1.setText("Productos");

        jLabel2.setText("Historial de Compras");

        jLabel3.setText("Gestionar Proveedores");

        jLabel4.setText("Solicitar Productos");

        Escritorio.setLayer(ProductosB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(SolicitarB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(ProveedoresB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(HistorialB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addGap(205, 205, 205)
                .addComponent(jLabel3)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addComponent(HistorialB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(SolicitarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(301, 301, 301))
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(ProductosB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(ProveedoresB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(255, 255, 255))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProveedoresB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductosB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistorialB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SolicitarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));
        Escritorio.getAccessibleContext().setAccessibleName("");

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosBActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductoIF mostrar = new ProductoIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
        botones();
    }//GEN-LAST:event_ProductosBActionPerformed

    private void ProveedoresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresBActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AdminProveedoresIF mostrar = new AdminProveedoresIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
        botones();
    }//GEN-LAST:event_ProveedoresBActionPerformed

    private void SolicitarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarBActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        SolicitarProductoIF mostrar = new SolicitarProductoIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
        botones();
    }//GEN-LAST:event_SolicitarBActionPerformed

    private void HistorialBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialBActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        HistorialCompraIF mostrar = new HistorialCompraIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
        botones();
    }//GEN-LAST:event_HistorialBActionPerformed

    private void loggin(){
        LoginIF mostrar = new LoginIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
    }
    
    private void botones(){
        Escritorio.add(SolicitarB);
        Escritorio.add(ProductosB);
        Escritorio.add(ProveedoresB);
        Escritorio.add(HistorialB);
        Escritorio.add(jLabel1);
        Escritorio.add(jLabel2);
        Escritorio.add(jLabel3);
        Escritorio.add(jLabel4);
    }
    
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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton HistorialB;
    private javax.swing.JButton ProductosB;
    private javax.swing.JButton ProveedoresB;
    private javax.swing.JButton SolicitarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    
    public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

}

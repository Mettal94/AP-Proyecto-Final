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
import static Vistas.mainMenu.Escritorio;

public class HistorialCompraIF extends javax.swing.JInternalFrame {

    private ComprasData compD;
    private ProveedorData provD;
    private ProductosData prodD;
    private DetalleData detaD;
    /**
     * Creates new form HistorialCompraIF
     */
    public HistorialCompraIF(ComprasData compD, ProductosData prodD, ProveedorData provD, DetalleData detaD) {
        this.compD = compD;
        this.prodD = prodD;
        this.provD = provD;
        this.detaD = detaD;
        initComponents();
        setSize(500,350);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comprasRealizadaB = new javax.swing.JButton();
        ProveedorB = new javax.swing.JButton();
        StockB = new javax.swing.JButton();

        setClosable(true);
        setTitle("Historial de Compras");

        comprasRealizadaB.setText("Compras Realizadas");
        comprasRealizadaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasRealizadaBActionPerformed(evt);
            }
        });

        ProveedorB.setText("Proveedores");
        ProveedorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorBActionPerformed(evt);
            }
        });

        StockB.setText("Consultas Stock");
        StockB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(comprasRealizadaB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(ProveedorB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(StockB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprasRealizadaB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(StockB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProveedorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorBActionPerformed

        ProveedoresIF mostrar = new ProveedoresIF(provD, prodD, compD);
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
       
    }//GEN-LAST:event_ProveedorBActionPerformed

    private void comprasRealizadaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasRealizadaBActionPerformed

        ComprasRealizadasIF mostrar = new ComprasRealizadasIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
    }//GEN-LAST:event_comprasRealizadaBActionPerformed

    private void StockBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockBActionPerformed
 
        ConsultaStockIF mostrar = new ConsultaStockIF();
        mostrar.setVisible(true);
        Escritorio.add(mostrar);
        Escritorio.moveToFront(mostrar);
    }//GEN-LAST:event_StockBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProveedorB;
    private javax.swing.JButton StockB;
    private javax.swing.JButton comprasRealizadaB;
    // End of variables declaration//GEN-END:variables
}

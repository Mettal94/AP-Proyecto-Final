/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ComprasData;
import AccesoADatos.ProductosData;
import AccesoADatos.ProveedorData;
import Entidades.Compras;
import Entidades.Productos;
import Entidades.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Servidor
 */
public class ProveedoresIF extends javax.swing.JInternalFrame {

    private ProductosData prodD;
    private ProveedorData provD;
    private ComprasData compD;
 private DefaultTableModel modelo1 = new DefaultTableModel();
 private DefaultTableModel modelo2 = new DefaultTableModel();
 List<Proveedor> listaProv = new ArrayList<>();
 List<Productos> listaProd = new ArrayList<>();
 List<Compras> listaComp = new ArrayList<>();
 
    public ProveedoresIF(ProveedorData provD, ProductosData prodD, ComprasData compD) {
        this.prodD = prodD;
        this.provD = provD;
        this.compD = compD;
        initComponents();
        armarCabeceraPro();
        armarCabeceraCompra();
        llenarComboBox();
//        setSize(450, 500);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProveedoresJCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompra = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPro = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        FondoProvIzq = new javax.swing.JLabel();
        FondoProvDer = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1010, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProveedoresJCB.setBackground(new java.awt.Color(20, 143, 119));
        ProveedoresJCB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ProveedoresJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresJCBActionPerformed(evt);
            }
        });
        getContentPane().add(ProveedoresJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 11, 353, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Compras por Proveedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        TablaCompra.setBackground(new java.awt.Color(20, 143, 119));
        TablaCompra.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        TablaCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCompra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 81, 368, 456));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Lista de Productos por Proveedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        TablaPro.setBackground(new java.awt.Color(20, 143, 119));
        TablaPro.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        TablaPro.setForeground(new java.awt.Color(255, 255, 255));
        TablaPro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaPro);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 81, 391, 456));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Seleccione un Proveedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        FondoProvIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoProvIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 530));

        FondoProvDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoProvDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 490, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProveedoresJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresJCBActionPerformed
        // Seleccion en el comboBox
        listaProd = prodD.listarProductos(1);
        for (Productos prod : listaProd) {
            modelo1.addRow(new Object[]{prod.getNombre(), prod.getRubro(), prod.getPrecioActual(), prod.getStock()});
        }
        
        Proveedor prov = (Proveedor) ProveedoresJCB.getSelectedItem();
        int id = prov.getIdProveedor();
        listaComp = compD.comprasPorProveedor(id);
        for (Compras compra : listaComp) {
            modelo2.addRow(new Object[]{compra.getIdCompra(), compra.getFecha(), compra.getPrecioTotal()});
        }
    }//GEN-LAST:event_ProveedoresJCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoProvDer;
    private javax.swing.JLabel FondoProvIzq;
    private javax.swing.JComboBox<Proveedor> ProveedoresJCB;
    private javax.swing.JTable TablaCompra;
    private javax.swing.JTable TablaPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    public void armarCabeceraPro(){
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Rubro");
        modelo1.addColumn("Precio");
        modelo1.addColumn("Cantidad");
        TablaPro.setModel(modelo1);
    }
    public void armarCabeceraCompra(){
        modelo2.addColumn("ID");
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Precio Total de la Compra");
        TablaCompra.setModel(modelo2);
    }
    
    public void llenarComboBox(){
        
        listaProv = provD.listarProveedores(1);
        
        for (Proveedor proveedor : listaProv) {
            ProveedoresJCB.addItem(proveedor);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ProductosData;
import Entidades.Productos;
import static Vistas.mainMenu.Escritorio;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Servidor
 */
public class ConsultaStockIF extends javax.swing.JInternalFrame {
  private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
  List<Productos> listFaltante = new ArrayList<>();
  private ProductosData prodD;
    public ConsultaStockIF(ProductosData prodD) {
        this.prodD = prodD;
        initComponents();
        armarCabecera();
        Stock();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaStockFalt = new javax.swing.JTable();
        FondoStIzq = new javax.swing.JLabel();
        FondoStDer = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Control de Stock");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Productos con stock  menor a diez: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        ListaStockFalt.setBackground(new java.awt.Color(20, 143, 119));
        ListaStockFalt.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        ListaStockFalt.setForeground(new java.awt.Color(255, 255, 255));
        ListaStockFalt.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ListaStockFalt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 80, 779, 453));

        FondoStIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoStIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        FondoStDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoStDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoStDer;
    private javax.swing.JLabel FondoStIzq;
    private javax.swing.JTable ListaStockFalt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

 
private void Stock(){
    
 listFaltante = prodD.listarStockFaltante();
        for (Productos prod : listFaltante) {
            modelo.addRow(new Object[]{prod.getIdProducto() ,prod.getNombre(), prod.getDescripcion(), prod.getPrecioActual(), prod.getStock()});
        }

}

public void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        ListaStockFalt.setModel(modelo);
      
    }



}

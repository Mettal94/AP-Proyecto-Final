/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ComprasData;
import AccesoADatos.DetalleData;
import AccesoADatos.ProductosData;
import Entidades.Compras;
import Entidades.DetalleDeCompras;
import Entidades.Productos;
import static Vistas.mainMenu.mensaje;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Servidor
 */
public class ComprasRealizadasIF extends javax.swing.JInternalFrame {

    private ComprasData compD;
    private DetalleData detaD;
    private ProductosData prodD;
    private DefaultTableModel modelo1 = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modelo2 = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modelo3 = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    List<Compras> listaCompras = new ArrayList<>();
    List<DetalleDeCompras> listaDetalles = new ArrayList<>();
    List<Productos> listaProd = new ArrayList<>();
    List<DetalleDeCompras> listaUltimaCompra = new ArrayList<>();
    
    
    public ComprasRealizadasIF(ComprasData compD, DetalleData detaD, ProductosData prodD) {
        this.compD = compD;
        this.detaD = detaD;
        this.prodD = prodD;
        initComponents();
        cargarJCB();
        armarCabeceras();
        listarPorProd();
        ultimaCompra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FechaDesde = new com.toedter.calendar.JDateChooser();
        FechaHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPorFecha = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPorProd = new javax.swing.JTable();
        ProductosJCB = new javax.swing.JComboBox<>();
        BuscarB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ultimaCompraT = new javax.swing.JTable();
        FondoIzq = new javax.swing.JLabel();
        FondoDer = new javax.swing.JLabel();

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
        jScrollPane3.setViewportView(jTable1);

        setClosable(true);
        setTitle("Compras Realizadas");
        setPreferredSize(new java.awt.Dimension(1010, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Busqueda por Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Desde");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 59, -1, 29));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Hasta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 59, -1, 29));

        FechaDesde.setBackground(new java.awt.Color(20, 143, 119));
        getContentPane().add(FechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 59, 146, -1));

        FechaHasta.setBackground(new java.awt.Color(20, 143, 119));
        getContentPane().add(FechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 59, 146, -1));

        TablaPorFecha.setBackground(new java.awt.Color(20, 143, 119));
        TablaPorFecha.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        TablaPorFecha.setForeground(new java.awt.Color(255, 255, 255));
        TablaPorFecha.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaPorFecha);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 125, 404, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Busqueda por Productos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Producto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 96, -1, -1));

        TablaPorProd.setBackground(new java.awt.Color(20, 143, 119));
        TablaPorProd.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        TablaPorProd.setForeground(new java.awt.Color(255, 255, 255));
        TablaPorProd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaPorProd);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 126, 417, 260));

        ProductosJCB.setBackground(new java.awt.Color(20, 143, 119));
        ProductosJCB.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        ProductosJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosJCBActionPerformed(evt);
            }
        });
        getContentPane().add(ProductosJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 96, 287, -1));

        BuscarB.setBackground(new java.awt.Color(14, 98, 81));
        BuscarB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BuscarB.setForeground(new java.awt.Color(255, 255, 255));
        BuscarB.setText("Buscar");
        BuscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 96, 404, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Última Compra");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        ultimaCompraT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(ultimaCompraT);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 460, 90));

        FondoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 580));

        FondoDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 490, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductosJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosJCBActionPerformed
        // Seleccion en el comboBox
        listarPorProd();
        
    }//GEN-LAST:event_ProductosJCBActionPerformed

    private void BuscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBActionPerformed
        //Busqueda por fecha
        borrarFilasPorFecha();
        try{
        java.util.Date fechaA = FechaDesde.getDate();
        LocalDate fecha1 = fechaA.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        java.util.Date fechaB = FechaHasta.getDate();
        LocalDate fecha2 = fechaB.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (fecha1.isAfter(fecha2)) {
            mensaje("La primer fecha no puede ser posterior a la segunda.");
            return;
        }
        List <Compras> listaCom = new ArrayList<>();
        List <DetalleDeCompras> listaDet = new ArrayList<>();
        listaCom = compD.BusquedaPorFecha(fecha1, fecha2);
        
        for (Compras LCompra : listaCom) {
            listaDet = detaD.BusquedaPorIdComp(LCompra.getIdCompra());
            
            for (DetalleDeCompras detalle : listaDet) {
                
                modelo2.addRow(new Object[]{LCompra.getFecha(), LCompra.getProveedor().getRazonSocial() , detalle.getProducto().getNombre(), detalle.getPrecioCosto(), detalle.getCantidad() });
            }
        listaDet.clear();
        }
        }catch(NullPointerException ex){
            mensaje("Error al Seleccionar las fechas");
            System.out.println(ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_BuscarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarB;
    private com.toedter.calendar.JDateChooser FechaDesde;
    private com.toedter.calendar.JDateChooser FechaHasta;
    private javax.swing.JLabel FondoDer;
    private javax.swing.JLabel FondoIzq;
    private javax.swing.JComboBox<Productos> ProductosJCB;
    private javax.swing.JTable TablaPorFecha;
    private javax.swing.JTable TablaPorProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable ultimaCompraT;
    // End of variables declaration//GEN-END:variables


    public void armarCabeceras(){
        
        modelo1.addColumn("ID");
        modelo1.addColumn("Cantidad");
        modelo1.addColumn("Costo");
        modelo1.addColumn("Fecha");
        TablaPorProd.setModel(modelo1);
        
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Proveedor");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Costo");
        modelo2.addColumn("Cantidad");
        TablaPorFecha.setModel(modelo2);
        
        modelo3.addColumn("ID Detalle");
        modelo3.addColumn("Nombre");
        modelo3.addColumn("Cantidad");
        modelo3.addColumn("Costo");
        ultimaCompraT.setModel(modelo3);
        
    }
    
    public void cargarJCB(){
        listaProd = prodD.listarProductos(1);
        
        for (Productos productitos : listaProd) {
            ProductosJCB.addItem(productitos);
        }
    }
    
      
    public void borrarFilasProd(){
         try{   
            int f = TablaPorProd.getRowCount() - 1;
            for (; f >= 0; f--) {
                modelo1.removeRow(f);
            }
         }catch(ArrayIndexOutOfBoundsException ex){
             System.out.println(ex.getMessage());
         }  
    }
      
    public void borrarFilasPorFecha(){
         try{   
            int f = TablaPorFecha.getRowCount() - 1;
            for (; f >= 0; f--) {
                modelo2.removeRow(f);
            }
         }catch(ArrayIndexOutOfBoundsException ex){
             System.out.println(ex.getMessage());
         }  
    }
    
    public void listarPorProd(){
        try{    
            borrarFilasProd();
            Productos prod = (Productos) ProductosJCB.getSelectedItem();
            int id = prod.getIdProducto();

            listaDetalles = detaD.consultarPorIdProd(id);

            for (DetalleDeCompras deta : listaDetalles) {
                modelo1.addRow(new Object[]{deta.getIdDetalle(), deta.getCantidad(), deta.getPrecioCosto(), deta.getCompra().getFecha()});
            }
          }catch(ArrayIndexOutOfBoundsException ex){
              System.out.println(ex.getMessage());
          }  
        }
    
    public void ultimaCompra(){
        
        listaUltimaCompra = detaD.ultimaCompra();
        for (DetalleDeCompras ulti : listaUltimaCompra) {
            modelo3.addRow(new Object[]{ ulti.getIdDetalle(), ulti.getProducto().getNombre(), ulti.getCantidad(), ulti.getPrecioCosto()});
        }
    }
}

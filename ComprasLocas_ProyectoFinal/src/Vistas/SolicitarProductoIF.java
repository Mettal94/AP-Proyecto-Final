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
import Entidades.Compras;
import Entidades.DetalleDeCompras;
import Entidades.Productos;
import Entidades.Proveedor;
import static Vistas.mainMenu.mensaje;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class SolicitarProductoIF extends javax.swing.JInternalFrame {

    private ComprasData compD;
    private ProductosData prodD;
    private ProveedorData provD;
    private DetalleData detaD;
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    List<Proveedor> listaProveedores = new ArrayList<>();
    List<Productos> listaProductos = new ArrayList<>();
    List<Productos> listaPrueba = new ArrayList<>();
    List<DetalleDeCompras> listaDetalles = new ArrayList<>();
    public SolicitarProductoIF(ComprasData compD, ProductosData prodD, ProveedorData provD, DetalleData detaD) {
        this.compD = compD;
        this.prodD = prodD;
        this.provD = provD;
        this.detaD = detaD;
        initComponents();
        armarCabecera();
        PrecioTotalT.setText(0+"");
        Fecha.setDate(Date.valueOf(LocalDate.now()));
        cargarJCBs();
        
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
        ProveedorJCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Stock = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        ProductosJCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComprasTabla = new javax.swing.JTable();
        AgregarB = new javax.swing.JButton();
        ComprarTodoB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        EliminarItemB = new javax.swing.JButton();
        PrecioTotalT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AzulIzq = new javax.swing.JLabel();
        AzulDer = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Solicitar Productos");
        setMaximumSize(new java.awt.Dimension(1008, 605));
        setMinimumSize(new java.awt.Dimension(1008, 605));
        setPreferredSize(new java.awt.Dimension(1010, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Solicitar Productos a Proveedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 181, -1, -1));

        ProveedorJCB.setBackground(new java.awt.Color(20, 143, 119));
        ProveedorJCB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ProveedorJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorJCBActionPerformed(evt);
            }
        });
        getContentPane().add(ProveedorJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 306, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Unidades:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 265, -1, -1));

        Stock.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Stock.setValue(1);
        getContentPane().add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 151, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 29));

        Fecha.setBackground(new java.awt.Color(20, 143, 119));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 306, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Proveedor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        ProductosJCB.setBackground(new java.awt.Color(20, 143, 119));
        ProductosJCB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(ProductosJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 306, -1));

        ComprasTabla.setBackground(new java.awt.Color(20, 143, 119));
        ComprasTabla.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ComprasTabla.setForeground(new java.awt.Color(255, 255, 255));
        ComprasTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ComprasTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 91, -1, 336));

        AgregarB.setBackground(new java.awt.Color(14, 98, 81));
        AgregarB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AgregarB.setForeground(new java.awt.Color(255, 255, 255));
        AgregarB.setText("Agregar al Carrito");
        AgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 430, -1));

        ComprarTodoB.setBackground(new java.awt.Color(14, 98, 81));
        ComprarTodoB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ComprarTodoB.setForeground(new java.awt.Color(255, 255, 255));
        ComprarTodoB.setText("Comprar Todo");
        ComprarTodoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarTodoBActionPerformed(evt);
            }
        });
        getContentPane().add(ComprarTodoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 206, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Carrito:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 33, -1, -1));

        EliminarItemB.setBackground(new java.awt.Color(14, 98, 81));
        EliminarItemB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EliminarItemB.setForeground(new java.awt.Color(255, 255, 255));
        EliminarItemB.setText("Eliminar Item");
        EliminarItemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarItemBActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarItemB, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 218, -1));

        PrecioTotalT.setEditable(false);
        PrecioTotalT.setBackground(new java.awt.Color(20, 143, 119));
        PrecioTotalT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PrecioTotalT.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PrecioTotalT, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 459, 229, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Precio Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 463, -1, -1));

        AzulIzq.setBackground(new java.awt.Color(20, 143, 119));
        AzulIzq.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AzulIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        AzulIzq.setMaximumSize(new java.awt.Dimension(905, 593));
        AzulIzq.setMinimumSize(new java.awt.Dimension(905, 593));
        AzulIzq.setPreferredSize(new java.awt.Dimension(905, 593));
        getContentPane().add(AzulIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 580));

        AzulDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        AzulDer.setMaximumSize(new java.awt.Dimension(905, 593));
        AzulDer.setMinimumSize(new java.awt.Dimension(905, 593));
        AzulDer.setPreferredSize(new java.awt.Dimension(905, 593));
        getContentPane().add(AzulDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 490, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarItemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarItemBActionPerformed
        // Boton para elimiar el producto de la tabla
        try{
            int fila = ComprasTabla.getSelectedRow();
            double precio = (double) ComprasTabla.getValueAt(fila, 3);
            System.out.println(precio);
            modelo.removeRow(fila);
            listaDetalles.remove(fila);
            double x = Double.parseDouble(PrecioTotalT.getText());
            int cantidadDeFilas = ComprasTabla.getRowCount();
            if(cantidadDeFilas <= 0){
                PrecioTotalT.setText(0+"");
            }else{
                PrecioTotalT.setText((x-precio)+"");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Debe seleccionar un producto de la tabla.");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_EliminarItemBActionPerformed

    private void AgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBActionPerformed
        // Boton para agregar al carrito
        int cantidad = (int) Stock.getValue();
        if(cantidad <= 0){
            mensaje("La cantidad solicitada no es válida");
        }else{
            agregadoCarrito();
        }
    }//GEN-LAST:event_AgregarBActionPerformed

    private void ComprarTodoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarTodoBActionPerformed
        // Boton comprar todo
        try{    
            Compras comp = new Compras();
            Proveedor prov = new Proveedor();
            prov = (Proveedor) ProveedorJCB.getSelectedItem();
            java.util.Date fechax = Fecha.getDate();
            LocalDate fechaCompra = fechax.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double precioTotal = Double.parseDouble(PrecioTotalT.getText());
            comp.setProveedor(prov);
            comp.setPrecioTotal(precioTotal);
            comp.setFecha(fechaCompra);
            System.out.println(fechaCompra);
            int idCompra = compD.nuevaCompra(comp);
            comp.setIdCompra(idCompra);
            
            int stockActual;
            int cantidad;
            int idProd;
            int stockActualizado;
            for (DetalleDeCompras detalles : listaDetalles) {
                detalles.setCompra(comp);
                idProd = detalles.getProducto().getIdProducto();
                stockActual = detalles.getProducto().getStock();
                cantidad = detalles.getCantidad();
                stockActualizado = stockActual+cantidad;
                prodD.modificarStock(idProd, stockActualizado);
                detaD.insertarDetalle(detalles);
            }
            borrarFilas();
            listaDetalles.clear();
            PrecioTotalT.setText(0+"");
            Fecha.setDate(Date.valueOf(LocalDate.now()));
        }catch(NullPointerException ex){
            mensaje("Hubo un error");
            System.out.println(ex.getMessage());
        }catch(NumberFormatException ex){
             mensaje("Hubo un error");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ComprarTodoBActionPerformed

    private void ProveedorJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorJCBActionPerformed
        // Cambio de proveedor
        if(ComprasTabla.getRowCount()>0){
            int decision = JOptionPane.showConfirmDialog(this, "Si cambia de proveedor se perderá la compra actual, proceder?");
            if(decision == 0){
                borrarFilas();
                PrecioTotalT.setText(0+"");
                Stock.setValue(1);
            }
        }
    }//GEN-LAST:event_ProveedorJCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarB;
    private javax.swing.JLabel AzulDer;
    private javax.swing.JLabel AzulIzq;
    private javax.swing.JButton ComprarTodoB;
    private javax.swing.JTable ComprasTabla;
    private javax.swing.JButton EliminarItemB;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JTextField PrecioTotalT;
    private javax.swing.JComboBox<Productos> ProductosJCB;
    private javax.swing.JComboBox<Proveedor> ProveedorJCB;
    private javax.swing.JSpinner Stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void borrarFilas(){
        int f = ComprasTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    public void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Precio Por Monto");
        ComprasTabla.setModel(modelo);
        
    }
    
    public void cargarJCBs(){
        listaProveedores = provD.listarProveedores(1);
        listaProductos = prodD.listarProductos(1);
        
        for (Proveedor listaProveedore : listaProveedores) {
            ProveedorJCB.addItem(listaProveedore);
        }
        for (Productos listaProducto : listaProductos) {
            ProductosJCB.addItem(listaProducto);
        }
    }
    
    public void agregadoCarrito(){
        try{
            Productos deseado = (Productos) ProductosJCB.getSelectedItem();
            int cantidad = (int) Stock.getValue();
            double costo = deseado.getPrecioActual();
            double costoMonto = costo*cantidad;
            int filas = ComprasTabla.getRowCount();
            double x = Double.parseDouble(PrecioTotalT.getText());
            boolean coincidencia = false;
            for (int i = 0; i < filas; i++) {
                int productoEnTabla = (int) ComprasTabla.getValueAt(i, 0);
                int cantidadEnTabla = (int) ComprasTabla.getValueAt(i, 2);
                double precioCostoEnTabla = (double) ComprasTabla.getValueAt(i, 4);
                if(deseado.getIdProducto()== productoEnTabla){
                    modelo.setValueAt((cantidad += cantidadEnTabla), i, 2);
                    modelo.setValueAt((precioCostoEnTabla + costoMonto), i, 4);
                    coincidencia = true;
                    break;
                }
            }
            PrecioTotalT.setText((x+costoMonto)+"");
            Stock.setValue(0);
            
            if(coincidencia == false){
                 modelo.addRow(new Object[]{deseado.getIdProducto(), deseado.getNombre(),cantidad,costo,costoMonto});
                 DetalleDeCompras deta = new DetalleDeCompras();
                 deta.setCantidad(cantidad);
                 deta.setPrecioCosto(costoMonto);
                 deta.setProducto(deseado);
                 deta.setEstado(true);
                 listaDetalles.add(deta);
            }else{
                for (DetalleDeCompras detalle : listaDetalles) {
                    int id = detalle.getProducto().getIdProducto();
                    int idDeseado = deseado.getIdProducto();
                    if(id == idDeseado){
                        detalle.setCantidad(cantidad);
                    }
                }
            }
           }catch(NumberFormatException ex){
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario.");
            System.out.println(ex.getMessage());
        }catch(NullPointerException ex){
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario.");
            System.out.println(ex.getMessage());
        }
    }
}

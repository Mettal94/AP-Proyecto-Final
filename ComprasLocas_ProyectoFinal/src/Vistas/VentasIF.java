/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ProductosData;
import Entidades.Productos;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class VentasIF extends javax.swing.JInternalFrame {
    
    private ProductosData prodD;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    List<Productos> listaProd = new ArrayList<>();
    List <Productos> listaCarrito = new ArrayList<>();
    public VentasIF(ProductosData prodD) {
        this.prodD = prodD;
        initComponents();
        cargarJCB();
        armarCabecera();
        PrecioTotalT.setText(0 + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        PrecioTotalT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ProductosJCB = new javax.swing.JComboBox<>();
        CantidadS = new javax.swing.JSpinner();
        AgregarB = new javax.swing.JButton();
        ComprarTodoB = new javax.swing.JButton();
        EliminarItemB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CancelarB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FondoVenzq = new javax.swing.JLabel();
        FondoVenDer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ventas");
        setPreferredSize(new java.awt.Dimension(1010, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaVentas.setBackground(new java.awt.Color(20, 143, 119));
        TablaVentas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TablaVentas.setForeground(new java.awt.Color(255, 255, 255));
        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 379, 333));

        PrecioTotalT.setBackground(new java.awt.Color(20, 143, 119));
        PrecioTotalT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PrecioTotalT.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PrecioTotalT, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 122, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Precio Total:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        ProductosJCB.setBackground(new java.awt.Color(20, 143, 119));
        ProductosJCB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(ProductosJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 326, -1));

        CantidadS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(CantidadS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 198, -1));

        AgregarB.setBackground(new java.awt.Color(14, 98, 81));
        AgregarB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AgregarB.setForeground(new java.awt.Color(255, 255, 255));
        AgregarB.setText("Agregar al carrito");
        AgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 440, -1));

        ComprarTodoB.setBackground(new java.awt.Color(14, 98, 81));
        ComprarTodoB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ComprarTodoB.setForeground(new java.awt.Color(255, 255, 255));
        ComprarTodoB.setText("Comprar Todo");
        ComprarTodoB.setPreferredSize(new java.awt.Dimension(125, 23));
        ComprarTodoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarTodoBActionPerformed(evt);
            }
        });
        getContentPane().add(ComprarTodoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 111, -1));

        EliminarItemB.setBackground(new java.awt.Color(14, 98, 81));
        EliminarItemB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EliminarItemB.setForeground(new java.awt.Color(255, 255, 255));
        EliminarItemB.setText("Eliminar Item");
        EliminarItemB.setPreferredSize(new java.awt.Dimension(125, 23));
        EliminarItemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarItemBActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarItemB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un producto: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad a vender: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        CancelarB.setBackground(new java.awt.Color(14, 98, 81));
        CancelarB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CancelarB.setForeground(new java.awt.Color(255, 255, 255));
        CancelarB.setText("Cancelar Compra");
        CancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Concretar Venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-banknotes-100.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        FondoVenzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoVenzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 580));

        FondoVenDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoVenDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 490, 580));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fof.png"))); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBActionPerformed
        // Agregar al carrito
        try {
            Productos prod = (Productos) ProductosJCB.getSelectedItem();
            int cantidad = (int) CantidadS.getValue();
            int stock = prod.getStock();
            double precio = prod.getPrecioActual();
            double costoTotal = precio * cantidad;
            int filas = TablaVentas.getRowCount();
            double x = Double.parseDouble(PrecioTotalT.getText());
            boolean coincidencia = false;
            for (int i = 0; i < filas; i++) {
                int productoEnTabla = (int) TablaVentas.getValueAt(i, 0);
                int cantidadEnTabla = (int) TablaVentas.getValueAt(i, 2);
                double precioCostoEnTabla = (double) TablaVentas.getValueAt(i, 4);
                if(productoEnTabla == prod.getIdProducto()){
                    coincidencia = true;
                    int cantidadNueva = cantidadEnTabla + cantidad;
                    if(cantidadNueva>prod.getStock()){
                        mensaje("No hay suficientes existencias del producto");
                        return;
                    }else{
                        modelo.setValueAt(cantidadNueva, i, 2);
                        modelo.setValueAt((precioCostoEnTabla+costoTotal), i, 4);
                    }   
                }
            }    
                if(coincidencia == false){
                    if (cantidad > stock) {
                    mensaje("No hay suficientes existencias del producto");
                    return;
                    }
                    modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), cantidad, prod.getPrecioActual(), costoTotal});
                    listaCarrito.add(prod);
                }
            
            PrecioTotalT.setText((x + costoTotal) + "");
            CantidadS.setValue(0);
        } catch (NumberFormatException ex) {
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario.");
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario.");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_AgregarBActionPerformed

    private void EliminarItemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarItemBActionPerformed
        //Boton eliminar item
        try {
            int fila = TablaVentas.getSelectedRow();
            double precio = (double) TablaVentas.getValueAt(fila, 4);
            modelo.removeRow(fila);
            double x = Double.parseDouble(PrecioTotalT.getText());
            int cantidadFila = TablaVentas.getRowCount();
            if (cantidadFila <= 0) {
                PrecioTotalT.setText(0 + "");
            } else {
                PrecioTotalT.setText((x - precio) + "");
            }
            listaCarrito.remove(fila);
        } catch (ArrayIndexOutOfBoundsException ex) {
            mensaje("Debe seleccionar un producto de la tabla.");
            System.out.println(ex.getMessage());
        }
        

    }//GEN-LAST:event_EliminarItemBActionPerformed

    private void ComprarTodoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarTodoBActionPerformed
        //Boton comprar todo
        if(TablaVentas.getRowCount()<=0){
            mensaje("No hay ningún producto en la tabla");
            return;
        }
        int i=0; 
        for (Productos produ : listaCarrito){
            int stock = produ.getStock();
            int comprado = (int)TablaVentas.getValueAt(i, 2);
            int stockNuevo = stock - comprado;
            prodD.modificarStock(produ.getIdProducto(), stockNuevo);
            i++;
            
        }
        PrecioTotalT.setText(0+"");
        mensaje("Se realizo la venta con exito!");
        borrarFilas();
    }//GEN-LAST:event_ComprarTodoBActionPerformed

    private void CancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBActionPerformed
        // Boton para cancelar la venta
        if(TablaVentas.getRowCount()<=0){
            mensaje("No hay productos para vender");
            return;
        }
        int decision = JOptionPane.showConfirmDialog(this, "Desea cancelar la venta?");
            if(decision == 0){
                borrarFilas();
                listaCarrito.clear();
                PrecioTotalT.setText(0+"");
            }
    }//GEN-LAST:event_CancelarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarB;
    private javax.swing.JButton CancelarB;
    private javax.swing.JSpinner CantidadS;
    private javax.swing.JButton ComprarTodoB;
    private javax.swing.JButton EliminarItemB;
    private javax.swing.JLabel FondoVenDer;
    private javax.swing.JLabel FondoVenzq;
    private javax.swing.JTextField PrecioTotalT;
    private javax.swing.JComboBox<Productos> ProductosJCB;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void borrarFilas() {
        int f = TablaVentas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    public void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Precio Por Monto");
        TablaVentas.setModel(modelo);
        
    }
    
    public void cargarJCB() {
        listaProd = prodD.listarProductos(1);
        for (Productos product : listaProd) {
            ProductosJCB.addItem(product);
        }
    }
}

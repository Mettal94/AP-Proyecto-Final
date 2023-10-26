/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ProveedorData;
import Entidades.Proveedor;
import static Vistas.mainMenu.Escritorio;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class AdminProveedoresIF extends javax.swing.JInternalFrame {

    private ProveedorData provD;
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    List<Proveedor> lista = new ArrayList<>(); 
    public AdminProveedoresIF(ProveedorData provD) {
        this.provD = provD;
        initComponents();
        armarCabecera();
        ActivosRB.setSelected(true);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        AgregarB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DomicilioT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelefonoT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProveedorTabla = new javax.swing.JTable();
        ModificarB = new javax.swing.JButton();
        EstadoB = new javax.swing.JButton();
        RazonST = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ActivosRB = new javax.swing.JRadioButton();
        InactivosRB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FondoIzq = new javax.swing.JLabel();
        FondoDer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Administrar Proveedores");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(1008, 605));
        setMinimumSize(new java.awt.Dimension(1008, 605));
        setPreferredSize(new java.awt.Dimension(1010, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarB.setBackground(new java.awt.Color(14, 98, 81));
        AgregarB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AgregarB.setForeground(new java.awt.Color(255, 255, 255));
        AgregarB.setText("Agregar nuevo Proveedor");
        AgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 430, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Razon Social:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Domicilio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        DomicilioT.setBackground(new java.awt.Color(20, 143, 119));
        DomicilioT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DomicilioT.setForeground(new java.awt.Color(255, 255, 255));
        DomicilioT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DomicilioT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(DomicilioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 252, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        EmailT.setBackground(new java.awt.Color(20, 143, 119));
        EmailT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EmailT.setForeground(new java.awt.Color(255, 255, 255));
        EmailT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(EmailT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 252, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        TelefonoT.setBackground(new java.awt.Color(20, 143, 119));
        TelefonoT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TelefonoT.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TelefonoT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TelefonoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 252, -1));

        ProveedorTabla.setBackground(new java.awt.Color(20, 143, 119));
        ProveedorTabla.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ProveedorTabla.setForeground(new java.awt.Color(255, 255, 255));
        ProveedorTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ProveedorTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 404, 354));

        ModificarB.setBackground(new java.awt.Color(14, 98, 81));
        ModificarB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ModificarB.setForeground(new java.awt.Color(255, 255, 255));
        ModificarB.setText("Modificar Proveedor");
        ModificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBActionPerformed(evt);
            }
        });
        getContentPane().add(ModificarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 220, -1));

        EstadoB.setBackground(new java.awt.Color(14, 98, 81));
        EstadoB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EstadoB.setForeground(new java.awt.Color(255, 255, 255));
        EstadoB.setText("Modificar Estado");
        EstadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoBActionPerformed(evt);
            }
        });
        getContentPane().add(EstadoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 480, 200, -1));

        RazonST.setBackground(new java.awt.Color(20, 143, 119));
        RazonST.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        RazonST.setForeground(new java.awt.Color(255, 255, 255));
        RazonST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RazonST.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(RazonST, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 252, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Agregar nuevo Proveedor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Gestionar proveedores existentes");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        Grupo.add(ActivosRB);
        ActivosRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivosRBActionPerformed(evt);
            }
        });
        getContentPane().add(ActivosRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, -1, -1));

        Grupo.add(InactivosRB);
        InactivosRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivosRBActionPerformed(evt);
            }
        });
        getContentPane().add(InactivosRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Mostrar :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Inactivos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Activos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, -1));

        FondoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 580));

        FondoDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeAzuladoPN.png"))); // NOI18N
        getContentPane().add(FondoDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 490, 580));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fof.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBActionPerformed
        // Agregar proveedor
        try{
            String razonSoc = RazonST.getText();
            String domicilio = DomicilioT.getText();
            String email = EmailT.getText();
            String telefono = TelefonoT.getText();
            if(razonSoc.isEmpty()||domicilio.isEmpty()||telefono.isEmpty()){
                mensaje("Hay campos obligarotios vacíos (Razón Social, Domicilio o Teléfono)");
                return;
            }
            
            Proveedor prov = new Proveedor(razonSoc, domicilio, email, telefono, true);
            
            provD.agregarProveedor(prov);
            
            RazonST.setText("");
            DomicilioT.setText("");
            EmailT.setText("");
            TelefonoT.setText("");
            
            listar();
        }catch(NullPointerException ex){
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_AgregarBActionPerformed

    private void ModificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBActionPerformed
        // Boton modificar proveedor
         try{   
            int fila = ProveedorTabla.getSelectedRow();
            
            int id = (int) ProveedorTabla.getValueAt(fila, 0);
            Proveedor modificar = new Proveedor();
            modificar = lista.get(fila);
            modificar.setIdProveedor(id);
             System.out.println(modificar);
            ModificarProveedorIF mpif = new ModificarProveedorIF(provD, modificar);
            mpif.setVisible(true);
            Escritorio.add(mpif);
            Escritorio.moveToFront(mpif);
         }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Debe seleccionar un producto de la tabla.");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ModificarBActionPerformed

    private void ActivosRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivosRBActionPerformed
        // Boton activo
        listar();
    }//GEN-LAST:event_ActivosRBActionPerformed

    private void InactivosRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivosRBActionPerformed
        // Boton inactivos
        listar();
    }//GEN-LAST:event_InactivosRBActionPerformed

    private void EstadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoBActionPerformed
        // Boton para dar de baja
        try{
            int fila = ProveedorTabla.getSelectedRow();

            int id = (int) ProveedorTabla.getValueAt(fila, 0);
            if(ActivosRB.isSelected()){
                provD.altaBajaProveedores(0, id);
            }else{
                provD.altaBajaProveedores(1, id);
            }
            
            listar();
        }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Debe seleccionar un producto de la tabla.");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_EstadoBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ActivosRB;
    private javax.swing.JButton AgregarB;
    private javax.swing.JTextField DomicilioT;
    private javax.swing.JTextField EmailT;
    private javax.swing.JButton EstadoB;
    private javax.swing.JLabel FondoDer;
    private javax.swing.JLabel FondoIzq;
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JRadioButton InactivosRB;
    private javax.swing.JButton ModificarB;
    private javax.swing.JTable ProveedorTabla;
    private javax.swing.JTextField RazonST;
    private javax.swing.JTextField TelefonoT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Razón Social");
        modelo.addColumn("Dirección");
        modelo.addColumn("E-Mail");
        modelo.addColumn("Teléfono");
        ProveedorTabla.setModel(modelo);
    }
    
    public void listar(){
        borrarFilas();
        if (ActivosRB.isSelected()) {
            lista = provD.listarProveedores(1);
        } else if(InactivosRB.isSelected()){
             lista = provD.listarProveedores(0);
        }
        
       for (Proveedor prov : lista) {
            modelo.addRow(new Object[]{prov.getIdProveedor(),prov.getRazonSocial(),prov.getDomicilio(),prov.getEmail(),prov.getTelefono()});
        }
    }
    
    public void borrarFilas(){
        int f = ProveedorTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}

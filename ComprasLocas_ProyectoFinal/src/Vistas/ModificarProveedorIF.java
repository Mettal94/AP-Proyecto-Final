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

/**
 *
 * @author feded
 */
public class ModificarProveedorIF extends javax.swing.JInternalFrame {

   private Proveedor proveedor;
   private ProveedorData provD;
    public ModificarProveedorIF(ProveedorData provD, Proveedor proveedor) {
        this.provD = provD;
        this.proveedor = proveedor;
        initComponents();
        RazonST.setText(proveedor.getRazonSocial());
        DomicilioT.setText(proveedor.getDomicilio());
        TelefonoT.setText(proveedor.getTelefono()+"");
        EmailT.setText(proveedor.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RazonST = new javax.swing.JTextField();
        DomicilioT = new javax.swing.JTextField();
        TelefonoT = new javax.swing.JTextField();
        GuardarB = new javax.swing.JButton();
        CancelarB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();

        setTitle("Modificar Proveedor");

        jLabel1.setText("Razon Social:");

        jLabel2.setText("Domicilio:");

        jLabel3.setText("Telefono:");

        GuardarB.setText("Guardar");
        GuardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBActionPerformed(evt);
            }
        });

        CancelarB.setText("Cancelar");

        jLabel4.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelarB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(GuardarB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefonoT)
                            .addComponent(DomicilioT)
                            .addComponent(RazonST)
                            .addComponent(EmailT))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RazonST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DomicilioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TelefonoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarB)
                    .addComponent(GuardarB))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBActionPerformed
       try{
        int id = proveedor.getIdProveedor();
        String razon = RazonST.getText();
        String domicilio = DomicilioT.getText();
        String tel = TelefonoT.getText();
        String correo = EmailT.getText();
        Boolean estado = proveedor.isEstado();
        
        Proveedor modificar = new Proveedor (id, razon, domicilio, correo, tel, estado);
           System.out.println(modificar);
        provD.modificarProveedor(modificar);
        
        Escritorio.removeAll();
        Escritorio.repaint();
        AdminProveedoresIF apif = new AdminProveedoresIF(provD);
        apif.setVisible(true);
        Escritorio.add(apif);
        Escritorio.moveToFront(apif);
        }catch (NullPointerException ex) {
            mensaje("No pueden quedar campos vacíos.");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            mensaje("Debe ingresar un valor válido.");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_GuardarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarB;
    private javax.swing.JTextField DomicilioT;
    private javax.swing.JTextField EmailT;
    private javax.swing.JButton GuardarB;
    private javax.swing.JTextField RazonST;
    private javax.swing.JTextField TelefonoT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
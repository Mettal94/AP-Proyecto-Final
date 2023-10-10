/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Entidades.Login;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginMain extends javax.swing.JFrame {

    private boolean access;
    /**
     * Creates new form LoginMain
     */
    public LoginMain() {
        initComponents();
        this.access = false;
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
        iconUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtContraseña = new javax.swing.JPasswordField();
        bIngresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-user-94.png"))); // NOI18N
        getContentPane().add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jtUsuario.setBackground(new java.awt.Color(204, 204, 255));
        jtUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, -1));

        jtContraseña.setBackground(new java.awt.Color(204, 204, 255));
        jtContraseña.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 160, -1));

        bIngresar.setBackground(new java.awt.Color(153, 153, 255));
        bIngresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bIngresar.setForeground(new java.awt.Color(0, 0, 51));
        bIngresar.setText("Ingresar");
        bIngresar.setBorder(null);
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(bIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzulaesMEDI.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
      String user = jtUsuario.getText();
        String pass = jtContraseña.getText();
        this.access = Login.isLogged(user, pass);
        if (this.access == true) {
            JOptionPane.showMessageDialog(this, "Bienvenido al sistema.");
            jtUsuario.setText("");
            jtContraseña.setText("");
            this.dispose();
            mainMenu desktopView = new mainMenu();
            desktopView.setVisible(true);
            desktopView.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(this, "Inicio de sesión incorrecto.");
            jtContraseña.setText("");
        }
    }//GEN-LAST:event_bIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton bIngresar;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jtContraseña;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}

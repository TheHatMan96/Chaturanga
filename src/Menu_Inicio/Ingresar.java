/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author samuelborjas
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JLabel();
        txtUsuarioI = new javax.swing.JTextField();
        txtPassI = new javax.swing.JPasswordField();
        cmdIngresar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdRegresarInicio = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario:");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        txtUsuarioI.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        getContentPane().add(txtUsuarioI, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 300, -1));

        txtPassI.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        txtPassI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassIActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassI, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 300, -1));

        cmdIngresar.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdIngresar.setForeground(new java.awt.Color(255, 255, 255));
        cmdIngresar.setText("Ingresar");
        cmdIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdIngresarMousePressed(evt);
            }
        });
        getContentPane().add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        cmdRegresarInicio.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdRegresarInicio.setForeground(new java.awt.Color(255, 255, 255));
        cmdRegresarInicio.setText("...Regresar");
        cmdRegresarInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdRegresarInicioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmdRegresarInicioMouseReleased(evt);
            }
        });
        getContentPane().add(cmdRegresarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/ingresar.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1165, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassIActionPerformed

    private void cmdIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdIngresarMousePressed
       String user = txtUsuarioI.getText();
        String pass = String.valueOf(txtPassI.getPassword());
        
        if(Player.validarEntrada(user,pass)){  
            JOptionPane.showMessageDialog(null, "Bienvenido "+user); 
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true); 
                txtUsuarioI.setText("");
                txtPassI.setText(null);
                this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta...intente de nuevo!!");
            txtUsuarioI.setText("");
            txtPassI.setText(null);
        }
    }//GEN-LAST:event_cmdIngresarMousePressed

    private void cmdRegresarInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegresarInicioMousePressed
        this.dispose();
        Inicio i = new Inicio();
        i.setVisible(true);
    }//GEN-LAST:event_cmdRegresarInicioMousePressed

    private void cmdRegresarInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegresarInicioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdRegresarInicioMouseReleased

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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmdIngresar;
    private javax.swing.JLabel cmdRegresarInicio;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassI;
    private javax.swing.JTextField txtUsuarioI;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author samuelborjas
 */
public class Registrar extends javax.swing.JFrame {
    public static fondo sonido = new fondo();
    
    /**
     * Creates new form Registrar
     */
    public Registrar() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        txtPassR = new javax.swing.JPasswordField();
        txtUsuarioR = new javax.swing.JTextField();
        cmdRegresarAInicio = new javax.swing.JLabel();
        fondoRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar...");
        btnRegistrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseDragged(evt);
            }
        });
        btnRegistrar.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                btnRegistrarMouseWheelMoved(evt);
            }
        });
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        txtPassR.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        getContentPane().add(txtPassR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 190, 60));

        txtUsuarioR.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        getContentPane().add(txtUsuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 250, -1));

        cmdRegresarAInicio.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdRegresarAInicio.setForeground(new java.awt.Color(255, 255, 255));
        cmdRegresarAInicio.setText("Regresar...");
        cmdRegresarAInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdRegresarAInicioMousePressed(evt);
            }
        });
        getContentPane().add(cmdRegresarAInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, -1, -1));

        fondoRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/registar.jpg"))); // NOI18N
        getContentPane().add(fondoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed
        if(txtUsuarioR.getText().isEmpty() || txtPassR.getPassword().length==0){ 
            JOptionPane.showMessageDialog(null, "No pueden haber casillas en blanco!!");                          
        }else{ 
        
        for(Player player: Player.Usuarios)
            if(txtUsuarioR.getText().equals(player.usuario)){
                JOptionPane.showMessageDialog (null, "Este nombre de usuario ya existe, porfavor ingrese uno nuevo.", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);    
                
                txtUsuarioR.setText("");
                txtPassR.setText(null); 
                return;               
            }
        if(txtPassR.getPassword().length<5){             
             JOptionPane.showMessageDialog (null, "Password demasiado corto. El password debe contener exactamente 5 caracteres.", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE); 
             txtPassR.setText("");
             
        }else if(txtPassR.getPassword().length>5){
            
            JOptionPane.showMessageDialog (null, "Password demasiado larga. El password debe contener exactamente 5 caracteres.", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE); 
            txtPassR.setText("");
                
        }else{             
            Player usuario = new Player(txtUsuarioR.getText(),String.valueOf(txtPassR.getPassword()));
            JOptionPane.showMessageDialog (null, "Usuario Agregado", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
            Player.Usuarios.add(usuario);              
            txtUsuarioR.setText("");
            txtPassR.setText("");    
            JOptionPane.showMessageDialog (null, "Bienvenido "+String.valueOf(usuario.usuario), "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            
            Player.current = usuario;          
            MenuPrincipal mp = new MenuPrincipal();
             mp.setVisible(true); 
                
             for(Player player: Player.Usuarios)
              System.out.println(player.usuario + " "+player.contra);
            }
       }
        
        System.out.println("feedback desde registrar");
        
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void btnRegistrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseDragged
     
    }//GEN-LAST:event_btnRegistrarMouseDragged

    private void btnRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseMoved
       
    }//GEN-LAST:event_btnRegistrarMouseMoved

    private void btnRegistrarMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_btnRegistrarMouseWheelMoved
        
    }//GEN-LAST:event_btnRegistrarMouseWheelMoved

    private void cmdRegresarAInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegresarAInicioMousePressed
       Inicio i = new Inicio();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_cmdRegresarAInicioMousePressed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel cmdRegresarAInicio;
    private javax.swing.JLabel fondoRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassR;
    private javax.swing.JTextField txtUsuarioR;
    // End of variables declaration//GEN-END:variables
}

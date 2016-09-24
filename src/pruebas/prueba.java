/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author samuelborjas
 */
public class prueba {
    public static void main(String[] args) {
        
    
    String password;
    JPasswordField passwordField = new JPasswordField();
    
    passwordField.setEchoChar('*');
    
    Object[] obj = {"Please enter the password:\n\n", passwordField};
    Object stringArray[] = {"OK","Cancel"};
    
    if (JOptionPane.showOptionDialog(null, obj, "Need password",      
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj) == JOptionPane.YES_OPTION)
        
    password = passwordField.getPassword().toString();
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio.piezas;

import javax.swing.ImageIcon;

/**
 *
 * @author ITAdmin
 */
public abstract class Pieza {
   ImageIcon n;
    

    //1. Blanco, 2. Negro
    public Pieza() {
       n= new ImageIcon();
        
        
    }

    public Pieza(ImageIcon n) {
        this.n=n;
                
    }
    
    
    public abstract boolean validar(int xi,int yi,int xf,int yf,int juga);
}

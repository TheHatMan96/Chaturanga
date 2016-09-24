/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Daniel Medina
 */
public class EjeCBotton extends JButton{
    
    ImageIcon caballoA;
    ImageIcon peonA;
    ImageIcon reyA;
    ImageIcon reinaA;
    ImageIcon torreA;
    ImageIcon elefanteA;
    
    ImageIcon caballoR;
    ImageIcon peonR;
    ImageIcon reyR;
    ImageIcon reinaR;
    ImageIcon torreR;
    ImageIcon elefanteR;
    
    
    public EjeCBotton(){
        super.setBackground(Color.WHITE);   
        // LADO SUPERIOR
        caballoA= new ImageIcon("src/icons/caballoBlanco.png");        
        peonA= new ImageIcon("src/icons/peonBlanco.png"); 
        reyA= new ImageIcon("src/icons/reyBlanco.png"); 
        reinaA = new ImageIcon("src/icons/reinaBlanco.png");
        torreA = new ImageIcon("src/icons/torreBlanco.png");
        elefanteA= new ImageIcon("src/icons/elefanteBlanco.png");
        
        // LADO Inferior
        caballoR= new ImageIcon("src/icons/caballoNegro.png");        
        peonR= new ImageIcon("src/icons/peonNegro.png"); 
        reyR= new ImageIcon("src/icons/reyNegro.png"); 
        reinaR = new ImageIcon("src/icons/reinaNegro.png");
        torreR= new ImageIcon("src/icons/torreNegro.png");
        elefanteR = new ImageIcon("src/icons/elefanteNegro.png");
        
    }
    
    
}

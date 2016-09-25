/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio.piezas;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Daniel Medina
 */
public class EjeCBotton extends JButton{
    
    public ImageIcon caballoA;
    public ImageIcon peonA;
    public ImageIcon reyA;
    public ImageIcon reinaA;
    public ImageIcon torreA;
    public ImageIcon elefanteA;
    
    public ImageIcon caballoR;
    public ImageIcon peonR;
    public ImageIcon reyR;
    public ImageIcon reinaR;
    public ImageIcon torreR;
    public ImageIcon elefanteR;
    
    
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
    
    public void ReleaseEjeCBotton(ImageIcon e){
        
    }
    
    
}

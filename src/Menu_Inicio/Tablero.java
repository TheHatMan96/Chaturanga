/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;
import Menu_Inicio.piezas.EjeCBotton;
import Menu_Inicio.piezas.EjeCBotton;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class tablero extends JFrame {

    public JPanel p = new JPanel();
    public EjeCBotton[][] bot = new EjeCBotton[8][8];
    

    public tablero() {
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        p.setLayout(new GridLayout(8,8));
        
        for (int f = 0; f < 8; f++) {
           for(int c= 0;c < 8;c++ ){
             bot[f][c] = new EjeCBotton();
            p.add(bot[f][c]);
        }
           
        }
        //superior 0
        
        bot[0][0].setIcon(new EjeCBotton().torreA);
        bot[0][1].setIcon(new EjeCBotton().caballoA);
        bot[0][2].setIcon(new EjeCBotton().elefanteA);
        bot[0][3].setIcon(new EjeCBotton().reyA);
        bot[0][4].setIcon(new EjeCBotton().reinaA);
        bot[0][5].setIcon(new EjeCBotton().elefanteA);
        bot[0][6].setIcon(new EjeCBotton().caballoA);
        bot[0][7].setIcon(new EjeCBotton().torreA);
        
        //superior 1
        bot[1][0].setIcon(new EjeCBotton().peonA);
        bot[1][1].setIcon(new EjeCBotton().peonA);
        bot[1][2].setIcon(new EjeCBotton().peonA);
        bot[1][3].setIcon(new EjeCBotton().peonA);
        bot[1][4].setIcon(new EjeCBotton().peonA);
        bot[1][5].setIcon(new EjeCBotton().peonA);
        bot[1][6].setIcon(new EjeCBotton().peonA);
        bot[1][7].setIcon(new EjeCBotton().peonA);        
        
        //inferior 7
        bot[7][0].setIcon(new EjeCBotton().torreR);
        bot[7][1].setIcon(new EjeCBotton().caballoR);
        bot[7][2].setIcon(new EjeCBotton().elefanteR);
        bot[7][3].setIcon(new EjeCBotton().reyR);
        bot[7][4].setIcon(new EjeCBotton().reinaR);
        bot[7][5].setIcon(new EjeCBotton().elefanteR);
        bot[7][6].setIcon(new EjeCBotton().caballoR);
        bot[7][7].setIcon(new EjeCBotton().torreR);
        
        //inferior 6
        bot[6][0].setIcon(new EjeCBotton().peonR);
        bot[6][1].setIcon(new EjeCBotton().peonR);
        bot[6][2].setIcon(new EjeCBotton().peonR);
        bot[6][3].setIcon(new EjeCBotton().peonR);
        bot[6][4].setIcon(new EjeCBotton().peonR);
        bot[6][5].setIcon(new EjeCBotton().peonR);
        bot[6][6].setIcon(new EjeCBotton().peonR);
        bot[6][7].setIcon(new EjeCBotton().peonR);
       
        add(p);
        setVisible(true);

    }

    
    public static void main(String[] args) {
      new tablero();  
      
    }

}  
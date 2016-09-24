/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
/**
 *
 * @author samuelborjas
 */
public class fondo {

    /**
     * @param args the command line arguments
     */
    public void sonidoGeneral(){
        
      int a=5;
        while(a<=10) 
        try {
            FileInputStream fis,fas;
            Player player;
 
            fis = new FileInputStream("src\\Musica\\music.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();    
            
            // TODO code application logic here
        }
        catch (JavaLayerException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public void sonidoBoton(){
        
      int a=5;
        while(a<=10) 
        try {
            FileInputStream fis;
            Player player;
            fis = new FileInputStream("src\\Musica\\music.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();    
            
            // TODO code application logic here
        }
        catch (JavaLayerException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public void stop(){
        int a=5;
        while(a<=10) 
        try{
        Player player;
        FileInputStream fis;
        fis = new FileInputStream("\\Chaturanga\\src\\Musica\\music.mp3");
        BufferedInputStream bis = new BufferedInputStream(fis);
        player = new Player(bis);
        player.close();
        }
         catch (JavaLayerException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
}
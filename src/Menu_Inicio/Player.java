package Menu_Inicio;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuelborjas
 */
public class Player {
   protected String usuario;
   protected String contra;
   protected int puntos;
   protected int partidas;
   
   public static Player current,second;
   public static ArrayList<Player> Usuarios = new ArrayList<>(); //ArrayList donde estarn los datos de usuario
   public static ArrayList<Player>ultimas10 = new ArrayList<>();//ArrayList de ultimas 10 partidas
   
   
   public Player(String user, String pass){
       this.usuario = user;
       this.contra = pass;
       puntos = 0;
       partidas = 0;
   }
   
   public String getUsuario(){
       return usuario;
   }
   
   public String getContra(){
       return contra;
   }
   
   public int getPuntos(){
       return puntos;
   }
   
   public int getPartidas(){
       return partidas;
   }
   
   public void setPass(String pass){
       contra = pass;
   }
   
   public static boolean validarEntrada(String user, String pass){
       for( Player p: Player.Usuarios)
           if((user.equals(p.usuario))&&(pass.equals(p.contra))){
               current = p;
               return true;
           }
       return false;
   }
  
    
}

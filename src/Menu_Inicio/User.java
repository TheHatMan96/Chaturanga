/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import java.util.ArrayList;

/**
 *
 * @author ITAdmin
 */
public class User {
    protected String username, password;
    protected int puntaje, partidas;
   public static User current,second;
   public static ArrayList<User> Usuarios = new ArrayList<>(); //ArrayList donde estarn los datos de usuario
   public static ArrayList<User>ultimas10 = new ArrayList<>();//ArrayList de ultimas 10 partidas
   
 public User(String username, String password){
        this.username = username;
        this.password = password;
        puntaje = 0;
        partidas = 0;
    }
   
   public String getUsuario(){
       return username;
   }
   
   public String getContra(){
       return password;
   }
   
   public int getPuntos(){
       return puntaje;
   }
   
   public int getPartidas(){
       return partidas;
   }
   
   public void setPass(String pass){
       password = pass;
   }
   
   public static boolean validarEntrada(String user, String pass){
       for( User p: User.Usuarios)
           if((user.equals(p.username))&&(pass.equals(p.password))){
               current = p;
               return true;
           }
       return false;
   }
  
    
}

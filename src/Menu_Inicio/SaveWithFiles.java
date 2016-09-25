/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author KenyStev
 */
public class SaveWithFiles implements Salvable{
    public static final String ROOT_PATH="Chaturanga Files";
    
    public ArrayList<User> users;
    
    public SaveWithFiles() {
        users = new ArrayList<>();
    }
    
    public String userPath(String user){
        return ROOT_PATH + "/" + user;
    }
    
    private String getGamePath(User user, int code){
        if(code==-1)return null;
        
        return userPath(user.getUsuario())+"/"+code+"_Game.cht";
    }
    
    private int getAvaibleCode(User user){
        return getAvaibleCode(new File(userPath(user.getUsuario())));
    }
    
    private int getAvaibleCode(File userDir){
        int code=-1;
        try(RandomAccessFile rCode = new RandomAccessFile(userDir+"/counter.cht", "rw")){
            code = rCode.readInt();
            rCode.seek(0);
            rCode.writeInt(code+1);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        return code;
    }
    
    @Override
    public int buscarUser(String name) {

        return buscarUser(name, 0);
    }
    
    private int buscarUser(String name, int index){
        if(index<users.size()){
            if(users.get(index).equals(name))
                return index;
            return buscarUser(name, index+1);
        }
        return -1;
    }
    
    
    
    @Override
    public boolean eliminarUser(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean modificarPassword(String name, String pass) {
        int index = buscarUser(name);
        if(index>=0){
            users.get(index).setPass(pass);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean crearPartida(User player1, User player2) {
        File userDir = new File(userPath(player1.getUsuario()));
        int code = getAvaibleCode(userDir);
        Object game = new Object();
        return serializar(getGamePath(player1, code),game);
    }
    
    @Override
    public Partida cargarPartida(int num) {
        return (Partida)deserializar(getGamePath(Datos.logedin , num));
    }
    
    @Override
    public boolean sobrescribirPartida(Partida p) {
        p.setLastFechaEdited(Calendar.getInstance());
        return serializar(getGamePath(Datos.logedin, p.getNum()), p);
    }
    
    @Override
    public boolean guardarPartida(Partida p) {
        return sobrescribirPartida(p);
    }
    
    @Override
    public boolean eliminarPartida(String path) {
        File game = new File(getGamePath(Datos.logedin, Integer.parseInt(path)));
        return game.delete();
    }
    
   
    
   

    
    @Override
    public boolean serializar(String path, Object obj) {
        try(FileOutputStream fo = new FileOutputStream(path, false);
                ObjectOutputStream oo = new ObjectOutputStream(fo)){
            oo.writeObject(obj);
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    @Override
    public Object deserializar(String path) {
        Object obj=null;
        try(FileInputStream fi = new FileInputStream(path);
                ObjectInputStream oi = new ObjectInputStream(fi)){
            obj = oi.readObject();
        }catch(Exception e){
            
        }
        return obj;
    }

    @Override
    public boolean crearUser(String name, String pass, String email, String passFace) {
        return false;
    }

    @Override
    public boolean transferirPartida(String path, User user1, User user2) {
        return false;
    }

    @Override
    public int findGamesPendientes() {
        return 0;
    }
    
}

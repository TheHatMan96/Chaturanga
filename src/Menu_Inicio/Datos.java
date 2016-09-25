/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author ITAdmin
 */
public class Datos {
                                   
    public static User logedin;;
    public static Salvable saver = new SaveWithFiles();
    public static LinkedList<String> logs = new LinkedList<>();
    
    private static final String USERS_PATH = SaveWithFiles.ROOT_PATH+"/chaturanga_players.cht",
            LOGS_PATH = SaveWithFiles.ROOT_PATH+"/logs.cht";

    public static void loadUsers() {
        if(saver instanceof SaveWithFiles){
            SaveWithFiles save = (SaveWithFiles)saver;
            ArrayList<User> tmp = (ArrayList<User>)save.deserializar(USERS_PATH);
            if(tmp!=null){
                save.users = tmp;
                System.out.println("deserealizados Users");
            }
        }
    }
    
    public static void unLoadUsers() {
        if(saver instanceof SaveWithFiles){
            SaveWithFiles save = (SaveWithFiles)saver;
            if(saver.serializar(USERS_PATH, save.users))
                System.out.println("Se Serializo users");
        }
    }
    
    public static void loadLogs(){
        if(saver instanceof SaveWithFiles){
            SaveWithFiles save = (SaveWithFiles)saver;
            LinkedList<String> tmpLogs = (LinkedList<String>)save.deserializar(LOGS_PATH);
            if(tmpLogs!=null){
                logs = tmpLogs;
                System.out.println("deserealizados logs");
            }
        }
    }
    
    public static void unLoadLogs(){
        if(saver.serializar(LOGS_PATH, logs))
            System.out.println("Se Serializo logs");
    }
    
    public static ArrayList<String> findLogs() {
        ArrayList<String> userLogs = new ArrayList<>();
        findLogs(userLogs, 0);
    
        return userLogs;
    }
    
    private static void findLogs(ArrayList<String> userLogs, int index) {
        if(index < logs.size()) {
            String[] data = logs.get(index).split(" ");
            for (String s : data) {
                if(s.equals(Datos.logedin.getUsuario()))
                    userLogs.add(logs.get(index));
            }
            findLogs(userLogs, index+1);
        }
    }
}

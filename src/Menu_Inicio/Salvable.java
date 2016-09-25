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
public interface Salvable {
    int     buscarUser(String name); //return index of userArrayList
    boolean crearUser(String name, String pass, String email, String passFace);
    boolean eliminarUser(String name);
    boolean modificarPassword(String name, String pass);
    
    
    boolean crearPartida(User player1, User player2);
    Partida cargarPartida(int num); //casting (Partida)Object
    boolean sobrescribirPartida(Partida p);
    boolean guardarPartida(Partida p);
    boolean eliminarPartida(String path);
    boolean transferirPartida(String path, User user1, User user2);
    int findGamesPendientes();
    
    boolean serializar(String path, Object obj);
    Object deserializar(String path);
    
}
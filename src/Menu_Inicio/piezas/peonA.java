/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio.piezas;


/**
 *
 * @author ITAdmin
 */
public class peonA extends Pieza{
       int movi1;
    public peonA(){
        movi1=1;
    }
    public peonA(EjeCBotton n) {
        super(n.peonA);
        
    }   
    

    @Override
    public boolean validar(int xi,int yi,int xf,int yf,int juga) {
        //System.out.println("Validando si se puede mover el peon ");
        //validar
        if(xf==xi){
            if(juga==1){
             if(yf-1==yi){
                 return true;
             }
              return false;   
             }else if(juga==2){
                 if(yf+1==yi){
                     return true;
                 }
                 return false;
             }
             return false;
            }
        return false;
       
            
         
    
}
}

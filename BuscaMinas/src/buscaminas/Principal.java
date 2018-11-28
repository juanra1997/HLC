/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Juanra
 */
public class Principal {
    
    static Matriz matriz=new Matriz();
    //static Ventana obj;
    
    public static void main(String[] args){
        
        matriz.rellenarMatriz();
        matriz.ponerMinas();
        matriz.pintarMatriz();
        matriz.pintarMinas();
        
        //Ventana obj=new Ventana();
        //obj.setVisible(true);
        inicia();
                
    }
    public static void inicia(){
        Ventana obj;
        obj=matriz.obj;
        obj.setVisible(true);
    }
}

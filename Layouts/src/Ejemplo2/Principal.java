/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Principal {
 
    public static void iniciaComponentes(){
        
        Ventana miVentana=new Ventana();
        //miVentana.setLocationRelativeTo(null);
        miVentana.setSize(800, 400);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
        miVentana.setResizable(false);
    }
    
    public static void main(String[] args){
        
        iniciaComponentes();
        //setLocationRelativeTo(null);
    }
}

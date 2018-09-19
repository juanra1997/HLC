/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import static java.awt.EventQueue.invokeLater;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Principala {
    
    public static void mostrar(){
        
        Ventanaa miVentana=new Ventanaa();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);
        miVentana.setTitle("Mi Ventana");
        miVentana.setVisible(true);
        miVentana.pack();
    }
    
    public static void main(String [] args){
        
        invokeLater(new Runnable(){
            @Override
            public void run(){
                mostrar();
            }
        });
    }
}

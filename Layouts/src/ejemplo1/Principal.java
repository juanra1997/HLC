/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo1;

import static java.awt.EventQueue.invokeLater;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */

public class Principal {
    
    public static void mostrar(){
        
        Ventana miVentana=new Ventana();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setTitle("Ejemplo BorderLayout");
        miVentana.setVisible(true);
        //miVentana.setResizable(true/false);
        miVentana.pack();
        miVentana.setLocationRelativeTo(null);
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

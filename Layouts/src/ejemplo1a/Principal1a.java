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
public class Principal1a {
    
    public static void mostrar() {
        
        Ventana1a miVentana=new Ventana1a();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setTitle("Ejemplo varios paneles");
        miVentana.setVisible(true);
        miVentana.setResizable(false);
        miVentana.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args){
        
        invokeLater(new Runnable(){
            @Override
            public void run(){
                mostrar();
            }
        });
        //mostrar();
    }
}

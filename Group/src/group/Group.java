/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group;

import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Group {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ventana4 mv=new Ventana4();
        //mv.setSize(600, 400);
        mv.setLocationRelativeTo(null);
        mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mv.setTitle("prueba");
        mv.setVisible(true);
    }
    
}

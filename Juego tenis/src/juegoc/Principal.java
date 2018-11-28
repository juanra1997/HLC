/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoc;

import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Principal {
    
    public static void main(String[] args) {

        Ventana v=new Ventana("Mini tenis");
        v.setSize(300, 400);
        v.setResizable(false);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        (new Thread(v)).start();
    }
}

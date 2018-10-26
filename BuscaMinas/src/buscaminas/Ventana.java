/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame{
    
    miPanel panel;
    
    public Ventana(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        /* setLayout(new GridLayout(8, 8));
        //JOptionPane.showMessageDialog(null, "hola");
        for(int i=0; i<64; i++){
            add(new JButton());
        }*/
        panel=new miPanel();
        add(panel, BorderLayout.CENTER  );
        //add(new JButton(), BorderLayout.NORTH);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miPanel extends JPanel {
    
    public miPanel(){
        
        iniciaComponentes();
    }
    public void iniciaComponentes(){
        
        setLayout(new GridLayout(8, 8));
        //JOptionPane.showMessageDialog(null, "hola");
        for(int i=0; i<64; i++){
            add(new JButton());
        }
        //add(new JButton("Hola"));
        
        setVisible(true);
    }

}

class miPanelLateral extends JPanel {
    
    public miPanelLateral(){
        
        iniciaComponentes();
    }
    public void iniciaComponentes(){
        
        //setLayout(new GridLayout(8, 8));
        //JOptionPane.showMessageDialog(null, "hola");
        for(int i=0; i<64; i++){
            add(new JButton());
        }
        //add(new JButton("Hola"));
        
        setVisible(true);
    }

}
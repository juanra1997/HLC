/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class Ejercicio1{
    
    public static void main(String[] args){
        
        VEjercicio1 obj=new VEjercicio1();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }
}

class VEjercicio1 extends JFrame{
    
    public VEjercicio1(){
        
        
        //setLocationRelativeTo(null);
        setSize(600, 400);
        setResizable(false);
        //getContentPane().setBackground(Color.WHITE);
        add(new PEjercicio1());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class PEjercicio1 extends JPanel implements ActionListener {
    
    JButton salir;
    
    public PEjercicio1() {
    
    add(Box.createRigidArea(new Dimension(130,0)));
    setBackground(Color.WHITE);
    
    setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    add(new JLabel("Esto es un BoxLayout con eje X"));
    
    add(Box.createRigidArea(new Dimension(100,0)));
    
    salir=new JButton("SALIR");
    salir.addActionListener(this);
    add(salir);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==salir){
            System.exit(0);
        }
    }
}
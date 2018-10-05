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
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ejercicio2{
    
    public static void main(String[] args){
        
        VEjercicio2 obj=new VEjercicio2();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }
}

class VEjercicio2 extends JFrame{
    
    public VEjercicio2(){
        
        
        //setLocationRelativeTo(null);
        setSize(250, 250);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        add(new PEjercicio2());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class PEjercicio2 extends JPanel implements ActionListener {
    
    JButton salir;
    JTextField texto;
    JLabel primero, segundo;
    
    public PEjercicio2() {
    
    add(Box.createRigidArea(new Dimension(10,20)));
    setBackground(Color.WHITE);
    
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    
    primero=new JLabel("Esto es un BoxLayout con eje Y");
    primero.setAlignmentX(CENTER_ALIGNMENT);
    add(primero);
    
    add(Box.createRigidArea(new Dimension(10,20)));
    
    texto=new JTextField("Segundo elemento");
    texto.setEditable(false);
    texto.setMaximumSize(new Dimension(200, 30));
    texto.setHorizontalAlignment(JLabel.CENTER);
    texto.setBackground(Color.WHITE);
    texto.setAlignmentX(CENTER_ALIGNMENT);
    add(texto);
    
    add(Box.createRigidArea(new Dimension(10,20)));
    
    segundo=new JLabel("Tercer elemento");
    segundo.setAlignmentX(CENTER_ALIGNMENT);
    add(segundo);
    
    add(Box.createRigidArea(new Dimension(10,20)));
    
    salir=new JButton("SALIR");
    salir.addActionListener(this);
    salir.setAlignmentX(CENTER_ALIGNMENT);
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
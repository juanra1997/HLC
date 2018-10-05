/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Juanra
 */
public class Ejercicio3{
    
    public static void main(String[] args){
        
        VEjercicio3 obj=new VEjercicio3();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }
}

class VEjercicio3 extends JFrame{
    
    public VEjercicio3(){
        
        
        //setLocationRelativeTo(null);
        setSize(320, 250);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        add(new PEjercicio3());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class PEjercicio3 extends JPanel implements ActionListener {
    
    JButton salir, prueba;
    JTextField texto, texto2;
    JLabel primero, segundo;
    
    public PEjercicio3() {
    
    //add(Box.createRigidArea(new Dimension(10,20)));
    
    setLayout(new GridLayout(3,2));
    setBackground(Color.WHITE);
    
    primero=new JLabel("  Esto es un GridLayout");
    primero.setAlignmentX(CENTER_ALIGNMENT);
    add(primero);
    
    //add(Box.createRigidArea(new Dimension(10,20)));
    
    texto=new JTextField("Campo de texto blindado");
    texto.setEditable(false);
    texto.setHorizontalAlignment(JLabel.CENTER);
    texto.setBackground(Color.WHITE);
    texto.setAlignmentX(CENTER_ALIGNMENT);
    add(texto);
    
    
    
    //add(Box.createRigidArea(new Dimension(10,20)));
    
    segundo=new JLabel("  Tercer elemento");
    segundo.setAlignmentX(CENTER_ALIGNMENT);
    add(segundo);
    
    texto2=new JTextField("En este si puedes escribir");
    texto2.setHorizontalAlignment(JLabel.CENTER);
    texto2.setBackground(Color.WHITE);
    texto2.setAlignmentX(CENTER_ALIGNMENT);
    add(texto2);
    
    //add(Box.createRigidArea(new Dimension(10,20)));
    
    
    prueba=new JButton("No me pulses...");
    prueba.addActionListener(this);
    prueba.setAlignmentX(CENTER_ALIGNMENT);
    add(prueba);
    
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
        
        if(e.getSource()==prueba){
            UIManager UI=new UIManager();
            UIManager.put("OptionPane.background", Color.WHITE);
            UIManager.put("Panel.background", Color.WHITE);
            UIManager.put("Button.background", Color.WHITE);
            JOptionPane.showMessageDialog(null, "Me has pulsado :'(");
        }
    }
}
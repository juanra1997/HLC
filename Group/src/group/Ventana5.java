/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;

/**
 *
 * @author Juanra
 */
public class Ventana5 extends JFrame{
    
    JLabel label=new JLabel("Escibe un texto");
    JCheckBox op1, op2, op3, op4;
    JTextField txt;
    JButton bt1, bt2;
    
    public Ventana5() {
      
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        Container layout=this.getContentPane();
        GroupLayout gl=new GroupLayout(layout);
        
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        
        gl.createParallelGroup();
    }
}

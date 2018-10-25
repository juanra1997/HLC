/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana1 extends JFrame {
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    
    Container lienzo=this.getContentPane();
    GroupLayout g1=new GroupLayout(lienzo);
    
    
    public Ventana1(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        lienzo.setLayout(g1);
        btn1=new JButton("Boton 1");
        btn2=new JButton("Boton 2");
        btn3=new JButton("Boton 3");
        btn4=new JButton("Boton 4");
        btn5=new JButton("Boton 5");
        
        g1.setAutoCreateGaps(true);
        g1.setAutoCreateContainerGaps(true);
        
        g1.setHorizontalGroup(
        g1.createSequentialGroup()
                .addComponent(btn1)
                .addComponent(btn2)
                .addGroup(g1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btn3)
                        .addComponent(btn4)
                )
        );
        
        g1.setVerticalGroup(
                g1.createSequentialGroup()
                    .addGroup(g1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1)
                        .addComponent(btn2)
                        .addComponent(btn3)
                )
                        .addComponent(btn4)
        );
        pack();
    }
    
}

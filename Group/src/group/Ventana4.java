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
public class Ventana4 extends JFrame {
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    
    public Ventana4(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        btn1=new JButton("Boton 1");
        btn2=new JButton("Boton 2");
        btn3=new JButton("Boton 3");
        btn4=new JButton("Boton 4");
        btn5=new JButton("Boton 5");
        btn6=new JButton("Boton 6");
        btn7=new JButton("Boton 7");
        
        //1. Asignamos el layout
        
        Container lienzo=this.getContentPane();
        GroupLayout g1=new GroupLayout(lienzo);
        lienzo.setLayout(g1);
        
        //2. Ponemos automaticos los gaps
        
        g1.setAutoCreateContainerGaps(true);
        g1.setAutoCreateGaps(true);
        
        //3. Creamos el grupo horizonta y el vertical
        
        //3.1 Horizontal
        
        g1.setHorizontalGroup(
                g1.createSequentialGroup()
                    .addGroup(g1.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn1)
                            .addComponent(btn5)
                            //.addComponent(btn6)
                    )
                //g1.createSequentialGroup()
                     .addGroup(g1.createParallelGroup(GroupLayout.Alignment.LEADING)
                             .addComponent(btn2)
                             .addComponent(btn4)
                             .addComponent(btn6)
                     )
                    .addGroup(g1.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn3)
                            .addComponent(btn7)
                    )
                
        );
        
        //3.2 Vertical
        
        g1.setVerticalGroup(
                g1.createSequentialGroup()
                .addGroup(g1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1)
                        .addComponent(btn2)
                        .addComponent(btn3)
                )
                .addGroup(g1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btn4)
                        //.addComponent(btn5)
                )
                .addGroup(g1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btn5)
                        .addComponent(btn6)
                        .addComponent(btn7)
                )
        );
        pack();
    }
}
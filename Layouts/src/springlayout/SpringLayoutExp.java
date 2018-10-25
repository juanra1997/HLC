/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springlayout;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Juanra
 */
public class SpringLayoutExp{
    
    public static void main(String[] args){
        
        MiVentana obj=new MiVentana();
        obj.setVisible(true);
        
    }
}

class MiVentana extends JFrame {
    
    JLabel prueba=new JLabel("Mi borde izquierdo esta a 5 pixeles del borde izquierdo del contenedo del JFrame");
    JLabel prueba2=new JLabel("Mi borde izquierdo esta a 50 pixeles del borde derecho de prueba");
    JTextField txt=new JTextField();
    SpringLayout layout=new SpringLayout();
    Container c;
    
    public MiVentana(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
               
        c=this.getContentPane();
        setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Spring Layout");
        setSize(900, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        
        add(prueba);
        
        add(prueba2);
        
        //Aqui seleccionamos la posicion de prueba
        
        layout.putConstraint(SpringLayout.WEST, prueba, 5, SpringLayout.WEST, c);
        
        //Aqui seleccionamos la posicion de prueba2
        
        layout.putConstraint(SpringLayout.WEST, prueba2, 50, SpringLayout.EAST, prueba);
        
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setEditable(false);
        txt.setText("Estoy a 50 pixeles del borde izquierdo del contenedor y a 100 del borde inferior de prueba");
        add(txt);
        
        //Aqui seleccionamos la posicion de txt
        
        layout.putConstraint(SpringLayout.NORTH, txt, 100, SpringLayout.SOUTH, prueba);
        layout.putConstraint(SpringLayout.WEST, txt, 50, SpringLayout.WEST, c);
        
    }
}

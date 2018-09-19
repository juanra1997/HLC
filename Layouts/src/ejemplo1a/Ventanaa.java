/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventanaa extends JFrame{
    
    private JLabel lbSup;
    private JTextField txt;
    private JLabel lbInf;
    private JButton btnIz;
    private JButton btnDer;
    
    public Ventanaa(){
        inicializar();
    }
    
    public void inicializar(){
        
        lbSup=new JLabel("Superior");
        txt=new JTextField();
        lbInf=new JLabel("Inferior");
        btnIz=new JButton("Salir");
        btnDer=new JButton("Saludo");
        setPreferredSize(new Dimension(400, 200));
        
        //Colocamos
       
        add(lbSup, BorderLayout.PAGE_START);
        add(txt, BorderLayout.CENTER);
        add(lbInf, BorderLayout.PAGE_END);
        add(btnIz, BorderLayout.LINE_START);
        add(btnDer, BorderLayout.LINE_END);
        
        //Codigo botones
        
        btnIz.addActionListener(e->salir());
        btnDer.addActionListener(e->saludo());
    }
        
    //Action Listeners
        
    public void salir(){
           
        System.exit(0);
    }   
    
    public void saludo(){
        
        if(txt.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "Escribe algo");
        } else{
            JOptionPane.showMessageDialog(this, "Hola: "+txt.getText().trim());
        }
    }
}

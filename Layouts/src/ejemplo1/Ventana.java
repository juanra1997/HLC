/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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

public class Ventana extends JFrame{
    
    private JButton btnSalir, btnSaludo;
    private JTextField txtSaludo;
    private JLabel lbSup, lbInf;
    
    //Constructor
    
    public Ventana(){
        
        iniciaComponentes();
    }
    
    //--------------------------------------------------------------------------
    
    public void iniciaComponentes(){
        
        btnSalir=new JButton("SALIR");
        btnSaludo=new JButton("SALUDO");
        txtSaludo=new JTextField();
        lbSup=new JLabel("Encabezado de Mi Ventana");
        lbInf=new JLabel("Pie de Mi Ventana");
        btnSaludo.setBackground(Color.BLUE);
        btnSalir.setBackground(Color.RED);
        txtSaludo.setBackground(Color.BLACK);
        txtSaludo.setForeground(Color.GREEN);
        
        //Cosas mias
        
        lbInf.setHorizontalAlignment(JLabel.CENTER);
        lbSup.setHorizontalAlignment(JLabel.CENTER);
        txtSaludo.setHorizontalAlignment(JTextField.CENTER);
        
        //Colocamos los Objetos en el JFrame
        
        Container lienzo=this.getContentPane();
        lienzo.setPreferredSize(new Dimension(400,200));
        lienzo.add(lbSup, BorderLayout.PAGE_START);
        lienzo.add(btnSalir, BorderLayout.LINE_START);
        lienzo.add(txtSaludo, BorderLayout.CENTER);
        lienzo.add(btnSaludo, BorderLayout.LINE_END);
        lienzo.add(lbInf, BorderLayout.PAGE_END);
        
        //Ponemos codigo a los botones
        
        btnSalir.addActionListener(e->salir());
        btnSaludo.addActionListener(e->saludo());
    }
    //--------------------------------------------------------------------------
    
    public void salir(){
        
        System.exit(0);
    }
    
    //--------------------------------------------------------------------------
    
    public void saludo(){
        
        if(txtSaludo.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "Debes escribir un mensaje, no"
                    + "seas timido");
        } else{
            JOptionPane.showMessageDialog(this, "Hola: "+txtSaludo.getText()
                    .trim());
            txtSaludo.setText("");
        }
    }
    
    //----------------------------A MI MANERA-----------------------------------
    /*
    public void iniciaComponentes(){
    
    btnSalir=new JButton("SALIR");
    btnSaludo=new JButton("SALUDO");
    txtSaludo=new JTextField();
    lbSup=new JLabel("Encabezado de Mi Ventana");
    lbInf=new JLabel("Pie de Mi Ventana");
    btnSaludo.setBackground(Color.BLUE);
    btnSalir.setBackground(Color.RED);
        
    //Colocamos los Objetos en el JFrame
        
    setPreferredSize(new Dimension(400,200));
    add(lbSup, BorderLayout.PAGE_START);
    add(btnSalir, BorderLayout.LINE_START);
    add(txtSaludo, BorderLayout.CENTER);
    add(btnSaludo, BorderLayout.LINE_END);
    add(lbInf, BorderLayout.PAGE_END);
    
    //Ponemos codigo a los botones
        
    btnSalir.addActionListener(e->salir());
    btnSaludo.addActionListener(e->saludo());
    
    }
    */
}

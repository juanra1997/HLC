/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class PanelInferior extends JPanel {
    
    JLabel solucionTxt;
    //JLabel prueba;
    //JTextField solucion;
    JButton btnSalir;
    
    public void iniciaComponentes(){
        
        //FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        solucionTxt=new JLabel("La solución es: ");
        solucionTxt.setSize(10, 10);
        add(solucionTxt);
        /*solucion=new JTextField();
        solucion.setSize(10,10);
        add(solucion);*/
        add(Box.createRigidArea(new Dimension(350,0)));
        btnSalir=new JButton("Salir");
        btnSalir.setSize(60, 40);
        add(btnSalir);
        btnSalir.addActionListener(e->salir());
        
    }
    
    public void salir(){
        System.exit(0);
    }
    public PanelInferior(){
        
        iniciaComponentes();
    }
}

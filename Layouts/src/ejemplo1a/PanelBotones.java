/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class PanelBotones extends JPanel {
    
    private JButton btnSalir;
    private JButton btnSaludo;
    
    public PanelBotones(){
        
        iniciaComponentes();
    }
    
    //--------------------------------------------------------------------------
    
    public void iniciaComponentes(){
        
        btnSalir=new JButton("Salir");
        btnSaludo=new JButton("Saludo");
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setBackground(Color.BLACK);
        btnSaludo.setForeground(Color.CYAN);
        btnSaludo.setBackground(Color.BLACK);
        btnSaludo.setPreferredSize(new Dimension(100,60));
        btnSalir.setPreferredSize(new Dimension(100,60));
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
        /*this.*/setLayout(fl);
        /*this.*/add(btnSaludo);
        /*this.*/add(btnSalir);
        /*this.*/add(Box.createRigidArea(new Dimension(15,0)));
        /*this.*///add(Box.createGlue());
        btnSalir.addActionListener(e->salir());
    }
    
    //--------------------------------------------------------------------------
    
    public void salir(){
        System.exit(0);
    }

    public JButton getBtnSaludo() {
        return btnSaludo;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
}

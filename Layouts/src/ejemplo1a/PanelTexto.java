/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class PanelTexto extends JPanel {
    
    private JTextField txt;
    
    public PanelTexto(){
        iniciaComponentes();
    }
    
    //--------------------------------------------------------------------------
    
    public void iniciaComponentes(){
        
        txt=new JTextField();
        txt.setBackground(Color.BLACK);
        txt.setForeground(Color.PINK);
        txt.setPreferredSize(new Dimension(100,60));
        txt.setMaximumSize(new Dimension(120,60));
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
        /*this.*/setLayout(fl);
        /*this.*/add(txt);
    }
    
    //--------------------------------------------------------------------------        

    public JTextField getTxt() {
        return txt;
    }
    
    
}

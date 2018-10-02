/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class PanelOperaciones extends JPanel {
    
    JTextField p=new JTextField();
    JTextField u=new JTextField();
    JLabel sum=new JLabel("+");
    
    public void iniciaComponentes(){
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        p.setPreferredSize(new Dimension(100,100));
        add(p);
        add(sum);
        u.setPreferredSize(new Dimension(100,100));
        add(u);
    }
    
    public PanelOperaciones(){
        
        iniciaComponentes();
    }

    public JTextField getP() {
        return p;
    }

    public JTextField getU() {
        return u;
    }
}

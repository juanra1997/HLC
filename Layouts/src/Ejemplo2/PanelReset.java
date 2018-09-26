/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class PanelReset extends JPanel{
    
    JButton btn=new JButton("RESET");
    
    public void iniciaComponentes(){
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btn.setSize(100, 100);
        add(btn);
    }
    
    public PanelReset(){
        
        iniciaComponentes();
    }
}

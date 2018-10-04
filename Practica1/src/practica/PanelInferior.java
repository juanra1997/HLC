/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanra
 */
public class PanelInferior extends JPanel {
    
    JButton calcular;
    JButton reset;
    
    public PanelInferior(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
    
        calcular=new JButton("Calcular");
        calcular.setPreferredSize(new Dimension(100, 30));
        calcular.setAlignmentX(CENTER_ALIGNMENT);
        calcular.setBackground(Color.BLACK);
        calcular.setForeground(Color.WHITE);
        add(calcular);
        
        reset=new JButton("Reset");
        reset.setPreferredSize(new Dimension(100, 30));
        reset.setAlignmentX(CENTER_ALIGNMENT);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        add(reset);
        
        setBackground(Color.WHITE);
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }

    public JButton getCalcular() {
        return calcular;
    }

    public void setCalcular(JButton calcular) {
        this.calcular = calcular;
    }
}

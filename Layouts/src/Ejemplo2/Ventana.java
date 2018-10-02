/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements KeyListener {
        JTextField t1;
        JTextField t2;
        PanelInferior pi; 
        JLabel sol;
        PanelCalcular pc;
        JButton btncalc, btnres;
        private PanelReset pr;
        private PanelOperaciones po;
        //private PanelCalcular pc;
    
    public Ventana(){
        iniciaComponentes();
    }
    public void iniciaComponentes(){
        pi=new PanelInferior();
        pr =new PanelReset();
        po=new PanelOperaciones();
        btnres=pr.getBtn();
        
        //BorderLayout bl=new BorderLayout(5, 5);
        setLayout(new BorderLayout(5, 5));
        //PanelInferior pi=new PanelInferior();
        add(pi, BorderLayout.PAGE_END);
        //PanelReset pr=new PanelReset();
        //pr.addKeyListener(this);
        //res.addActionListener(e->Reset());
        add(pr, BorderLayout.LINE_START);
       // PanelOperaciones po=new PanelOperaciones();
        po.addKeyListener(this);
        //JTextField t1=po.getP();
        //JTextField t2=po.getU();
        //añadir caja texto1 y caja texto2
        add(po, BorderLayout.CENTER);
        //PanelCalcular pc=new PanelCalcular();
        //calc.addActionListener(e->Calcular());
        add(pc, BorderLayout.LINE_END);
        PanelTitulo pt=new PanelTitulo();
        add(pt, BorderLayout.PAGE_START);
        setLocationRelativeTo(null);
        
        pack();
    }
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==t1||e.getSource()==t2){
            if(e.getKeyChar()<'0'||e.getKeyChar()>'9'){
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Reset(){
        
        t1.setText("");
        t2.setText("");
        sol.setText("La solución es: ");
    }
    
    public void Calcular(){
        
        sol.setText("La solución es: "+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
    }
}


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements KeyListener, ActionListener{
    
    PanelCentral pc;
    PanelDerecho pd;
    PanelInferior pinf;
    PanelIzquierdo piz;
    PanelSuperior ps;
    JTextField izq, der, intr;
    JButton calc, res;
    
    public Ventana(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        pc=new PanelCentral();
        intr=pc.getIntroduccion();
        intr.addKeyListener(this);
        add(pc, BorderLayout.CENTER);
        pd=new PanelDerecho();
        der=pd.getCantidad();
        add(pd, BorderLayout.LINE_END);
        pinf=new PanelInferior();
        calc=pinf.getCalcular();
        calc.addActionListener(this);
        res=pinf.getReset();
        res.addActionListener(this);
        add(pinf, BorderLayout.PAGE_END);
        piz=new PanelIzquierdo();
        izq=piz.getCantidad();
        add(piz, BorderLayout.LINE_START);
        ps=new PanelSuperior();
        add(ps, BorderLayout.PAGE_START);
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setTitle("Juan Raul Mellado Garcia");
        //getContentPane().setBackground(Color.WHITE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==intr){
            if((e.getKeyChar()<'0'||e.getKeyChar()>'9')&&e.getKeyChar()!='.'){
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

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==calc){
            if(intr.getText().length()!=0){
                izq.setText(intr.getText()+"€");
                String a=String.valueOf(Double.parseDouble(intr.getText())/0.846480);
                boolean encontrado=false;
                int f=0;
                for(; encontrado==false&&f<a.length(); f++) {
                    if(a.charAt(f)=='.') {
                    encontrado=true;
                    }
                }
                if(encontrado==true) {
                    der.setText(a.substring(0, f+3)+"$");
                }else {
                    der.setText(a+"$");
                }
            } else{
                UIManager UI=new UIManager();
		UIManager.put("OptionPane.background", Color.WHITE);
		UIManager.put("Panel.background", Color.WHITE);
                UIManager.put("Button.background", Color.WHITE);
                JOptionPane.showMessageDialog(null, "Introduce una cantidad");
            }
            
        }
        
        if(e.getSource()==res){
            izq.setText("");
            der.setText("");
            intr.setText("");
        }
    }
}

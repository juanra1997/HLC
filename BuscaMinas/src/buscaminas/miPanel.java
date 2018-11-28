/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class miPanel extends JPanel implements ActionListener{
    
    GridLayout gl=new GridLayout(8, 8);
    JButton[][] botones=new JButton[8][8];
    Matriz prueba=new Matriz();
    
    public miPanel(){
        
        iniciaComponentes();
    }
    public void iniciaComponentes(){
        
        setLayout(gl);
        setBackground(Color.WHITE);
        gl.setHgap(5);
        gl.setVgap(5);
        //JOptionPane.showMessageDialog(null, "hola");
        /*for(int i=0; i<64; i++){
            add(new JButton());
        }*/
        
        //----------------------------------------------------------------------
        //Descomentar esto
        for(int i=0; i<botones.length; i++){
            for(int j=0; j<botones[i].length; j++){
                //System.out.println(i+","+j);
                botones[i][j]= new JButton("");
                botones[i][j].setBackground(Color.CYAN);
                botones[i][j].addActionListener(new MyListener(/*prueba.minas, */i, j));
            }
        }
        for(int i=0; i<botones.length; i++){
            for(int j=0; j<botones[i].length; j++){
                add(botones[i][j]);
            }
        }
        //add(new JButton("Hola"));
        
        setVisible(true);
        //----------------------------------------------------------------------
    }

    public JButton[][] getBotones() {
        return botones;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(e.getSource()+"Hola");
    }
}

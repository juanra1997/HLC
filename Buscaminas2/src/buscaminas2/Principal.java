/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Juanra
 */
public class Principal implements MouseListener {

    static Matriz matriz = new Matriz();
    static Ventana obj;
    //static JButton[][] botones=obj.panel.botones;

    public static void main(String[] args) {

        matriz.rellenarMatriz();
        matriz.ponerMinas();
        //matriz.pintarMatriz();
        //matriz.pintarMinas();

        //Ventana obj=new Ventana();
        //obj.setVisible(true);
        inicia();
        //Control c=new Control();
        /*for(int i=0; i<obj.panel.botones.length; i++){
         for(int j=0; j<obj.panel.botones[i].length; j++){
         obj.panel.botones[i][j].addMouseListener(new MouseListener(){

         @Override
         public void mouseClicked(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.out.println("hola");
                        
         }

         @Override
         public void mousePressed(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseReleased(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseEntered(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseExited(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
         });*/
        //}
        //}
    }

    public static void inicia() {
        //Ventana obj;
        //obj=matriz.obj;
        obj = new Ventana(matriz.minas);
        obj.setResizable(false);
        obj.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

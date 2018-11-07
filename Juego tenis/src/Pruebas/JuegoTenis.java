/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */

//Canvas es un panel mas ligero que JPanel

public class JuegoTenis extends Canvas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f=new JFrame("Mini tenis");
        f.add(new JuegoTenis());
        f.setSize(300, 400);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
    }
    
    public void paint(Graphics g){
        
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.BLACK);
        g2d.fillOval(10, 10, 30, 30);
        g2d.drawOval(50, 50, 50, 50);
        g2d.drawOval(200, 50, 50, 50);
        g2d.fillRect(130, 80, 40, 40);
        g2d.drawRect(200, 10, 50, 50);
        g2d.draw(new Ellipse2D.Double(10, 200, 80, 80));
    }
}

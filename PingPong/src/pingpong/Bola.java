/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Juanra
 */
public class Bola {
    
    int x, y;

    public Bola(int px, int py) {
        x=px;
        y=py;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillOval(x, y, 30, 30);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapplication1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class Imagen extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        File fichero = new File("src/f1y0bb.png");
        try {
            Image miImagen = ImageIO.read(fichero);
            g.drawImage(miImagen, 0, 0, null);
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "La imagen no se encuentra");
        }
    }
}

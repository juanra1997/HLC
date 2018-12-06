/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame {

    miPanel panel;
    miPanelLateral lateral;
    int[][] minas;

    public Ventana(int[][] minass) {

        minas = minass;
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        panel = new miPanel(minas);
        panel.setBorder(BorderFactory.createCompoundBorder());
        add(panel, BorderLayout.CENTER);

        lateral = new miPanelLateral(panel.botones);
        lateral.setPreferredSize(new Dimension(150, 40));
        add(lateral, BorderLayout.LINE_END);

        panel.setCuentaBanderas(lateral.banderas);
        panel.setPanel(lateral);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miPanel extends JPanel implements ActionListener, MouseListener {

    int casillas = 0, banderas = 0;
    GridLayout gl = new GridLayout(8, 8);
    JButton[][] botones = new JButton[8][8];
    int[][] minas;
    ImageIcon bandera = new ImageIcon("sintitulo.png");
    ImageIcon bandera2 = new ImageIcon("sintitulo2.png");
    ImageIcon bomba = new ImageIcon("download.png");
    ImageIcon pum = new ImageIcon("2187.png");
    JTextField cuentabanderas;
    miPanelLateral panel;

    public miPanel(int[][] minass) {

        minas = minass;
        iniciaComponentes();

    }

    public void setCuentaBanderas(JTextField b) {
        cuentabanderas = b;
    }

    public void setPanel(miPanelLateral p) {
        panel = p;
    }

    public void iniciaComponentes() {

        setLayout(gl);
        setBackground(Color.WHITE);
        gl.setHgap(5);
        gl.setVgap(5);

        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].setBackground(Color.WHITE);
                botones[i][j].addActionListener(this);
                botones[i][j].addMouseListener(this);
                botones[i][j].setFocusable(false);
                botones[i][j].setEnabled(false);
                if (minas[i][j] == 9) {
                    //botones[i][j].setText("M");
                    add(botones[i][j]);
                } else {
                    add(botones[i][j]);
                }
            }
        }
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                add(botones[i][j]);
            }
        }
        setVisible(true);
    }

    public void contar(int i, int j) {

        int sum = 0;
        if (minas[i][j] == 9) {
            JOptionPane.showMessageDialog(null, "Has perdido");
            panel.hilo.juego = false;
            for (int x = 0; x < minas.length; x++) {
                for (int y = 0; y < minas[i].length; y++) {
                    if (minas[x][y] == 9) {
                        //botones[x][y].setText("");
                        if (botones[i][j] != botones[x][y]) {
                            botones[x][y].setIcon(bomba);
                        } else {
                            //botones[x][y].setText("");
                            botones[x][y].setIcon(pum);
                        }
                    }
                    botones[x][y].setEnabled(false);
                    botones[x][y].setBackground(Color.WHITE);
                }
            }
        } else {
            casillas++;
            if (casillas == 54) {
                JOptionPane.showMessageDialog(null, "Has ganado");
                panel.hilo.juego = false;
                contar(i, j);
                for (int x = 0; x < minas.length; x++) {
                    for (int y = 0; y < minas[i].length; y++) {
                        if (minas[x][y] == 9) {
                            botones[x][y].setIcon(bandera);
                        }
                        botones[x][y].setEnabled(false);
                        botones[x][y].setBackground(Color.WHITE);
                        cuentabanderas.setText("10/10");
                    }
                }
            } else {
                if (i == 0) {
                    if (j == 7) {
                        for (int x = i; x < i + 2; x++) {
                            for (int y = j - 1; y < j + 1; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                        // }
                    } else if (j == 0) {
                        for (int x = i; x < i + 2; x++) {
                            for (int y = j; y < j + 2; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    } else {
                        for (int x = i; x < i + 2; x++) {
                            for (int y = j - 1; y < j + 2; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    }
                    if (j == 7) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i; x < i + 2; x++) {
                                for (int y = j - 1; y < j + 1; y++) {
                                    if (botones[x][y].isEnabled()) {

                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else if (j == 0) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i; x < i + 2; x++) {
                                for (int y = j; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {
                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i; x < i + 2; x++) {
                                for (int y = j - 1; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {
                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    }
                } else if (j == 0) {
                    if (i == 7) {
                        for (int x = i - 1; x < i + 1; x++) {
                            for (int y = j; y < j + 2; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    } else {
                        for (int x = i - 1; x < i + 2; x++) {
                            for (int y = j; y < j + 2; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    }
                    if (i == 0) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 1; x++) {
                                for (int y = j; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {
                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else if (i == 7) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 1; x++) {
                                for (int y = j; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {
                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else {
                        if (botones[i][j].getText().equals("0")) {;
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 2; x++) {
                                for (int y = j; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {
                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    }
                } else if (j == 7) {
                    if (i != 7) {
                        for (int x = i - 1; x < i + 2; x++) {
                            for (int y = j - 1; y < j + 1; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    } else {
                        for (int x = i - 1; x < i + 1; x++) {
                            for (int y = j - 1; y < j + 1; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    }
                    if (i == 0) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 2; x++) {
                                for (int y = j - 1; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {
                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else if (i == 7) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 1; x++) {
                                for (int y = j - 1; y < j + 1; y++) {
                                    if (botones[x][y].isEnabled()) {

                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 2; x++) {
                                for (int y = j - 1; y < j + 1; y++) {
                                    if (botones[x][y].isEnabled()) {

                                        contar(x, y);
                                    }

                                }
                            }

                        }
                    }
                } else if (i == 7) {
                    if (j == 0) {
                        for (int x = i - 1; x < i + 1; x++) {
                            for (int y = j; y < j + 1; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                    } else if (j == 7) {
                        for (int x = i - 2; x < i + 1; x++) {
                            for (int y = j - 1; y < j + 1; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    } else {
                        for (int x = i - 1; x < i + 1; x++) {
                            for (int y = j - 1; y < j + 2; y++) {
                                if (minas[x][y] == 9) {
                                    sum++;
                                }
                            }
                        }
                        botones[i][j].setText(String.valueOf(sum));
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setEnabled(false);
                    }
                    if (i == 0) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 2; x++) {
                                for (int y = j - 1; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {

                                        contar(x, y);
                                    }
                                }
                            }
                        }
                    } else if (i == 7) {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 1; x++) {
                                for (int y = j - 1; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {

                                        contar(x, y);
                                    }

                                }
                            }

                        }
                    } else {
                        if (botones[i][j].getText().equals("0")) {
                            botones[i][j].setText("");
                            for (int x = i - 1; x < i + 2; x++) {
                                for (int y = j - 1; y < j + 2; y++) {
                                    if (botones[x][y].isEnabled()) {

                                        contar(x, y);
                                    }

                                }
                            }

                        }
                    }
                } else {

                    for (int x = i - 1; x < i + 2; x++) {
                        for (int y = j - 1; y < j + 2; y++) {
                            if (minas[x][y] == 9) {
                                sum++;
                            }
                            botones[i][j].setText(String.valueOf(sum));
                            botones[i][j].setBackground(Color.WHITE);
                            botones[i][j].setEnabled(false);
                        }
                    }
                    if (botones[i][j].getText().equals("0")) {
                        botones[i][j].setText("");
                        for (int x = i - 1; x < i + 2; x++) {
                            for (int y = j - 1; y < j + 2; y++) {
                                if (botones[x][y].isEnabled()) {

                                    contar(x, y);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource() == botones[i][j]) {
                    if (botones[i][j].getIcon() == null) {
                        contar(i, j);
                    }
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource() == botones[i][j]) {
                    if (e.getButton() == MouseEvent.BUTTON3) {
                        if (botones[i][j].getIcon() == null && banderas < 10) {
                            botones[i][j].setIcon(bandera);
                            banderas++;
                            if (banderas < 10) {
                                cuentabanderas.setText("0" + banderas + "/10");
                            } else {
                                cuentabanderas.setText("10/10");
                            }
                        } else if (botones[i][j].getIcon() == bandera || (banderas == 10 && botones[i][j].getIcon() != bandera2)) {
                            if (botones[i][j].getIcon() == bandera) {

                                banderas--;
                                cuentabanderas.setText("0" + banderas + "/10");
                            }
                            botones[i][j].setIcon(bandera2);
                        } else if (botones[i][j].getIcon() == bandera2) {
                            botones[i][j].setIcon(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

class miPanelLateral extends JPanel implements ActionListener {

    JButton iniciar, pausar, salir;
    JTextField banderas, tiempo;
    JButton[][] botones;
    Hilo hilo;
    boolean primero = false;

    public miPanelLateral(JButton[][] b) {

        iniciaComponentes();
        botones = b;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        File fichero = new File("sintitulo.png");
        File fichero2 = new File("34116.png");

        try {
            Image miImagen = ImageIO.read(fichero);
            g.drawImage(miImagen, 50, 10, null);
        } catch (IOException ex) {
            Logger.getLogger(miPanelLateral.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Image miImagen = ImageIO.read(fichero2);
            g.drawImage(miImagen, 50, 100, null);
        } catch (IOException ex) {
            Logger.getLogger(miPanelLateral.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void iniciaComponentes() {

        setLayout(null);

        setBackground(Color.WHITE);
        setBorder(BorderFactory.createCompoundBorder());

        iniciar = new JButton("INICIAR");

        iniciar.setBounds(25, 220, 100, 25);
        iniciar.setForeground(Color.BLUE);
        iniciar.addActionListener(this);
        add(iniciar);

        pausar = new JButton("PAUSAR");

        pausar.setBounds(25, 260, 100, 25);
        pausar.setForeground(new Color(68, 121, 65));
        pausar.setEnabled(false);
        pausar.addActionListener(this);
        add(pausar);

        salir = new JButton("SALIR");

        salir.setBounds(25, 300, 100, 25);
        salir.setForeground(Color.RED);
        salir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(salir);

        banderas = new JTextField();

        banderas.setBackground(Color.BLACK);
        banderas.setForeground(Color.GREEN);
        banderas.setBounds(25, 60, 100, 25);
        banderas.setHorizontalAlignment(JTextField.CENTER);
        banderas.setText("00/10");
        add(banderas);

        tiempo = new JTextField();

        tiempo.setBackground(Color.BLACK);
        tiempo.setForeground(Color.GREEN);
        tiempo.setBounds(25, 160, 100, 25);
        tiempo.setHorizontalAlignment(JTextField.CENTER);
        tiempo.setText("00:00");
        add(tiempo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciar) {
            if (!primero) {
                hilo = new Hilo(tiempo);
                hilo.start();
                primero = true;
                for (int i = 0; i < botones.length; i++) {
                    for (int j = 0; j < botones[i].length; j++) {
                        botones[i][j].setBackground(Color.CYAN);
                        botones[i][j].setEnabled(true);
                    }
                }
            } else {
                hilo.esperar = false;
                for (int i = 0; i < botones.length; i++) {
                    for (int j = 0; j < botones[i].length; j++) {
                        if (botones[i][j].getBackground() == Color.BLACK) {

                            botones[i][j].setBackground(Color.CYAN);
                            botones[i][j].setEnabled(true);
                        }
                    }
                }
            }
            iniciar.setEnabled(false);
            pausar.setEnabled(true);
        }
        if (e.getSource() == pausar) {
            for (int i = 0; i < botones.length; i++) {
                for (int j = 0; j < botones[i].length; j++) {
                    if (botones[i][j].getBackground() == Color.CYAN) {
                        botones[i][j].setBackground(Color.BLACK);
                        botones[i][j].setEnabled(false);
                    }

                }
            }
            iniciar.setEnabled(true);
            pausar.setEnabled(false);
            hilo.esperar = true;
        }
    }
}

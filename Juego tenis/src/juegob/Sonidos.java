/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegob;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Juanra
 */
public class Sonidos {
    
    public static final AudioClip SOUNDPELOTA=Applet.newAudioClip(Sonidos.class.getResource("ball.wav"));
    public static final AudioClip SOUNDGAMEOVER=Applet.newAudioClip(Sonidos.class.getResource("gameover.wav"));
}

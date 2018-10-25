/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Juanra
 */
public class Control {

    public Control(Ventana v) {

        //------------------------------------------------------------1-----------------------------------------
        v.p0.pb.ultimo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                v.cl.last(v.getContentPane());
            }
        });

        v.p0.pb.primero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.first(v.getContentPane());
            }

        });

        v.p0.pb.siguiente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.next(v.getContentPane());
            }

        });

        v.p0.pb.previo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.previous(v.getContentPane());
            }

        });

        //------------------------------------------------------------2-----------------------------------------
        v.p1.pb.ultimo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                v.cl.last(v.getContentPane());
            }

        });

        v.p1.pb.primero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.first(v.getContentPane());
            }

        });

        v.p1.pb.siguiente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.next(v.getContentPane());
            }

        });

        v.p1.pb.previo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.previous(v.getContentPane());
            }

        });

        //------------------------------------------------------------1-----------------------------------------
        v.p2.pb.ultimo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                v.cl.last(v.getContentPane());
            }

        });

        v.p2.pb.primero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.first(v.getContentPane());
            }

        });

        v.p2.pb.siguiente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.next(v.getContentPane());
            }

        });

        v.p2.pb.previo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.previous(v.getContentPane());
            }

        });

        //------------------------------------------------------------1-----------------------------------------
        v.p3.pb.ultimo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                v.cl.last(v.getContentPane());
            }

        });

        v.p3.pb.primero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.first(v.getContentPane());
            }

        });

        v.p3.pb.siguiente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.next(v.getContentPane());
            }

        });

        v.p3.pb.previo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                v.cl.previous(v.getContentPane());
            }

        });
    }

}

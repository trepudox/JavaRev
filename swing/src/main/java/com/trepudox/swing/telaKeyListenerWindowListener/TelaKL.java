package com.trepudox.swing.telaKeyListenerWindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaKL extends JFrame implements WindowListener, KeyListener {

    public TelaKL() {
        this.setTitle("TelaKL");

        this.setMinimumSize(new Dimension(400, 300));
        this.setVisible(true);
        this.addWindowListener(this);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'a') {
            System.out.println("a");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a') {
            System.out.println("A");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 'a') {
            System.out.println("1");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("bum");
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("oi?");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("tchau");
    }
}

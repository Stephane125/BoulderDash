package fr.exia.boulderdash.view;

import java.awt.event.*;

/**
 * The KeyListener Test.
 *
 * @author Stephane
 * @version 0.1
 */

public class keyListener implements java.awt.event.KeyListener {

    keyListener(){

    }

    /**
     * Instantiates a new keyListener with 1 entity, key.
     */

    public char key;

    /**
     * The keyTyped
     * @param e
     */
    public void keyTyped(KeyEvent e) {
        //Invoked when a key has been typed.
        //This event occurs when a key press is followed by a key release.
    }

    /**
     * The keyPressed
     * @param e
     */
    public void keyPressed(KeyEvent e) {
        //Invoked when a key has been pressed.
        key = e.getKeyChar();
    }

    /**
     * The keyReleased
     * @param e
     */
    public void keyReleased(KeyEvent e) {
        //Invoked when a key has been released.
        key='%';
    }
}

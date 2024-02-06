package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Bat Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Bat extends MotionlessElement {

    /**
     * The Constant Bat SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('3', "bat.png");

    /**
     * Instantiates a new bat.
     */
    public Bat() {
        super(SPRITE, Permeability.KILLING);
    }
}
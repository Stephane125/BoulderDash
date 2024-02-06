package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Class Nothing.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Nothing extends MotionlessElement {

    /**
     * The Constant Nothing SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('v', "void.jpg");

    /**
     * Instantiates a new nothing.
     */
    public Nothing() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}

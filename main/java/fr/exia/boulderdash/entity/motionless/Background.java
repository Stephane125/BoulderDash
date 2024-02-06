package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Background Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Background extends MotionlessElement {

    /**
     * The Constant SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('=', "MurCasse.png");

    /**
     * Instantiates a new background.
     */
    public Background() { super(SPRITE, Permeability.PENETRABLE); }
}

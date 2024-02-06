package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Butterfly Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Butterfly extends MotionlessElement {

    /**
     * The Constant Butterfly SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('2', "papillon.png");

    /**
     * Instantiates a new butterfly.
     */
    public Butterfly() {
        super(SPRITE, Permeability.KILLING);
    }
}


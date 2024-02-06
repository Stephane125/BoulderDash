package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Octopus Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Octopus extends MotionlessElement {

    /**
     * The Constant Octopus SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('1', "poulpe.png");

    /**
     * Instantiates a new octopus.
     */
    public Octopus() {
        super(SPRITE, Permeability.KILLING);
    }
}

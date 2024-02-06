package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Diamond Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Diamond extends MotionlessElement  {

    /**
     * The Constant Diamond SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('P', "Diamond.png");

    /**
     * Instantiates a new diamond.
     */
    public Diamond() {
        super(SPRITE, Permeability.COLLECTIBLE);
    }
}

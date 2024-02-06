package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The DestructibleObstacle Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class DestructibleObstacle extends MotionlessElement {

    /**
     * The Constant DestructibleObstacle SPRITE.
     */
    private static final Sprite DESTRUCTIBLE_SPRITE = new Sprite('D', "DestructibleObstacle.png");

    /**
     * Instantiates a new destructibleObstacle.
     */
    public DestructibleObstacle() { super(DESTRUCTIBLE_SPRITE, Permeability.DESTRUCTING);}
}



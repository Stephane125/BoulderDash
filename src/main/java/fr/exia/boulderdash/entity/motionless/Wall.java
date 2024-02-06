package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Wall Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Wall extends MotionlessElement {

    /**
     * The Constant Wall SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('^', "wall.png");

    /**
     * Instantiates a new wall.
     */
    public Wall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}

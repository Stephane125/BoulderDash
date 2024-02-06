package fr.exia.boulderdash.model.element;
import fr.exia.boulderdash.contract.Permeability;

/**
 * <h1>The MotionlessElement Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public abstract class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite       the sprite
     * @param permeability the permeability
     */
    public MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
}

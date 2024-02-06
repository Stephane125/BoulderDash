package fr.exia.boulderdash.entity.motionless;

import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MotionlessElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The Boulder Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class Boulder extends MotionlessElement {

    /**
     * The Constant Boulder SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('B', "Boulder.png");

    /**
     * Instantiates a new boulder.
     */
    public Boulder() {
        super(SPRITE, Permeability.BLOCKING);
    }

	public void fall() {
 		
	}

	 
	
	}

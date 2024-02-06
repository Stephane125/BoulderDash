package fr.exia.boulderdash.entity.mobile;

import java.io.IOException;

import fr.exia.boulderdash.contract.IMap;
import fr.exia.boulderdash.contract.Permeability;
import fr.exia.boulderdash.model.element.MobileElement;
import fr.exia.boulderdash.model.element.Sprite;

/**
 * <h1>The MyPlayer Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class MyPlayer extends MobileElement {

    /**
     * The Constant SPRITE.
     */
    private static final Sprite sprite = new Sprite('H', "face 4.png");

    /**
     * The Constant spriteTurnLeft.
     */
    private static final Sprite spriteTurnLeft = new Sprite('H', "gauche 1.png");

    /**
     * The Constant spriteMoveDown.
     */
    private static final Sprite spriteMoveDown = new Sprite('H', "bas 2.png");

    /**
     * The Constant spriteMoveUp.
     */
    private static final Sprite spriteMoveUp = new Sprite('H', "face 3.png");

    /**
     * The Constant spriteTurnRight.
     */
    private static final Sprite spriteTurnRight = new Sprite('H', "droite 1.png");

    /**
     * Instantiates a new myPlayer.
     *
     * @param x   the x
     * @param y   the y
     * @param map the map
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MyPlayer(final int x, final int y, final IMap map) throws IOException {
        super(x, y, sprite, map, Permeability.BLOCKING);
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteMoveDown.loadImage();
        spriteMoveUp.loadImage();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.model.element.MobileElement#moveLeft()
     */
    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteTurnLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.model.element.MobileElement#moveDown()
     */
    public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteMoveDown);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.model.element.MobileElement#moveUp()
     */
    public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteMoveUp);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.model.element.MobileElement#moveRight()
     */
    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteTurnRight);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.model.element.MobileElement#destruct()
     */
    protected final void destruct() {
        super.destruct();
        this.setSprite(sprite);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.model.element.MobileElement#doNothing()
     */
    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(sprite);
    }
}

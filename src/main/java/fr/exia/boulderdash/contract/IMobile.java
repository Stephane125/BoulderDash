package fr.exia.boulderdash.contract;

import java.awt.Point;
import fr.exia.showboard.IPawn;

/**
 * <h1>The Interface IMobile.</h1>
 *
 * @author Stephane
 * @version 0.1
 * @see IPawn
 * @see IElement
 */

public interface IMobile extends IPawn, IElement {

    /**
     * Move up.
     */
    void moveUp();

    /**
     * Move left.
     */
    void moveLeft();

    /**
     * Move down.
     */
    void moveDown();

    /**
     * Move right.
     */
    void moveRight();

    /**
     * Do nothing.
     */
    void doNothing();

    /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    int getX();

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    int getY();

    /**
     * Checks if is alive.
     *
     * @return the boolean alive
     */
    Boolean isAlive();

    /**
     * Checks if has won.
     *
     * @return the boolean win
     */
    Boolean hasWon();

    /**
     * Checks if the player blocked.
     *
     * @return the boolean blocked
     */
    Boolean isBlocked();

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    Point getPosition();
}

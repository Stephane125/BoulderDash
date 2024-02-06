package fr.exia.boulderdash.model.element;

import fr.exia.boulderdash.entity.motionless.*;

/**
 * <h1>A factory to create MotionlessElements objects.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public abstract class MotionlessElementsFactory {

    /**
     * The Constant VOID.
     */
    private static final Nothing VOID = new Nothing();

    /**
     * The Constant WALL.
     */
    private static final Wall WALL = new Wall();

    /**
     * The Constant BACKGROUND.
     */
    private static final Background BACKGROUND = new Background();

    /**
     * The Constant OCTOPUS.
     */
    private static final Octopus OCTOPUS = new Octopus();

    /**
     * The Constant BUTTERFLY.
     */
    private static final Butterfly BUTTERFLY = new Butterfly();

    /**
     * The Constant BAT.
     */
    private static final Bat BAT = new Bat();

    /**
     * The Constant DIAMOND.
     */
    private static final Diamond DIAMOND = new Diamond();

    /**
     * The Constant BOULDER.
     */
    private static final Boulder BOULDER = new Boulder();

    /**
     * The Constant DESTRUCTIBLE_OBSTACLE.
     */
    private static final DestructibleObstacle DESTRUCTIBLE_OBSTACLE = new DestructibleObstacle();

    /**
     * The motionless elements is an array of all possible MotionlessElement.
     */
    private static MotionlessElement[] motionlessElements = {
            VOID,
            BACKGROUND,
            OCTOPUS,
            DESTRUCTIBLE_OBSTACLE,
            WALL,
            BUTTERFLY,
            BAT,
            DIAMOND,
            BOULDER,};

    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createVoid() {
        return VOID;
    }

    /**
     * Creates a new background object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createBackground() {
        return BACKGROUND;
    }

    /**
     * Creates a new octopus object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createOctopus() {
        return OCTOPUS;
    }

    /**
     * Creates a new wall object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createWall() {
        return WALL;
    }

    /**
     * Creates a new diamond object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createDiamond() { return DIAMOND; }


    /**
     * Gets the good MotionlessElement from file symbol.
     *
     * @param fileSymbol the file symbol
     * @return the from file symbol
     */
    public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return BACKGROUND;
    }
}

package fr.exia.boulderdash.model.element;

import java.awt.*;

import fr.exia.boulderdash.contract.IMap;
import fr.exia.boulderdash.contract.IMobile;
import fr.exia.boulderdash.contract.Permeability;
import fr.exia.showboard.IBoard;

/**
 * <h1>The MobileElement Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public abstract class MobileElement extends Element implements IMobile {

    /**
     * The diamonds.
     */
    public static int diamonds = 0;

    /**
     * The position.
     */
    private Point position;

    /**
     * The alive.
     */
    private Boolean alive = true;

    /**
     * The won.
     */
    private Boolean won = true;

    /**
     * The map.
     */
    public static IMap map;

    /**
     * The board.
     */
    private IBoard board;

    /**
     * Instantiates a new mobile.
     *
     * @param sprite       the sprite
     * @param map          the map
     * @param permeability the permeability
     */
    MobileElement(final Sprite sprite, final IMap map, final Permeability permeability) {
        super(sprite, permeability);
        this.setMap(map);
        this.position = new Point();
    }

    /**
     * Instantiates a new mobile.
     *
     * @param x            the x
     * @param y            the y
     * @param sprite       the sprite
     * @param map          the map
     * @param permeability the permeability
     */
    public MobileElement(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
        this(sprite, map, permeability);
        this.setX(x);
        this.setY(y);
    }

    /**
     * Move Up
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#moveUp()
     */
    @Override
    public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
    }

    /**
     * Move Left
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#moveLeft()
     */
    @Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
    }

    /**
     * Move Down
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#moveDown()
     */
    @Override
    public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
    }

    /**
     * Move Right
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#moveRight()
     */
    @Override
    public void moveRight() {
        this.setX(this.getX() + 1);
        this.setHasMoved();
    }

    /**
     * Do Nothing
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#doNothing()
     */
    @Override
    public void doNothing() {
        this.setHasMoved();
    }

    /**
     * Sets the has moved.
     */
    private void setHasMoved() {
        this.getMap().setMobileHasChanged();
    }

    /**
     * Gets the X.
     *
     * @return getPosition
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#getX()
     */
    @Override
    public final int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x the new x
     */
    public final void setX(final int x) {

        int oldx = this.getX();
       if (this.getMap().getWidth() > 0) {
        this.getPosition().x = (x + this.getMap().getWidth()) % this.getMap().getWidth();
        if (this.isBlocked()) {
            setX(oldx);
        }
        if (this.isDestroying()) {
            this.destruct();
        }
        if (this.isCollected()){
            this.collect();
        }
        if (this.isKilled()){
            this.die();
        }
    }
    }


    /**
     * Gets the Y
     *
     * @return the Y
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#getY()
     */
    @Override
    public final int getY() {
        return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y the new y.
     */
    public final void setY(final int y) {
        int oldy = this.getY();
       if (this.getMap().getHeight() > 0) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
        if (this.isBlocked()) {
            setY(oldy);
        }
        if (this.isDestroying()) {
            this.destruct();
        }
        if (this.isCollected()){
            this.collect();
        }
        if (this.isKilled()){
            this.die();
        }
    }
    }

    /**
     * Gets the map.
     *
     * @return the map
     */
    public IMap getMap() {

        return this.map;
    }

    /**
     * Sets the map.
     *
     * @param map the new map
     */
    private void setMap(final IMap map) {
        this.map = map;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#isAlive()
     */
    @Override
    public Boolean isAlive() {
        return this.alive;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#hasWon()
     */
    @Override
    public Boolean hasWon() {
        return this.won;
    }

    /**
     * Dies.
     */
    protected void die() {
        this.alive = false;
        this.setHasMoved();
    }

    /**
     * Wins.
     */
    protected void win() {
        this.won = false;
        this.setHasMoved();
    }

    /**
     * Destructs.
     */
    protected void destruct() {
        this.setHasMoved();
        this.map.setOnTheMapXY(null, getX(), getY());
        this.map.setOnTheMapXY(MotionlessElementsFactory.createBackground(), getX(), getY());
    }

    /**
     * Collects.
     */
    protected void collect() {
        this.setHasMoved();
        this.map.setOnTheMapXY(null, getX(), getY());
        this.map.setOnTheMapXY(MotionlessElementsFactory.createBackground(), getX(), getY());
        diamonds++;
        System.out.println("Score : " + diamonds + "/" + this.getMap().getObjective());
        if (diamonds == this.getMap().getObjective()){
            this.win();
        }
    }
 
    /**
     * Instantiates an object which can crush.
     *
     * @return the map, the ON mapXY, the permeability
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#isBlocked()
     */
    public Boolean isBlocked() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;

    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#isKilled()
     */
    public Boolean isKilled() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.KILLING;

    }

    /**
     * Instantiates an entity who can destroy.
     *
     * @return the map,the ON MapXY, the permeability
     */
    public Boolean isDestroying() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.DESTRUCTING;
    }

    /**
     * Gets the position.
     *
     * @return The position
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#isCollected()
     */
    public Boolean isCollected() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.COLLECTIBLE;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.boulderdash.contract.IMobile#getPosition()
     */
    @Override
    public Point getPosition() {

        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }

}

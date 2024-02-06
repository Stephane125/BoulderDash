package fr.exia.boulderdash.model.element;


import fr.exia.boulderdash.entity.mobile.MyPlayer;

import fr.exia.boulderdash.entity.motionless.Boulder;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;



import static org.junit.Assert.*;

/**
 * The MobileElement Test.
 *
 * @author Stephane
 * @version 0.1
 */

public class MobileElementTest {
    /**
     * Instantiates a new MobileElementTest with 3 entity, myPlayer,Map and Boulder.
     */
    public MobileElementTest() {
    }

    private MyPlayer myPlayer;
    private Map map;
    /**
     * The setUp of the tests
     */
    @Before
    public void setUp() throws Exception {
        myPlayer = new MyPlayer(5, 0, new Map("C:\\Users\\paoss\\Desktop\\groupe1\\src\\main\\resources", 31, 31, 1));
        map = new Map("C:\\Users\\paoss\\Desktop\\groupe1\\src\\main\\resources", 31, 31, 1);
        new Boulder();
    }

    /**
     * The tearDown of the tests
     */
    @After
    public void tearDown() throws Exception {
        myPlayer = null;
        map = null;
        //boulder = null;
    }


    /**
     * Test move left with myPlayer coordinates.
     */
    @Test
    public void moveLeft() {
        myPlayer.moveLeft();
        assertEquals(4, myPlayer.getX());
        assertEquals(0, myPlayer.getY());
    }

    /**
     * Test Move Right with myPlayer coordinates.
     */
    @Test
    public void moveRight() { // Same process for moveUp and moveDown
        myPlayer.moveRight();
        assertEquals(6, myPlayer.getX());
        assertEquals(0, myPlayer.getY());
    }

    /**
     * Test Do Nothing with myPlayer coordinates.
     */
    @Test
    public void doNothing() {
        myPlayer.doNothing();
        assertEquals(5, myPlayer.getX());
        assertEquals(0, myPlayer.getY());
    }

    /**
     * Test gets the map.
     */
    @Test
    public void getMap() {

        assertNotEquals(null, map);
    }

    /**
     * Test MyPlayer is alive.
     */
    @Test
    public void isAlive() {

        assertEquals(true, myPlayer.isAlive());
    }

    /**
     * Test myPlayer is die.
     */
    @Test
    public void die() {
        myPlayer.die();
        assertEquals(false, myPlayer.isAlive());
    }


}




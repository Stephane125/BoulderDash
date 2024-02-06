package fr.exia.boulderdash.model.element;

import fr.exia.boulderdash.contract.IElement;

import fr.exia.boulderdash.entity.mobile.MyPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

/**
 * <h1>The Map Test.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class MapTest {

    /**
     * Instantiates a new MapTest with 3 entity, myPlayer,Map and onTheMap.
     */
    private MyPlayer myPlayer;
    private Map map;
    private IElement[][] onTheMap = new IElement[15][0];

    /**
     * The setUp of the tests
     */
    @Before
    public void setUp() throws Exception {

        myPlayer = new MyPlayer(5, 5, new Map("C:\\Users\\paoss\\Desktop\\groupe1\\src\\main\\resources\\map.txt", 1, 7, 1));
        map = new Map("C:\\Users\\paoss\\Desktop\\groupe1\\src\\main\\resources\\map.txt", 31, 31, 1);

    }

    /**
     * The tearDown of the tests
     */
    @After
    public void tearDown() {
        map = null;
    }

    /**
     * test Gets the Width
     */
    @Test
    public void getWidth() {


        assertNotEquals(null, map.getWidth());
    }

    /**
     * test Gets the Height
     */
    @Test
    public void getHeight() {

        assertNotEquals(null, map.getHeight());
    }

    /**
     * test Gets on the MapXY
     */
    @Test
    public void getOnTheMapXY() {


        assertNotEquals(null, map.getOnTheMapXY(15, 0));
    }

    /**
     * test Sets Mobile has change
     */
    @Test
    public void setMobileHasChanged() {
        //TODO
    }

    /**
     * test Gets the observable
     */
    @Test
    public void getObservable() {
        //TODO
    }

    /**
     * test the OOB Test
     */

    @Test
    public void OOBTest() {
        assertTrue(0 <= myPlayer.getX() && 7 >= myPlayer.getX());
        assertTrue(0 <= myPlayer.getY() && 1 >= myPlayer.getY());
    }
}


package fr.exia.boulderdash.model;

import fr.exia.boulderdash.entity.mobile.MyPlayer;
import fr.exia.boulderdash.model.element.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The Model Test.
 *
 * @author Stephane
 * @version 0.1
 */
public class ModelTest {

    /**
     * Instantiates a new ModelTest with 1 entity, myPlayer.
     */
    private MyPlayer myPlayer;

    /**
     * The setUp of the tests
     * @throw Exception
     */
    @Before
    public void setUp() throws Exception {

        myPlayer = new MyPlayer(5, 0, new Map("C:\\Users\\paoss\\Desktop\\groupe1\\src\\main\\resources", 31, 31,1));
    }

    /**
     * The tearDown of the tests
     */
    @After
    public void tearDown()  {

        myPlayer = null;
    }

    /**
     * Test, Gets the Map
     */
    @Test
    public void getMap() {

        assertNotNull(null, myPlayer.getMap());
    }

}
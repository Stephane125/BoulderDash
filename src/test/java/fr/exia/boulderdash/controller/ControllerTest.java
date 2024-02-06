package fr.exia.boulderdash.controller;

import fr.exia.boulderdash.entity.mobile.MyPlayer;
import fr.exia.boulderdash.model.Model;
import fr.exia.boulderdash.model.element.Map;
import fr.exia.boulderdash.view.View;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * The Controller Test.
 *
 * @author Stephane 
 * @version 0.1
 *  */
public class ControllerTest {

    /**
     * Instantiates a new ControllerTest with 2 entity, myPlayer and controller.
     */
    private Controller controller;
    private MyPlayer myPlayer;

    /**
     * The setUp of the tests
     */
    @Before
    public void setUp() throws Exception {
        myPlayer = new MyPlayer(5, 0, new Map("C:\\Users\\paoss\\Desktop\\groupe1\\src\\main\\resources", 31, 31,2 ));
        controller = new Controller(new View(new Map(), myPlayer), new Model(4, 8) {
        });
    }

    /**
     * The tearDown of the test
     */
    @After
    public void tearDown() throws Exception {
        myPlayer = null;
    }

    /**
     * Test the play
     */
    @Test
    public void play() {
 myPlayer.moveLeft();
        assertEquals(4, myPlayer.getX());
    }

    /**
     * Test the orderPerform
     */
    @Test
    public void orderPerform() {

        //  assertEquals();
    }

    /**
     * Test Gets the OrderPerformer
     */
    @Test
    public void getOrderPerformer() {
        assertNotNull(null, controller.getOrderPerformer());
    }
}
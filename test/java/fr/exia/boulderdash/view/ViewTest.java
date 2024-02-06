package fr.exia.boulderdash.view;


import fr.exia.boulderdash.contract.IOrderPerformer;
import fr.exia.boulderdash.contract.UserOrder;
import fr.exia.boulderdash.entity.mobile.MyPlayer;
import fr.exia.boulderdash.model.element.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;

import static org.junit.Assert.*;

/**
 * The View Test.
 *
 * @author Stephane
 * @version 0.1
 */
public class ViewTest {


    public ViewTest() {
    }

    /**
     * Instantiates a new ViewTest with 6 entity, myPlayer, orderPerformer, testJpanel, keyExpected, key and keyListener.
     */
    private IOrderPerformer orderPerformer;
    private MyPlayer myPlayer;
    private View testJpanel;
    private char keyExpected;
    private char key;
    private keyListener keyListener;

    /**
     * The setUp of the tests.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        myPlayer = new MyPlayer(5, 8, new Map());
        testJpanel = new View(new Map(), myPlayer);

        keyListener = new fr.exia.boulderdash.view.keyListener();
    }

    /**
     * The tearDown of the test.
     */
    @After
    public void tearDown() {
        myPlayer = null;
        testJpanel = null;
        keyListener = null;
    }

    /**
     *The displayMessage test.
     */
    @Test
    public void displayMessage() {
        testJpanel.displayMessage("JUnit test display");
        assertNotEquals(null, testJpanel);
    }

    /**
     * The run test
     */
    @Test
    public void run() {
        testJpanel.run();
        assertNotEquals(null, testJpanel);
    }

    /**
     * The keyPressed test.
     */
    @Test
    public void keyPressed() {
        key = keyListener.key;
        assertEquals(key, keyExpected);
    }



}
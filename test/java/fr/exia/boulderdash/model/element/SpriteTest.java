package fr.exia.boulderdash.model.element;

import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Sprite Test.
 *
 * @author Stephane
 * @version 0.1
 */
public class SpriteTest {
    /**
     * Instantiates a new SpriteTest with 1 entity, sprite.
     */
    private Sprite sprite;

    /**
     * The setUp of the tests
     */
    @Before
    public void setUp() {
        sprite = new Sprite('^', "wall.png");
    }

    /**
     * the tearDown of the tests
     */
    @After
    public void tearDown() {
        sprite = null;
    }

    /**
     * Test the getImage
     */
    @Test
    public void getImage() {

        assertNull(null, sprite.getImage());
    }

}
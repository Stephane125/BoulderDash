package fr.exia.boulderdash.model.element;

import fr.exia.boulderdash.entity.motionless.Wall;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * The Element Test.
 *
 * @author Stephane
 * @version 0.1
 */
public class ElementTest {
    /**
     * Instantiates a new ElementTest with 2 entity, sprite, wall.
     */
    private Sprite sprite;
    private Wall wall;


    /**
     * The setUp of the tests
     */
    @Before
    public void setUp() {
        sprite = new Sprite('^', "wall.png");
        wall = new Wall();
        wall.setSprite(sprite);
    }
    /**
     * The tearDown of the test
     */
    @After
    public void tearDown() {
        sprite = null;
        wall = null;

    }

    /**
     * Test Gets the Sprite
     */
    @Test
    public void getSprite() {
        assertEquals(sprite, wall.getSprite());
        //assertSame( sprite.getImage(), wall.getSprite().getImage());
    }

    /**
     * Test gets the permeability.
     */
    @Test

    public void getPermeability() {

        assertEquals(sprite, wall.getSprite());
    }

    /**
     * Test Gets the image.
     */
    @Test
    public void getImage() {

        assertEquals(sprite, wall.getSprite());
    }


}
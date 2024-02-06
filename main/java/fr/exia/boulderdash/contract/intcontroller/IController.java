package fr.exia.boulderdash.contract.intcontroller;
import fr.exia.boulderdash.contract.IOrderPerformer;

/**
 * <h1>The Interface IController.</h1>
 *
 * @author Stephane
 * @version 0.1
 * @see IOrderPerformer
 */

public interface IController {

    /**
     * Play.
     *
     * @throws InterruptedException the interrupted exception
     */
    void play() throws InterruptedException;

    /**
     * Gets the order peformer.
     *
     * @return the order peformer
     */
    IOrderPerformer getOrderPerformer();
}

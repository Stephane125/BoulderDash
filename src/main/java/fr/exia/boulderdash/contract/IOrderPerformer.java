package fr.exia.boulderdash.contract;

import java.io.IOException;

/**
 * <h1>The Interface IOrderPerformed.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public interface IOrderPerformer {

    /**
     * Order perform.
     *
     * @param userOrder the user order
     * @throws IOException Signals that an I/O exception has occurred.
     */
    void orderPerform(UserOrder userOrder) throws IOException;
}

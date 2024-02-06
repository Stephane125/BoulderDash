package fr.exia.boulderdash.contract.intmodel;

import fr.exia.boulderdash.contract.IMap;
import fr.exia.boulderdash.contract.IMobile;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public interface IModel {

    /**
     * Gets the map.
     *
     * @return the map
     */
    IMap getMap();

    /**
     * Gets the myPlayer.
     *
     * @return the myPlayer
     */
    IMobile getMyPlayer();
    

    void loadDAOMap(String code);

 }

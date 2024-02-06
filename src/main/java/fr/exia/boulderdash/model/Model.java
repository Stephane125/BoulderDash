package fr.exia.boulderdash.model;

import fr.exia.boulderdash.contract.IMap;
import fr.exia.boulderdash.contract.IMobile;
import fr.exia.boulderdash.contract.intmodel.IModel;
import fr.exia.boulderdash.entity.DAOMap;
import fr.exia.boulderdash.entity.mobile.*;
import fr.exia.boulderdash.model.dao.DAOInteraction;
import fr.exia.boulderdash.model.dao.DBConnection;
import fr.exia.boulderdash.model.element.Map;

import java.sql.SQLException;
import java.io.IOException;

/**
 * Class Model. 
 */
public class Model implements IModel {

    /**
     * The map.
     */
    private IMap map;

    /**
     * The myPlayer.
     */
    private IMobile myPlayer;

    /**
     * The DAOMap.
     */
    private DAOMap DAOMap;

    /**
     * Instantiates a new boulderdash model.
     *
     * @param myPlayerStartX the myPlayerStartX
     * @param myPlayerStartY the myPlayerStartY
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public Model(final int myPlayerStartX, final int myPlayerStartY) throws IOException {
        Map map = new Map();
        this.DAOMap = new DAOMap();
        this.loadDAOMap("L2");
        String messagestring = DAOMap.getLayout();
        this.setMap(new Map(messagestring, DAOMap.getmapHeight(), DAOMap.getmapWidth(), DAOMap.getmapObjective()));
        this.setMyPlayer(new MyPlayer(myPlayerStartX, myPlayerStartY, this.getMap()));
    }

    /**
     * Gets the map
     *
     * @return map
     */
    /* (non-Javadoc)
     * @see fr.exia.boulderdash.contract.intmodel.IModel#getRoad()
     */
    @Override
    public final IMap getMap() {
        return this.map;
    }

    /**
     * Sets the map.
     *
     * @param map the map to set
     */
    private void setMap(final IMap map) {
        this.map = map;
    }

    /* (non-Javadoc)
     * @see fr.exia.boulderdash.contract.intmodel.IModel#getMyPlayer()
     */
    @Override
    public final IMobile getMyPlayer() {
        return this.myPlayer;

    }

    /**
     * Sets the myPlayer.
     *
     * @param myPlayer the myPlayer to set
     */
    private void setMyPlayer(final IMobile myPlayer) {
        this.myPlayer = myPlayer;
    }

    /**
     * Gets the DAOMap.
     *
     * @return the DAOMap
     */
    public DAOMap getDAOMap() {
        return this.DAOMap;
    }

    /**
     * Sets the DAOMap.
     *
     * @param DAOMap the new DAOMap
     */
    private void setDAOMap(final DAOMap DAOMap) {
        this.DAOMap = DAOMap;
    }

     
    /**
     * Load the DAOMap.
     *
     * @param code the code
     */
    @Override
    public void loadDAOMap(String code) {
        try {
            final DAOInteraction daoInteraction = new DAOInteraction(DBConnection.getInstance().getConnection());
            this.setDAOMap(daoInteraction.find(code));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
}





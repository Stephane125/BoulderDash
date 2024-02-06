package fr.exia.boulderdash.model.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * <h1>The DAOEntity Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public abstract class DAOEntity<E> {

    /**
     * The connection.
     */
    private final Connection connection;

    /**
     * Instantiates a new dao entity.
     *
     * @param connection the connection
     * @throws SQLException the SQL exception
     */
    public DAOEntity(final Connection connection) throws SQLException {
        this.connection = connection;
    }

    /**
     * Gets the connection.
     *
     * @return the connection
     */
    protected Connection getConnection() {
        return this.connection;
    }

    /**
     * Creates.
     *
     * @param entity the entity
     * @return true, if successful
     */
    public abstract boolean create(E entity);

    /**
     * Delete.
     *
     * @param entity the entity
     * @return true, if successful
     */
    public abstract boolean delete(E entity);

    /**
     * Update.
     *
     * @param entity the entity
     * @return true, if successful
     */
    public abstract boolean update(E entity);

    /**
     * Find.
     *
     * @param id the id
     * @return the e
     */
    public abstract E find(int id);

    /**
     * Find.
     *
     * @param code the code
     * @return the e
     */
    public abstract E find(String code);

}
package fr.exia.boulderdash.model.dao;

import fr.exia.boulderdash.entity.DAOMap;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <h1>The DAOInteraction Class.</h1>
 *
 * @author Stephane
 * @version 0.1
 */

public class DAOInteraction extends DAOEntity<DAOMap> {

    /**
     * Instantiates a new dao map.
     *
     * @param connection the connection
     * @throws SQLException the SQL exception
     */
    public DAOInteraction(final Connection connection) throws SQLException {
        super(connection);
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#create(model.Entity)
     */
    @Override
    public boolean create(final DAOMap entity) {
        // Not implemented
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#delete(model.Entity)
     */
    @Override
    public boolean delete(final DAOMap entity) {
        // Not implemented
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#update(model.Entity)
     */
    @Override
    public boolean update(final DAOMap entity) {
        // Not implemented
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#find(int)
     */
    @Override
    public DAOMap find(final int id) {
        DAOMap DAOMap = new DAOMap();
        try {
            final String sql = "{call mapById(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setInt(1, id);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (resultSet.first()) {
                DAOMap = new DAOMap(id, resultSet.getString("code"), resultSet.getString("layout"), resultSet.getInt("mapheight"), resultSet.getInt("mapwidth"), resultSet.getInt("objective"));
            }
            return DAOMap;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#find(java.lang.String)
     */
    @Override
    public DAOMap find(final String code) {
        DAOMap DAOMap = new DAOMap();

        try {
            final String sql = "{call mapByCode(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setString(1, code);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (resultSet.first()) {
                DAOMap = new DAOMap(resultSet.getInt("id"), code, resultSet.getString("layout"), resultSet.getInt("mapheight"), resultSet.getInt("mapwidth"), resultSet.getInt("objective"));
            }
            return DAOMap;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

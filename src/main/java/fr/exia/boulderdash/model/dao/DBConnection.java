package fr.exia.boulderdash.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

/**
 * @author Stephane
 * @version 0.1
 */
public final class DBConnection {

    private static DBConnection INSTANCE = null;
    private Connection connection;

    private DBConnection() {
        this.open();
    }

    /**
      *
     * @return the instance of DBConnection
     */
    public static synchronized DBConnection getInstance() {
        if (DBConnection.INSTANCE == null) {
            DBConnection.INSTANCE = new DBConnection();
        }
        return DBConnection.INSTANCE;
    }

    /**
     * Opens a connection to the database using the specified properties.
     * Also calls a stored procedure to set the database timezone to UTC.
     *
     * @return true if the connection is successfully opened, false otherwise
     */
    private Boolean open() {
        final DBProperties dbProperties = new DBProperties();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getLogin(), dbProperties.getPassword());

             try (CallableStatement statement = this.connection.prepareCall("{call set_timezone()}")) {
                statement.execute();
            }

        } catch (final ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Gets the database connection instance.
     *
     * @return the database connection instance
     */
    public Connection getConnection() {
        return this.connection;
    }
}

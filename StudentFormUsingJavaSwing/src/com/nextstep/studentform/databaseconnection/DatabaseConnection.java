package com.nextstep.studentform.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * DatabaseConnection class is responsible for establishing a connection to the
 * MySQL database. It uses JDBC to establish a connection and return a Connection object.
 */
public class DatabaseConnection {

    /**
     * Establishes a connection to the MySQL database using JDBC.
     * The method loads the MySQL JDBC driver and establishes the connection to the
     * database server, returning a Connection object to interact with the database.
     * 
     * @return A Connection object representing the connection to the database.
     * @throws Exception If an error occurs while loading the driver or connecting to the database.
     *                   Possible exceptions include ClassNotFoundException or SQLException.
     */
    public static Connection getConnection() throws Exception {
        // Load the MySQL JDBC driver to enable communication with the MySQL database
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish and return a connection to the MySQL database located at localhost
        // with the specified database name 'java_swing_studentform', username 'root', 
        // and no password (empty string).
        return DriverManager.getConnection("jdbc:mysql://localhost/java_swing_studentform", "root", "");
    }
}

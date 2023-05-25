package org.homework7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DataSource {
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
    }
}

package com.example.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionFactory {
    Connection createConnection() throws SQLException;
    String getConnectionURL();
    DatabaseConfiguration getConfig();
}

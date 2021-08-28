package com.trepudox.jdbc.teste1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection create() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db_jdbc_teste?serverTimezone=UTC";
        String user = "root";
        String password = "root";

        return DriverManager.getConnection(url, user, password);
    }

    private ConnectionFactory() {}

}

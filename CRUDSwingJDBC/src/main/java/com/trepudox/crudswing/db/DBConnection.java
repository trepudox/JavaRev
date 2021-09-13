package com.trepudox.crudswing.db;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DBConnection {

    public static final String URL = "jdbc:mysql://localhost:3306/db_crud_swing?serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}

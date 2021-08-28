package com.trepudox.jdbc.teste2;

import java.sql.*;

public class Teste2 {

    private static final String URL = "jdbc:mysql://localhost:3306/db_jdbc_teste?setTimezone=UTC";

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DriverManager.getConnection(URL, "root", "root")) {

            PreparedStatement stmt = connection.prepareStatement("SELECT id, nome FROM pessoa;");

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String nome = resultSet.getString("nome");

                System.out.printf("ID: %s Nome: %s%n", id, nome);
            }
        }
    }

}

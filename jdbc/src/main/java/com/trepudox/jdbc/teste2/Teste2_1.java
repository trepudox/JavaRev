package com.trepudox.jdbc.teste2;

import java.sql.*;

public class Teste2_1 {

    private static final String URL = "jdbc:mysql://localhost:3306/db_jdbc_teste?useTimezone=UTC";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, "root", "root")) {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO pessoa(nome, data_nasc, profissao_id) VALUES ('%s', '%s', 1);", "Marccooo", "2020-07-01");

            stmt.execute(sql);

        }
    }

}

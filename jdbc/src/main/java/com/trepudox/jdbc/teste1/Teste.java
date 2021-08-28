package com.trepudox.jdbc.teste1;

import com.trepudox.jdbc.teste1.ConnectionFactory;

import java.sql.*;

public class Teste {

    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/db_jdbc_teste?serverTimezone=UTC";
//        String user = "root";
//        String password = "root";

//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
        try (Connection connection = ConnectionFactory.create()) {
            PreparedStatement selectAllProfissao = connection.prepareStatement("SELECT * FROM Profissao");
            PreparedStatement selectProfissaoWhereId = connection.prepareStatement("SELECT * FROM Profissao WHERE id = ?");
            PreparedStatement selectAllPessoa = connection.prepareStatement("SELECT * FROM Pessoa");

            ResultSet rsProfissao = selectAllProfissao.executeQuery();
            while (rsProfissao.next()) {
                String id = rsProfissao.getString("id");
                String nome = rsProfissao.getString("nome");
                String salario = rsProfissao.getString("salario");

                System.out.println(id + ". " + nome + " - R$ " + salario);
            }

            System.out.println();

            ResultSet rsPessoa = selectAllPessoa.executeQuery();
            while (rsPessoa.next()) {
                String id = rsPessoa.getString("id");
                String nome = rsPessoa.getString("nome");
                String dataNasc = rsPessoa.getString("data_nasc");
                String idProfissao = rsPessoa.getString("profissao_id");

                selectProfissaoWhereId.setInt(1, Integer.parseInt(idProfissao));

                ResultSet resultSetProfissaoDaPessoa = selectProfissaoWhereId.executeQuery();
                resultSetProfissaoDaPessoa.next();

                String nomeProfissao = resultSetProfissaoDaPessoa.getString("nome");

                System.out.println(id + ". " + nome + " - " + dataNasc + " - " + nomeProfissao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}


package com.trepudox.crudswing.model.dao;

import com.trepudox.crudswing.db.DBConnection;
import com.trepudox.crudswing.model.Pessoa;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PessoaDAO {

    public static List<Pessoa> getAll() {
        List<Pessoa> pessoas = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM pessoa;")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa p = Pessoa.builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .sobrenome(rs.getString("sobrenome"))
                        .idade(rs.getInt("idade"))
                        .build();

                pessoas.add(p);
            }

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return pessoas;
    }

    public static Optional<Pessoa> getById(int id) {
        Pessoa pessoa = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM pessoa WHERE id = ?;")) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                pessoa = Pessoa.builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .sobrenome(rs.getString("sobrenome"))
                        .idade(rs.getInt("idade"))
                        .build();
            }

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return Optional.ofNullable(pessoa);
    }

    public static int insert(String nome, String sobrenome, int idade) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("INSERT INTO pessoa(nome, sobrenome, idade) VALUE (?, ?, ?);")) {

            stmt.setString(1, nome);
            stmt.setString(2, sobrenome);
            stmt.setInt(3, idade);

            return stmt.executeUpdate();
        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return 0;
    }

    public static int update(int id, String nome, String sobrenome, int idade) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("UPDATE pessoa SET nome = ?, sobrenome = ?, idade = ? WHERE id = ?")) {

            stmt.setString(1, nome);
            stmt.setString(2, sobrenome);
            stmt.setInt(3, idade);
            stmt.setInt(4, id);

            return stmt.executeUpdate();

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return 0;
    }

    public static int delete(int id) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("DELETE FROM pessoa WHERE id = ?")) {

            stmt.setInt(1, id);

            return stmt.executeUpdate();

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return 0;
    }

}

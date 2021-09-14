package com.trepudox.crudswing.model.dao;

import com.trepudox.crudswing.db.DBConnection;
import com.trepudox.crudswing.model.Pessoa;
import com.trepudox.crudswing.model.Profissao;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class ProfissaoDAO {

    public static List<Profissao> getAll() {
        List<Profissao> profissoes = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM profissao;")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Profissao p = Profissao.builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .salario(rs.getDouble("salario"))
                        .build();

                profissoes.add(p);
            }

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return profissoes;
    }

    public static Optional<Profissao> getById(int id) {
        Profissao profissao = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM profissao WHERE id = ?;")) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                profissao = Profissao.builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .salario(rs.getDouble("salario"))
                        .build();
            }

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return Optional.ofNullable(profissao);
    }

    public static int insert(String nome, double salario) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("INSERT INTO profissao(nome, salario) VALUE (?, ?);")) {

            stmt.setString(1, nome);
            stmt.setDouble(2, salario);

            return stmt.executeUpdate();
        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return 0;
    }

    public static int update(int id, String nome, double salario) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("UPDATE profissao SET nome = ?, salario = ? WHERE id = ?;")) {

            stmt.setString(1, nome);
            stmt.setDouble(2, salario);
            stmt.setInt(3, id);

            return stmt.executeUpdate();

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return 0;
    }

    public static int delete(int id) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement("DELETE FROM profissao WHERE id = ?;")) {

            stmt.setInt(1, id);

            return stmt.executeUpdate();

        } catch (SQLException e) {
            log.error("ERRO: " + e.getMessage());
        }

        return 0;
    }

}

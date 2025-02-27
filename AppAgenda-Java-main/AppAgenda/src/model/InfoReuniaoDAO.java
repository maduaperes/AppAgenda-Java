package model;

import controller.Lista;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ListaDAO {
    private final DAO dao = new DAO();

    public boolean inserirLista(Lista lista) {
        try {
            Connection conexao = dao.conectar();

            PreparedStatement newRow = conexao.prepareStatement("INSERT INTO lista (nome) " +
                    "VALUES (?);");

            newRow.setString(1, lista.getNome());

            int rowsAffected = newRow.executeUpdate();

            if (rowsAffected > 0) {

                conexao.close();
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean atualizarLista(Lista lista) {

        try {
            Connection conexao = dao.conectar();

            PreparedStatement updateRow = conexao.prepareStatement("UPDATE lista SET nome = ? WHERE id = ?;");

            updateRow.setString(1, lista.getNome());
            updateRow.setInt(2, lista.getId());

            int rowsAffected = updateRow.executeUpdate();
            conexao.close();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public final class SenhaDAO {

    Conexao conexao = new Conexao();
    
    // getters
    public String getSenhaDAO() {
        String senha = "";
        try (Statement stmt = conexao.getConexao().createStatement()) {
            ResultSet res = stmt.executeQuery("""
                                              SELECT senha FROM db_senha
                                              ORDER BY usuarioid DESC
                                              LIMIT 1;""");
            if (res.next()) {
                senha = res.getString("senha"); 
                return senha;
            } else {
                System.out.println("No data found");
            }
        } catch (SQLException ex) {
            return senha;
        }
        return senha;
    }
    public int getUarioidDAO() {
        int usuarioid;
        try (Statement stmt = conexao.getConexao().createStatement()) {
            ResultSet res = stmt.executeQuery("""
                                              SELECT usuarioid FROM db_senha
                                              ORDER BY usuarioid DESC
                                              LIMIT 1;""");
            if (res.next()) {
                usuarioid = res.getInt("usuarioid"); 
                return usuarioid;
            } else {
                System.out.println("No data found");
            }
        } catch (SQLException ex) {
            return -1;
        }
        return -1;
    }
    // ----------
    
    // sett
    public void setSenhaDAO(String senha) {
        String sql = "INSERT INTO db_senha(senha) VALUES(?)";
        try (PreparedStatement stmt = conexao.getConexao().prepareStatement(sql)) {
            stmt.setString(1, senha);
            stmt.execute();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public final class SenhaDAO {

    Conexao conexao = new Conexao();
    
    // Retorna a Lista de Amigos(objetos)
    public String getSenha() {
        String senha;
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
            return null;
        }
        return null;
    }
    
    // Adiciona Amigos(objetos)
    public void configSenha(String senha) {
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

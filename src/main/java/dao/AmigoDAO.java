
package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Amigo;


public class AmigoDAO {
    
    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    public void setNomeDAO(int amigoid, String novoNome){  
    String sql = """
                 UPDATE db_amigos
                 SET nome = (?)
                 WHERE amigoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, amigoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setTelefoneDAO(int amigoid, String novoTelefone){
      String sql = """
                 UPDATE db_amigos
                 SET telefone = (?)
                 WHERE amigoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoTelefone);
            stmt.setInt(2, amigoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getMinhaListaAmigoDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");
                Amigo objeto = new Amigo(nome, telefone);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Amigos(objetos)
    public void addAmigoDAO(String nome, String telefone) {
        String sql = "INSERT INTO db_amigos(nome,telefone) VALUES(?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Deleta Amigos(objetos)
    public void delAmigoDAO(String nome, String telefone) {
        String sql = "DELETE FROM db_amigos WHERE nome = (?) AND telefone = (?);";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public int editarAmigoDAO(String editar) {
        String sql = "SELECT COUNT(*) AS total FROM db_amigos WHERE nome = ? OR telefone = ?";
        int amigoid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, editar);
            stmt.setString(2, editar);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalAmigos = res.getInt("total");
                    if (totalAmigos > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT amigoid FROM db_amigos WHERE nome = ? OR telefone = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, editar);
                            stmt2.setString(2, editar);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                amigoid = res2.getInt("amigoid");
                            }
                        }
                    } else {
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return 9999999;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar amigo: " + e.getMessage());
        }

        return amigoid;
    }
}

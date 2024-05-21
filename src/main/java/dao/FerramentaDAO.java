
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ferramenta;


public class FerramentaDAO {
    

    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    public void setNomeDAO(int ferramentaid, String novoNome){  
    String sql = """
                 UPDATE db_ferramentas
                 SET nome = (?)
                 WHERE ferramentaid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setMarcaDAO(int ferramentaid, String novaMarca){
      String sql = """
                 UPDATE db_ferramentas
                 SET marca = (?)
                 WHERE ferramentaid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaMarca);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
        public void setCustoDAO(int ferramentaid, double novoCusto){
      String sql = """
                 UPDATE db_ferramentas
                 SET custo = (?)
                 WHERE ferramentaid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setDouble(1, novoCusto);
            stmt.setInt(2, ferramentaid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getFerramentaDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custo = res.getDouble("custo");
                Ferramenta objeto = new Ferramenta(nome, marca, custo);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Ferramentas(objetos)
    public void addFerramentaDAO(String nome, String marca, double custo) {
        String sql = "INSERT INTO db_ferramentas(nome,marca,custo) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.setDouble(3, custo);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Deleta Ferramentas(objetos)
    public void delFerramentaDAO(String nome, String marca) {
        String sql = "DELETE FROM db_ferramentas WHERE nome = (?) AND marca = (?);";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public int editarFerramentaDAO(String nomeEditar, String marcaEditar) {
        String sql = "SELECT COUNT(*) AS total FROM db_ferramentas WHERE nome = ? AND marca = ?";
        int ferramentaid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, nomeEditar);
            stmt.setString(2, marcaEditar);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT ferramentaid FROM db_ferramentas WHERE nome = ? AND marca = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, nomeEditar);
                            stmt2.setString(2, marcaEditar);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                ferramentaid = res2.getInt("ferramentaid");
                            }
                        }
                    } else {
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar ferramenta: " + e.getMessage());
        }
        return ferramentaid;
    }
}
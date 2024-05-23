
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Emprestimo;


public class EmprestimoDAO {
    

    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    SenhaDAO senha = new SenhaDAO();
    
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
    
    public String getDataDevolucaoDAO(int emprestimoid) {
        String sql = """
                 SELECT data_emprestimo FROM db_ferramentas 
                 WHERE emprestimoid = (?)""";
        String dataDevolucao = null;

        try {
            // Supondo que `conexao` é uma instância de uma classe que retorna a conexão com o banco de dados
            Connection connection = conexao.getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, emprestimoid); // Definindo o parâmetro da consulta
            ResultSet rs = stmt.executeQuery(); // Executando a consulta e obtendo o resultado

            if (rs.next()) {
                dataDevolucao = rs.getString("data_emprestimo"); // Obtendo a data da consulta
            }

            rs.close(); // Fechando o ResultSet
            stmt.close(); // Fechando o PreparedStatement
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }

        return dataDevolucao;
    }
    
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getDataDevolucaoDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_emprestimos");
            while (res.next()) {
                int amigoid = res.getInt("amigoid");
                int ferramentaid = res.getInt("ferramentaid");
                String dataEmprestimo = res.getString("data_emprestimo");
                String dataDevolucao = res.getString("data_devolucao");
                Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, amigoid, ferramentaid);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Ferramentas(objetos)
    public void addEmprestimoDAO(int amigoid, int ferramentaid, String data_emprestimo) {
        String sql = """
                    INSERT INTO db_emprestimos
                    (amigoid, ferramentaid, usuarioid, data_emprestimo, data_devolucao) 
                    VALUES(?,?,?,?,?)
                    """;
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, amigoid);
            stmt.setInt(2, ferramentaid);
            stmt.setInt(3, senha.getUarioidDAO());
            stmt.setString(4, data_emprestimo);
            stmt.setString(5, "");
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
    
    public int editarEmprestimoDAO(int amigoid, int ferramentaid) {
        String sql = "SELECT COUNT(*) AS total FROM db_emprestimos WHERE amigoid = ? AND ferramentaid = ?";
        int emprestimoid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setInt(1, amigoid);
            stmt.setInt(2, ferramentaid);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalEmprestimos = res.getInt("total");
                    if (totalEmprestimos > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT emprestimoid FROM db_emprestimos WHERE amigoid = ? AND ferramentaid = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setInt(1, amigoid);
                            stmt2.setInt(2, ferramentaid);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                emprestimoid = res2.getInt("emprestimoid");
                            }
                        }
                    } else {
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar emprestimo: " + e.getMessage());
        }
        return emprestimoid;
    }
}

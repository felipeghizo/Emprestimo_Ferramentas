
package dao;

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
    
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getFerramentas() {
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
    
    // Adiciona Amigos(objetos)
    public void addFerramenta(String nome, String marca, double custo) {
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
}
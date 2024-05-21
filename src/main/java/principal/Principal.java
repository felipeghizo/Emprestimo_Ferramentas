
package principal;


import visualização.visualizacaoPrimeiro_Acesso;
import visualização.visualizacaoLogin;
import dao.Conexao;
import dao.SenhaDAO;


public class Principal {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        conexao.getConexao();
        
        SenhaDAO senha = new SenhaDAO();
        System.out.println("----------------------"+senha.getSenha());
        if (senha.getSenha() == null){
            visualizacaoPrimeiro_Acesso primeiro_acesso = new visualizacaoPrimeiro_Acesso();
            primeiro_acesso.setVisible(true);
        }
        else{
            visualizacaoLogin login = new visualizacaoLogin();
            login.setVisible(true);
        }
    }
}

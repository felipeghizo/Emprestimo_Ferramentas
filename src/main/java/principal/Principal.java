
package principal;


import visualização.visualizacaoPrimeiro_Acesso;
import visualização.visualizacaoLogin;
import dao.Conexao;
import modelo.Senha;


public class Principal {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        conexao.getConexao();
        
        Senha senha = new Senha();
        if (senha.getSenha().compareTo("") == 0){
            visualizacaoPrimeiro_Acesso primeiro_acesso = new visualizacaoPrimeiro_Acesso();
            primeiro_acesso.setVisible(true);
        }
        else{
            visualizacaoLogin login = new visualizacaoLogin();
            login.setVisible(true);
        }
    }
}

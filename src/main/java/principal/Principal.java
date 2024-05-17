
package principal;


import view.Primeiro_Acesso;
import view.Login;
import dao.Conexao;
import dao.SenhaDAO;


public class Principal {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        conexao.getConexao();
        
        SenhaDAO senha = new SenhaDAO();
        System.out.println("----------------------"+senha.getSenha());
        if (senha.getSenha() == null){
            Primeiro_Acesso primeiro_acesso = new Primeiro_Acesso();
            primeiro_acesso.setVisible(true);
        }
        else{
            Login login = new Login();
            login.setVisible(true);
        }
    }
}

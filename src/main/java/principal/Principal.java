package principal;

import view.Primeiro_Acesso;
import view.Login;
import javax.swing.JOptionPane;
import DAO.Conexao;


public class Principal {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        conexao.getConexao();
        String loginCheck = "banco de dados";
        if (loginCheck.compareTo("abc") != 0){
            Primeiro_Acesso primeiro_acesso = new Primeiro_Acesso();
            primeiro_acesso.setVisible(true);
        }
        else{
            Login login = new Login();
            login.setVisible(true);
        }
    }
}

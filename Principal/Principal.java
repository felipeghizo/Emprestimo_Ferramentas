package Principal;

import View.Primeiro_Acesso;
import View.Login;

public class Principal {

    public static void main(String[] args) {
        String loginCheck = "banco de dados";
        if (loginCheck.compareTo("asdasdasd") == 1){
            Primeiro_Acesso primeiro_acesso = new Primeiro_Acesso();
            primeiro_acesso.setVisible(true);
        }
        else{
            Login login = new Login();
            login.setVisible(true);
        }
    }
}

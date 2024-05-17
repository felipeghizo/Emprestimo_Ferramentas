package model;
import view.Primeiro_Acesso; 
import dao.SenhaDAO;


public class MainLogin {
    
    private String password;
    private Primeiro_Acesso acesso;
    
    public MainLogin(){
        this("admin123");
    }
    
    public MainLogin(String password){
    this.setPassword(password);
    }
    
    // get
    public String getPassword(){
        return this.password;
    }
    
    // set
    public void setPassword(String password){
        this.password = password;
    }
    
    public boolean Password(String password, String PasswordConfirmation){
        if(password.compareTo(PasswordConfirmation) == 0){
            this.setPassword(password);
            System.out.println("foi");
            return true;
        }else{
            System.out.println("nao foi");
            return false;

        }
    }
    
    public boolean checkPassword(String senha){
        SenhaDAO senhaCoparacao = new SenhaDAO();
        return senhaCoparacao.getSenha().compareTo(senha) == 0;
    }
}

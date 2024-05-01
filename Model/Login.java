package Model;
import View.Primeiro_Acesso; 

public class Login {
    
    private String password;
    private Primeiro_Acesso acesso;
    
    public Login(){
        this("admin123");
    }
    
    public Login(String password){
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
    
    public void Password(String password, String PasswordConfirmation){
        if(password.compareTo(PasswordConfirmation) == 0){
            this.setPassword(password);
        }else{
            acesso.MostraMensagemErro();
        }
    }
}

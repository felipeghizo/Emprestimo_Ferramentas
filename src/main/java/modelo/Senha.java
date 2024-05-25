package modelo;

import dao.SenhaDAO;


public class Senha {
    
    private String senha;
    private SenhaDAO senhaDAO = new SenhaDAO();
    
    public Senha(){
        this("");
    }
    
    public Senha(String senha){
    this.senha = senha;
    }
    
    // get
    public String getSenha(){
        return senhaDAO.getSenhaDAO();
    }
    // ----------
    
    // set
    public void setSenha(String senha){
        this.senha = senha;
        senhaDAO.setSenhaDAO(senha);
    }
    // ----------
    
    // Confirma que as senhas para configurar são iguais
    public boolean Password(String senha, String confirmacaoSenha){
        if(senha.compareTo(confirmacaoSenha) == 0){
            this.setSenha(senha);
            return true;
        }else{
            return false;
        }
    }
    
    // Confirma que a senha está correta
    public boolean checkPassword(String senha){
        SenhaDAO senhaComparacao = new SenhaDAO();
        return senhaComparacao.getSenhaDAO().compareTo(senha) == 0;
    }
}

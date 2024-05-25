package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo{

    // Atributos
    private String Nome;
    private String Telefone;
    private AmigoDAO amigo = new AmigoDAO();

    // Construtor Default
    public Amigo(){
        this("", "");
    }
    // Construtor 
    public Amigo(String Nome, String Telefone){
        this.Nome = Nome;
        this.Telefone = Telefone;
    }

    // Getters 
    public String getNome(){
        return amigo.getNomeDAO(this.getAmigoid(this.Nome, this.Telefone));
    }
    public String getTelefone(){
        return this.Telefone;
    }
    
    public int getAmigoid(String nome, String telefone){
        return amigo.getAmigoidDAO(nome, telefone);
    }
    // ----------

    // Setters
    public void setNome(String nome) {
        String auxNome = this.Nome;
        this.Nome = nome;
        amigo.setNomeDAO(this.getAmigoid(auxNome, this.Telefone), nome);
    }
    
    public void setTelefone(String telefone){
        String auxTelefone = this.Telefone;
        this.Telefone = telefone;
        amigo.setTelefoneDAO(this.getAmigoid(this.Nome, auxTelefone), telefone);
    }
    // ----------
    
    // Adiciona o amigo ao banco de dados
    public void addAmigo(){
        amigo.addAmigoDAO(this.Nome, this.Telefone);
    }
    
    // Deleta o amigo do banco de dados
    public void delAmigo(){
        amigo.delAmigoDAO(this.Nome, this.Telefone);
    }
    
    // Retorna todos os amigos cadastrados
    public ArrayList getMinhaListaAmigo(){
        return amigo.getMinhaListaAmigoDAO();
    }
}
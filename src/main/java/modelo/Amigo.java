
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
        return this.Nome;
    }
    public String getTelefone(){
        return this.Telefone;
    }

    // Setters
    public void setNome(int amigoid, String nome){
        this.Nome = nome;
        amigo.setNomeDAO(amigoid, nome);
    }
    public void setTelefone(int amigoid, String telefone){
        this.Telefone = telefone;
        amigo.setTelefoneDAO(amigoid, telefone);
    }

    public void addAmigo(String addAmigo, String foneAmigo){
        amigo.addAmigoDAO(addAmigo, foneAmigo);
    }
    
    public void delAmigo(String addAmigo, String foneAmigo){
        amigo.delAmigoDAO(addAmigo, foneAmigo);
    }
        
    public int editarAmigo(String editar){
        return amigo.editarAmigoDAO(editar);
    }
    
    public ArrayList getMinhaListaAmigo(){
        return amigo.getMinhaListaAmigoDAO();
    }
}

package modelo;

public class Amigo{

    // Atributos
    private String Nome;
    private String Telefone;

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
    private void setNome(String nome){
        this.Nome = nome;
    }
    private void setTelefone(String telefone){
        this.Telefone = telefone;
    }

    // Metodos a serem implementados
}
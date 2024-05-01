package Model;

public class Amigo{

    // Atributos
    private String Nome;
    private String Telefone;

    // Construtor Default
    public Amigo(){
        this("", "");
    }
    // Construtor passando parametros
    public Amigo(String Nome, String Telefone){
        this.Nome = Nome;
        this.Telefone = Telefone;
    }

    // Geters 
    public String getNome(){
        return this.Nome;
    }
    public String getTelefone(){
        return this.Telefone;
    }

    // Seters
    private void setNome(String nome){
        this.Nome = nome;
    }
    private void setTelefone(String telefone){
        this.Telefone = telefone;
    }
}
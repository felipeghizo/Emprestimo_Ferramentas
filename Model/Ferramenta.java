package Model;

public class Ferramenta{

    // Atributos
    public String Nome;
    public String Marca;
    public Double Custo;

    // Construtor Default
    public Ferramenta(){
        this("", "", 0.0);
    }
    // Construtor 
    public Ferramenta(String Nome, String Marca, Double Custo){
        this.Nome = Nome;
        this.Marca = Marca;
        this.Custo = Custo;
    }

    // Getters 
    public String getNome(){
        return this.Nome;
    }
    public String getMarca(){
        return this.Marca;
    }
    public Double getCusto(){
        return this.Custo;
    }

    // Setters
    private void setNome(String nome){
        this.Nome = nome;
    }
    private void setMarca(String marca){
        this.Marca = marca;
    }
    private void setCusto(Double custo){
        this.Custo = custo;
    }

    // Metodos a serem implementados
}
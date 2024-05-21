
package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta{

    // Atributos
    private String Nome;
    private String Marca;
    private Double Custo;
    private FerramentaDAO ferramenta = new FerramentaDAO();
        
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
    public void setNome(int ferramentaid, String nome){
        this.Nome = nome;
        if (ferramentaid != -1){ferramenta.setNomeDAO(ferramentaid, nome);}
    }
    public void setMarca(int ferramentaid, String marca){
        this.Marca = marca;
        if (ferramentaid != -1){ferramenta.setMarcaDAO(ferramentaid, marca);}
    }
    public void setCusto(int ferramentaid, Double custo){
        this.Custo = custo;
        if (ferramentaid != -1){ferramenta.setCustoDAO(ferramentaid, custo);}
    }
    
    public void addFerramenta(String nome, String marca, double custo){
        ferramenta.addFerramentaDAO(nome, marca, custo);
    }
    
    public void delFerramenta(String nome, String marca){
        ferramenta.delFerramentaDAO(nome, marca);
    }
        
    public int editarFerramenta(String nomeEditar, String marcaEditar){
        return ferramenta.editarFerramentaDAO(nomeEditar, marcaEditar);
    }
    
    public ArrayList getMinhaListaFerramenta(){
        return ferramenta.getFerramentaDAO();
    }
    
}
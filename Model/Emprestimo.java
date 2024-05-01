package Model;

public class Emprestimo {
    // Declaração e encapsulamento de atributos:
    private String DataDevolucao;
    private String DataEmprestimo;
    private Amigo amigo;
    private Ferramenta ferramenta;
    
    // Construtor Default:
    public Emprestimo() {
        this.DataDevolucao = "";
        this.DataEmprestimo = "";
        this.amigo = new Amigo();
        this.ferramenta = new Ferramenta();
    }
    
    // Construtor passando parâmetros:
    public Emprestimo(String DataDevolucao, String DataEmprestimo, Amigo amigo, Ferramenta ferramenta) {
        this.DataDevolucao = DataDevolucao;
        this.DataEmprestimo = DataEmprestimo;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
    }

    // Geters:
    public String getDataDevolucao() {
        return DataDevolucao;
    }
    public String getDataEmprestimo() {
        return DataEmprestimo;
    }
    public Amigo getAmigo(){
        return this.amigo;
    }
    public Ferramenta getFerramenta(){
        return this.ferramenta;
    }

    // seters:
    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }
    public void setDataEmprestimo(String DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }
    public void setAmigo(Amigo amigo){
        this.amigo = amigo;
    }
    public void setFerramenta(Ferramenta ferramenta){
        this.ferramenta = ferramenta;
    }
    
    // Função para criar novo emprestimo:
    public void novoEmprestimo(Amigo amigo, Ferramenta ferramenta){
        System.out.println(amigo.getNome() + " recebe " + ferramenta.getNome());
    }
    
    // Função para checar emprestimos ativos:
    public String getEmprestimosAtivos(){
        return "Lista de emprestimos ativos";
    }
    
    // Função para descobrir quem é o amigo com mais emprestimos:
    public Amigo getAmigoMaisEmprestimos(){
        
         return amigo;
    }
    
    // Função que retorna uma lista com todos os emprestimos:
    public String getTodosEmprestimos(){
         return "";
    }

    // Função para informar se algum amigo possui uma ferramenta 
    // que passou do prazo de devolução:
    public Boolean getAmigoDevedor(Amigo amigo){
         return true;
    }
    
    // Função para retornar o relatório de ferramentas:
    public String relatorioFerramentas(){
        return "a";
    }
    
    // Função que calcula e retorna o relatório de custo total:
    public double relatorioCustoTotal(){
        return 0.0;
    }
}

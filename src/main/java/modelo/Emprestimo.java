
package modelo;

import dao.AmigoDAO;
import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import dao.SenhaDAO;

public class Emprestimo {
    private String DataDevolucao;
    private String DataEmprestimo;
    private int Amigoid;
    private int Ferramentaid;
    
    AmigoDAO amigo = new AmigoDAO();
    FerramentaDAO ferramenta = new FerramentaDAO();
    EmprestimoDAO emprestimo = new EmprestimoDAO();
    SenhaDAO senha = new SenhaDAO();

    public Emprestimo() {
        this("","",0,0);
    }

    public Emprestimo(String DataDevolucao, String DataEmprestimo, int Amigoid, int Ferramentaid) {
        this.DataDevolucao = DataDevolucao;
        this.DataEmprestimo = DataEmprestimo;
        this.Amigoid = Amigoid;
        this.Ferramentaid = Ferramentaid;
    }

    public String getDataDevolucao(int amigoid, int ferramentaid) {
        int emprestimoid = emprestimo.editarEmprestimoDAO(amigoid, ferramentaid);
        this.DataDevolucao = emprestimo.getDataDevolucaoDAO(emprestimoid);
        return this.DataDevolucao;
    }

    public String getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

    public void setDataEmprestimo(String DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }
    
    public void addEmprestimo(int amigoid, int ferramentaid, String data_emprestimo){
        emprestimo.addEmprestimoDAO(amigoid, ferramentaid, data_emprestimo);
    }
    
    public int getUsuarioid(){
        return senha.getUarioidDAO();
    }
    
}

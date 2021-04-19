package classesMetodosAbstratos.tarefa2.modules.entities;

public abstract class Conta {

    public String nome;
    public Double rendaAnual;

    public Conta() {
    }

    public Conta(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    protected void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract void calcularImposto();
}

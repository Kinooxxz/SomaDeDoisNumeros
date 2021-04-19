package classesMetodosAbstratos.tarefa2.modules.entities;

public class ContaJuridica extends Conta{

    private Integer numeroDeFuncionarios;

    public ContaJuridica() {
    }

    public ContaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    private void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public void calcularImposto() {
        if(this.numeroDeFuncionarios > 10 ){
            setRendaAnual(getRendaAnual()*(14/100f));
            System.out.println("Bem vindo: "+this.getNome()+"! | CONTA JURÍDICA | imposto + 10 funcionarios:  "+String.format("%.2f",getRendaAnual()) );
        } else{
            setRendaAnual(getRendaAnual()*(16/100f));
            System.out.println("Bem vindo: "+this.getNome()+"! | CONTA JURÍDICA | imposto normal: "+String.format("%.2f",getRendaAnual()) );
        }
    }
}

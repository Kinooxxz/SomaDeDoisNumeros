package classesMetodosAbstratos.tarefa2.modules.entities;

public class ContaFisica extends Conta{
    private Double gastosComSaude;

    public ContaFisica() {
    }

    public ContaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    private void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public final void calcularImposto() {
        if(this.getRendaAnual() < 20000){
            setRendaAnual(getRendaAnual()*15/100);
            System.out.println(getRendaAnual());
            System.out.println("Bem vindo: "+this.getNome()+"! tipo: CONTA FÍSICA | imposto: "+ String.format("%.2f",getRendaAnual()));

        } else if(this.getRendaAnual() >= 20000 && this.getGastosComSaude() > 0){
            setRendaAnual((getRendaAnual()*(25/100f)) - (getGastosComSaude()*(50/100f)));

            System.out.println("Bem vindo: "+this.getNome()+"! tipo: CONTA FÍSICA | imposto + gastos com saúde: "+String.format("%.2f",getRendaAnual()));
        } else{
            setRendaAnual(getRendaAnual()*(25/100f));
            System.out.println("Bem vindo: "+this.getNome()+"! tipo: CONTA FÍSICA | imposto: "+ String.format("%.2f",getRendaAnual()));
        }
    }
}

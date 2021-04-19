package tratamentoExcecoes.tarefa2.model.entities;

import tratamentoExcecoes.tarefa2.model.exception.ContaException;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    protected void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    protected void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    @Override
    public String toString(){
        return "titular: " + getTitular() + ", saldo: " + getSaldo();
    }


    public Double depositar(double valor){
        return getSaldo() + valor;
    }

    public Double sacar(double valor) throws ContaException{
        if(valor > getLimiteSaque()){
            throw new ContaException("Você não pode sacar um valor maior que o seu limite!");
        } else if (getSaldo() == 0){
            throw new ContaException("Saldo insuficiente.");
        }
            return this.saldo - valor;
    }
}

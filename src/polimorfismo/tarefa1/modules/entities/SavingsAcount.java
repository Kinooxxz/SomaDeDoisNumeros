package polimorfismo.tarefa1.modules.entities;

public final class SavingsAcount extends Account {
    private Double interestRate;

    public SavingsAcount(){
        super();
    }

    public SavingsAcount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }


    // O metodo que estiver com final, não precisa ser lido profundamente!
    @Override
    public final void withDraw(double amount){
        balance -= amount;
    }

}

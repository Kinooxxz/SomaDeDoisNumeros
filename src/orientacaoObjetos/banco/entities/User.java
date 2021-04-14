package orientacaoObjetos.banco.entities;

public class User {
    private int numeroConta;
    private String nome;
    private double balanco;

    ////////////////////////////////

    public User(int numeroConta, String nome, double balanco) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.balanco = balanco;
    }

    public User(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public User(){

    }


    //////////////////////////////

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBalanco() {
        return balanco;
    }

    private void setBalanco(double balanco){this.balanco = balanco;}

    ////////////////////////////////////////////


    public static final double TAXA = 5;

    public void depositarValor(double deposito){
        System.out.println("Dados da conta: ");
        this.setBalanco(getBalanco()+deposito);
        System.out.println("Conta : "+getNumeroConta()+" | Dono : "+getNome()+" | Balanço : "+ this.getBalanco());
    }

    public void sacarValor(double saque){

        if(this.getBalanco() >= saque + TAXA){
            System.out.println("saque realizado com sucesso!");
            System.out.println("Dados da conta: ");
            this.setBalanco(getBalanco()-saque-TAXA);
            System.out.println("Conta : "+getNumeroConta()+" | Dono : "+getNome()+" | Balanço : "+ this.getBalanco());
        } else{
            System.out.println("não foi possivel realizar o saque");
        }




    }


}

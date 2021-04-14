package Estruturas_condicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        double preco = 34.5d;
        double desconto = (preco < 20.0) ? preco*0.1 : preco*0.05;

        System.out.println(desconto);
    }
}

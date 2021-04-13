import java.util.Scanner;

public class SistemaDeVenda {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número
         de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor
        unitário de cada peça 2. C alcule e mostre o valor
        a ser pago!!
         */

        Scanner scanner = new Scanner(System.in);
        int numeroVezes;
        double valorProduto1 = 5d, valorProduto2 = 4d;

        System.out.println("digite o produto que você deseja comprar : ");
        System.out.println("[1] para camisa : $ 5.00");
        System.out.println("[2] para calça : $ 4.00");
        int escolha = scanner.nextInt();

        switch(escolha){

            case 1:

                System.out.println("digite o número de vezes que deseja comprar");
                numeroVezes = scanner.nextInt();
                double preco = numeroVezes * valorProduto1;

                System.out.println("preço a pagar : "+ preco);
                System.out.println("deseja continuar com a compra?");
                String escolhaSouN = scanner.next();

                if(escolhaSouN.equalsIgnoreCase("sim")){
                    System.out.println("compra efetuada com sucesso!");
                } else if(escolhaSouN.equalsIgnoreCase("nao")) {
                    System.out.println("compra cancelada");
                } else{
                    System.out.println("opção inválida, reiniciando compra...");
                }
                break;

            case 2:

                System.out.println("digite o número de vezes que deseja comprar");
                numeroVezes = scanner.nextInt();
                double preco2 = numeroVezes * valorProduto2;

                System.out.println("preço a pagar : "+ preco2);
                System.out.println("deseja continuar com a compra? Sim/Nao");
                String escolhaSouN2 = scanner.next();

                if(escolhaSouN2.equalsIgnoreCase("sim")){
                    System.out.println("compra efetuada com sucesso!");
                } else if(escolhaSouN2.equalsIgnoreCase("nao")) {
                    System.out.println("compra cancelada");
                } else{
                    System.out.println("opção inválida, reiniciando compra...");
                }
                break;

            default:
                System.out.println("não temos esse produto em estoque!");
                break;
        }






    }
}

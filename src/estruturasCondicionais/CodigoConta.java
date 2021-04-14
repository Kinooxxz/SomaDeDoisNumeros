package estruturasCondicionais;

import java.util.Scanner;

public class CodigoConta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha, vezes; double preco, total;

        System.out.println("===============================");
        System.out.println("CODIGO  ESPECIFICAÇÃO   PREÇO");
        System.out.println("===============================");
        System.out.println("1   Cachorro Quente     R$ 4.00");
        System.out.println("2   X - Salada          R$ 5.00");
        System.out.println("3   X - Bacon           R$ 6.00");
        System.out.println("4   Torrada Simples     R$ 2.00");
        System.out.println("5   Refrigerante        R$ 7.00");
        System.out.println("===============================");

        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                preco = 4d;
                System.out.print("quantas unidades? : ");
                vezes = scanner.nextInt();
                total = (preco * vezes);
                System.out.println("total : $ "+total);
                break;

            case 2:
                preco = 5d;
                System.out.print("quantas unidades? : ");
                vezes = scanner.nextInt();
                total = (preco * vezes);
                System.out.println("total : $ "+total);
                break;

            case 3:
                preco = 6d;
                System.out.print("quantas unidades? : ");
                vezes = scanner.nextInt();
                total = (preco * vezes);
                System.out.println("total : $ "+total);
                break;

            case 4:
                preco = 2d;
                System.out.print("quantas unidades? : ");
                vezes = scanner.nextInt();
                total = (preco * vezes);
                System.out.println("total : $ "+total);
                break;

            case 5:
                preco = 7d;
                System.out.print("quantas unidades? : ");
                vezes = scanner.nextInt();
                total = (preco * vezes);
                System.out.println("total : $ "+total);
                break;

            default:
                System.out.println("Não temos este produto em estoque");
                break;
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class DiferencaProdutos {
    public static void main(String[] args) {
       /*
        Fazer um programa para ler quatro valores inteiros
        A, B, C e D. A seguir, calcule e mostre a
         diferença do produto de A e B pelo produto de C e D
         segundo a fórmula: DIFERENCA = (A * B -  C * D).
        */

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        System.out.println("digite o valor de a: ");
        a = scanner.nextInt();
        System.out.println("digite o valor de b: ");
        b = scanner.nextInt();
        System.out.println("digite o valor de c: ");
        c = scanner.nextInt();
        System.out.println("digite o valor de d: ");
        d = scanner.nextInt();


        int diferenca = ((a * b) - (c * d));
        System.out.println("diferenca : "+diferenca);
        scanner.close();
    }
}

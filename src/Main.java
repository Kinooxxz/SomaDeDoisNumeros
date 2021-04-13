import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // ler dois valores inteiros,
        // mostrar na tela a soma explicativa desses numeros

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("digite o primeiro numero");
        a = scanner.nextInt();
        System.out.println("digite o segundo numero");
        b = scanner.nextInt();

        c = a + b;

        System.out.println("ENTRADA : "+a+" + "+b);
        System.out.println("SAIDA : "+c);

        scanner.close();





    }
}

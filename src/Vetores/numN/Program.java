package Vetores.numN;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a quantidade de vezes que quer repetir : ");

        int n = scanner.nextInt();
        double[] vector = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("digite o numero "+ i);
            vector[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++){
            soma += vector[i];
        }

        double media = soma / n;
        System.out.println(media);
        scanner.close();

    }
}

package Estruturas_repetitivas;

import java.util.Scanner;

public class CasoDeTesteMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o número de vezes que será testado : ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("digite o numero A : ");
            double a = scanner.nextDouble();
            System.out.print("digite o numero B : ");
            double b = scanner.nextDouble();
            System.out.print("digite o numero C : ");
            double c = scanner.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%n %.1f %n", media);
        }
        scanner.close();
    }
}

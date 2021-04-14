package Estruturas_repetitivas;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero para saber o fatorial : ");
        int n = scanner.nextInt(),fatorial = 1;
        for(int i = 1; i <= n; i++){
           fatorial *= i;
        }
        System.out.println(fatorial);
        scanner.close();
    }
}

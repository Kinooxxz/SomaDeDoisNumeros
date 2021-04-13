package Estruturas_condicionais;

import java.util.Scanner;

public class VerificadorMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int n1 = scanner.nextInt();

        System.out.println("digite outro numero");
        int n2 = scanner.nextInt();

        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("os numeros são multiplos");
        } else{
            System.out.println("os numeros não são multiplos");
        }

        scanner.close();

    }
}

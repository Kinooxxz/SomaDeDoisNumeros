package Estruturas_condicionais;

import java.util.Scanner;

public class VerificadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = scanner.nextInt();

        if(numero%2 == 0){
            System.out.println("o numero é par");
        } else{
            System.out.println("o numero é impar");
        }
    }
}

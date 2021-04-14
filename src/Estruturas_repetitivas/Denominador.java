package Estruturas_repetitivas;

import java.util.Scanner;

public class Denominador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a quantidade de vezes que você quer dividir : ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("digite o primeiro numero : ");
            double num1 = scanner.nextInt();
            System.out.print("digite o segundo numero : ");
            double num2 = scanner.nextInt();
            if(!(num2 == 0)){
                double divisao = (num1/num2);
                System.out.println(divisao);
            } else{
                System.out.println("divisão impossivel");
            }
        }
        scanner.close();
    }
}

package Estruturas_repetitivas;

import java.util.Scanner;

public class QuadradoValor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero : ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i+" ");
            System.out.print(Math.pow(i,2)+" ");
            System.out.printf(Math.pow(i,3)+"%n");
        }
        scanner.close();
    }
}

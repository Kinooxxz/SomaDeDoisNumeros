package Estruturas_repetitivas;

import java.util.Scanner;

public class NumerosImpares1X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite qualquer numero impar : ");
        int x = scanner.nextInt();

        for(int i = 0; i < x; i++){
            if(i%2 == 1){
                System.out.print(i+" ");
            }
        }

        scanner.close();
    }

}

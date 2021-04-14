package Estruturas_repetitivas;

import java.util.Scanner;

public class InteiroDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero : ");
        int num = scanner.nextInt(), total = 0;
        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }


}

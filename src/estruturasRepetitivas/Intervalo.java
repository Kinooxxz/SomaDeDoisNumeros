package estruturasRepetitivas;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite quantos números serão lidos : ");
        int x = scanner.nextInt();
        int totalIn = 0, totalOut = 0, number;

        for(int i = 0; i < x ; i++){
            System.out.println("digite o numero [" + (i+1) + "]");
            number = scanner.nextInt();

            if (number > 10 && number < 20){
                totalIn += 1;
            } else{ totalOut += 1; }
        }
        System.out.println(totalIn + " in");
        System.out.println(totalOut + " out");

        scanner.close();
    }
}

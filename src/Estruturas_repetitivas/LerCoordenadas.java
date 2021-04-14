package Estruturas_repetitivas;

import java.util.Scanner;

public class LerCoordenadas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a coordenada X : ");
        int x = scanner.nextInt();
        System.out.print("digite a coordenada Y : ");
        int y = scanner.nextInt();

        while(x != 0 && y != 0){

            if(x > 0 && y > 0){ System.out.printf("%nprimeiro%n%n"); }
            else if(x < 0 && y > 0){System.out.printf("%nsegundo%n%n"); }
            else if(x < 0 && y < 0){ System.out.printf("%nterceiro%n%n"); }
            else if(x > 0 && y < 0){ System.out.printf("%nquarto%n%n"); }

            System.out.print("digite a coordenada X : ");
            x = scanner.nextInt();
            System.out.print("digite a coordenada Y : ");
            y = scanner.nextInt();



        }
        scanner.close();
    }
}

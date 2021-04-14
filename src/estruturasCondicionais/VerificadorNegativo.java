package estruturasCondicionais;

import java.util.Scanner;

public class VerificadorNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = scanner.nextInt();

        if (numero < 0) { System.out.println("o número é negativo");}
        else{   System.out.println("o numero é positivo");}

        scanner.close();
    }
}

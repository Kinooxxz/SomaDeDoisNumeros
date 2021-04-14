package metodosEstaticos.dinheiro.utils;

import java.util.Scanner;

public class CurrencyConverter {

    public static final double dolar = 5.69;

    public static void sellMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("preço do dolar : "+ dolar);
        System.out.print("quantos dolars voce quer comprar? : ");
        double real = scanner.nextDouble();
        System.out.println("total em reais: R$ "+ real * dolar);
        scanner.close();
    }
}

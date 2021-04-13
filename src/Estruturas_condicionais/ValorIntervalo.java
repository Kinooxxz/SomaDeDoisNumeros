package Estruturas_condicionais;

import java.util.Scanner;

public class ValorIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorQualquer;
        System.out.println("digite um valor qualquer");
        valorQualquer = scanner.nextInt();

        if(valorQualquer >= 0 && valorQualquer <= 25){
            System.out.println("o numero está entre [0...25]");
        } else if(valorQualquer > 25 && valorQualquer <= 50){
            System.out.println("o numero está entre [25...50]");
        } else if(valorQualquer > 50 && valorQualquer <= 75){
            System.out.println("o numero está entre [50...75]");
        } else if(valorQualquer > 75 && valorQualquer <= 100){
            System.out.println("o numero está entre [75...100]");
        }

        scanner.close();
    }
}

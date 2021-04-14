package Estruturas_repetitivas;

import java.util.Scanner;

public class PreferenciaCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu combustivel preferido :");
        System.out.println("[1] Álcool");
        System.out.println("[2] Gasolina");
        System.out.println("[3] Díesel");

        int escolha = scanner.nextInt();

        while(escolha != 4){
            switch(escolha){
                case 1:
                    System.out.printf("%nvoce escolheu Álcool!%n%n");
                    break;
                case 2:
                    System.out.printf("%nVocê escolheu Gasolina!%n%n");
                    break;
                case 3:
                    System.out.printf("%nDíesel%n%n");
                    break;
                case 4:
                    System.out.printf("%nMuito Obrigado!%n%n");
                    break;
                default:
                    System.out.printf("%nOpção inválida.%n%n");
                    break;
            }
            System.out.println("Digite seu combustivel preferido :");
            System.out.println("[1] Álcool");
            System.out.println("[2] Gasolina");
            System.out.println("[3] Díesel");

            escolha = scanner.nextInt();
        }
        scanner.close();
    }
}

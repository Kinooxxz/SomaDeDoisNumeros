package Estruturas_condicionais;

import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o seu salário: ");
        double salario = scanner.nextDouble();

        if(salario >= 0 && salario <= 2000.00d){
            System.out.println("Isento");
        } else if(salario >= 2000.01d && salario <= 3000.00d){
            salario *= 0.08d;
            System.out.println("taxa aplicada: 8%");
            System.out.printf("valor : $ %.2f",salario);
        } else if(salario >= 3000.01d && salario <= 4500.00d){
            salario *= 0.18d;
            System.out.println("taxa aplicada: 18%");
            System.out.printf("valor : $ %.2f",salario);
        } else if(salario > 4500.00d){
            salario *= 0.28d;
            System.out.println("taxa aplicada: 28%");
            System.out.printf("valor : $ %.2f",salario);
        }
        scanner.close();
    }
}

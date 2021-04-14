package Vetores.PrecoNumero.application;

import Vetores.PrecoNumero.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite quantos produtos voce quer registrar");
        int n = scanner.nextInt();

        Product[] products = new Product[n];

        for(int i = 0; i < n ; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += products[i].getPrice();
        }

        double media = sum / n;
        System.out.println("media : " + media);
        scanner.close();
    }
}

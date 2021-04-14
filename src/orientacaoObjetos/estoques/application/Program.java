package orientacaoObjetos.estoques.application;

import orientacaoObjetos.estoques.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter product name : ");
        String name = scanner.nextLine();

        System.out.print("Enter product price : ");
        double price = scanner.nextDouble();


        Product product = new Product(name, price);


        System.out.println("product name : "+product.getName());
        System.out.println("product price : "+product.getPrice());
        System.out.println("total values in stock : "+product.totalValueInStock());
        System.out.println("");


        scanner.close();
    }
}

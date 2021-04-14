package orientacaoObjetos.estoques.application;

import orientacaoObjetos.estoques.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.print("Enter product name : ");
        product.name = scanner.nextLine();

        System.out.print("Enter product price : ");
        product.price = scanner.nextDouble();

        System.out.print("Enter product quantity : ");
        product.quantity = scanner.nextInt();

        System.out.println("product name : "+product.name);
        System.out.println("product price : "+product.price);
        System.out.println("total values in stock : "+product.totalValueInStock());


        scanner.close();
    }
}

package polimorfismo.tarefa3.application;

import polimorfismo.tarefa3.modules.entities.ImportedProduct;
import polimorfismo.tarefa3.modules.entities.Product;
import polimorfismo.tarefa3.modules.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();


        System.out.print("Enter the number of products : ");
        int numOfProducts = scanner.nextInt();

        for(int i = 1; i <= numOfProducts ; i++){
            scanner.nextLine();
            System.out.println("Product #"+ i + " data: ");
            System.out.print("Common, used or imported? (c/u/i)? ");
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("c")){
                System.out.print("Name: ");
                String productName = scanner.nextLine();
                System.out.print("Price: ");
                Double productPrice = scanner.nextDouble();

                products.add(new Product(productName,productPrice));

            } else if(answer.equalsIgnoreCase("u")){
                System.out.print("Name: ");
                String productName = scanner.nextLine();
                System.out.print("Price: ");
                Double productPrice = scanner.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = simpleDateFormat.parse(scanner.next());

                products.add(new UsedProduct(productName,productPrice,manufactureDate));

            } else if (answer.equalsIgnoreCase("i")){
                System.out.print("Name: ");
                String productName = scanner.nextLine();
                System.out.print("Price: ");
                Double productPrice = scanner.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();

                products.add(new ImportedProduct(productName,productPrice,customsFee));

            } else{
                System.out.println("incorrect value");
            }
        }

        for(Product product : products){
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}

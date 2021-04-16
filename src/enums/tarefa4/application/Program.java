package enums.tarefa4.application;


import enums.tarefa1.entities.enums.OrderStatus;
import enums.tarefa4.entities.entity.Client;
import enums.tarefa4.entities.entity.Order;
import enums.tarefa4.entities.entity.OrderItem;
import enums.tarefa4.entities.entity.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameClient = scanner.nextLine();
        System.out.print("Email: ");
        String emailClient = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY) : ");
        Date birthDate = dateFormat.parse(scanner.nextLine());

        Client client = new Client(nameClient,emailClient,birthDate);

        System.out.println("Enter order data:");
        System.out.print("STATUS: ");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.nextLine()); // não sei se vou lembrar disso, isso tem que ficar na minha cabeça de algum jeito

        Order order = new Order(new Date(),orderStatus,client);

        System.out.print("How many items to this order? ");
        int itemsToThisOrder = scanner.nextInt();
        for(int i = 1; i <= itemsToThisOrder; i++){
            scanner.nextLine();
            System.out.println("Enter #"+ i + " item data:");

            //toda vez que eu iniciar uma entrada de dados
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            //preciso iniciar uma instancia pra guardar esses dados
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            //instancia geral de quantidade, preco do produto, e produto
            OrderItem orderItem = new OrderItem(quantity,productPrice,product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMARY");
        System.out.println(order);

        scanner.close();
    }

}

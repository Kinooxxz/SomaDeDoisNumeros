package estruturasCondicionais;

import java.util.Scanner;

public class CoordenadasPlano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        System.out.println("digite o número x : ");
        x = scanner.nextInt();
        System.out.println("digite o número y :");
        y = scanner.nextInt();

        if(x == 0 && y == 0){
            System.out.println("o ponto está na origem");
        } else if( x > 0 && y > 0 ){
            System.out.println("Q1");
        } else if(x > 0 && y < 0){
            System.out.println("Q2");
        } else if(x < 0 && y < 0){
            System.out.println("Q3");
        } else if(x < 0 && y > 0){
            System.out.println("Q4");
        } else{
            System.out.println("nenhuma das coordenadas é correspondente");
        }



        scanner.close();
    }
}

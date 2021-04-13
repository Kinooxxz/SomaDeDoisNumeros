import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
            //ler o valor do raio de um circulo
            //mostrar o valor do circulo com 4 casas decimais

            Scanner scanner = new Scanner(System.in);
            double pi = 3.14159d;
            double raio;


            System.out.print("digite o valor do raio :");
            raio = scanner.nextDouble();

            double raio2 = Math.pow(raio,2);
            double areaCirculo = pi * raio2;

            System.out.println("AREA DO CÍRCULO : "+ areaCirculo);

    }

}

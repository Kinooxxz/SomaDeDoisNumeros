import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante
         de dupla precisão: A, B e C. Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor A");
        float a = scanner.nextFloat();
        System.out.println("digite o valor B");
        float b = scanner.nextFloat();
        System.out.println("digite o valor C");
        float c = scanner.nextFloat();

        //area do triangulo

        float trianguloRetangulo = (a*c) / 2f;
        System.out.println("Area do Triangulo Retangulo : "+trianguloRetangulo);

        // area do circulo de raio

        float pi = 3.14159f;
        float areaCirculo = (pi*c*c);
        System.out.println("Area do Circulo : "+areaCirculo);

        // area do trapezio

        float areaTrapezio = (a+b)/2*c;
        System.out.println("Area do Trapezio : "+areaTrapezio);

        // area do quadrado que tem lado B
        // isso aqui deve estar muito errado mas ok
        float areaQuadrado = b*b;
        System.out.println("Area do quadrado : "+areaQuadrado);

        // areas do retangulo que tem A e B

        float areaRetangulo = (a*b);
        System.out.println("Area do retangulo : "+areaRetangulo);
        scanner.close();
    }
}

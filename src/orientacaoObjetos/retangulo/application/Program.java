package orientacaoObjetos.retangulo.application;

import orientacaoObjetos.retangulo.entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("type the width of retangle");
        double r1 = scanner.nextDouble();
        System.out.println("type the height of retangle");
        double r2 = scanner.nextDouble();

        double area = retangulo.area(r1,r2);
        double diagonal = retangulo.diagonal(r1,r2);
        double perimeter = retangulo.perimeter(r1,r2);
        retangulo.showResults(area, perimeter, diagonal);


        scanner.close();

    }
}

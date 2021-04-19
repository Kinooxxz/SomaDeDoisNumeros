package classesMetodosAbstratos.tarefa1.application;

import classesMetodosAbstratos.tarefa1.modules.entities.Circle;
import classesMetodosAbstratos.tarefa1.modules.entities.Rectangle;
import classesMetodosAbstratos.tarefa1.modules.entities.Shape;
import classesMetodosAbstratos.tarefa1.modules.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numOfShapes = scanner.nextInt();

        for(int i = 1; i <= numOfShapes; i++){
            scanner.nextLine();
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c) ? ");
            String rectangleOrCircle = scanner.nextLine();

            if(rectangleOrCircle.equalsIgnoreCase("r")){
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(scanner.next());
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();

                shapes.add(new Rectangle(color,width,height));

            } else if(rectangleOrCircle.equalsIgnoreCase("c")){

                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(scanner.next());
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();

                shapes.add(new Circle(color,radius));
            }
        }
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : shapes){
            System.out.println(String.format("%.2f",shape.area()));
        }

        scanner.close();
    }
}

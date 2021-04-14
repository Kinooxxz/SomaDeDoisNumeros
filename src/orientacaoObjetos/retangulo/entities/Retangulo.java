package orientacaoObjetos.retangulo.entities;

public class Retangulo {
    public double width;
    public double height;

    public double area(double width, double height){
        return width*height;
    }

    public double perimeter(double width, double height){
        return ((width+height)*2);
    }

    public double diagonal(double width, double height){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }

    public void showResults(double area, double perimeter, double diagonal){
        System.out.println("AREA = "+area);
        System.out.println("PERIMETER = "+perimeter);
        System.out.println("DIAGONAL = "+diagonal);
    }

}

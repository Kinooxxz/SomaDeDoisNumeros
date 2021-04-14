package orientacaoObjetos.funcionario.entities;

import java.util.Scanner;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;



    public void increaseSalary(double percentage){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which percentage to increase salary? : ");
        percentage = scanner.nextDouble();

        double salaryIncremented = grossSalary * percentage/100;
        double salaryTotal = salaryIncremented + grossSalary;

        System.out.println("Updated data : " + name + ", $ "+salaryTotal);
    }


    public void setDatas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("type the name of funcionary : ");
        name = scanner.nextLine();
        System.out.print("type the grossSalary : ");
        grossSalary = scanner.nextDouble();
        System.out.print("type the tax : ");
        tax = scanner.nextDouble();

        System.out.println("Employee : " + name + ", $ "+grossSalary);

        System.out.println("");
        System.out.println("==========================");
        System.out.println("Name : "+ name);
        System.out.println("Gross Salary : "+ grossSalary);
        System.out.println("Tax : "+ tax);
        System.out.println("==========================");
        System.out.println("");
    }
}

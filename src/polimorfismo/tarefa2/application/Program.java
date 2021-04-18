package polimorfismo.tarefa2.application;

import polimorfismo.tarefa2.modules.entities.Employee;
import polimorfismo.tarefa2.modules.entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployee = scanner.nextInt();

        for(int i = 1 ; i <= numberEmployee ; i++){
            scanner.nextLine();
            System.out.println("Employee #" + i + " data : ");
            System.out.println("Outsourced (y/n)? ");
            String yesOrNo = scanner.next();
            if(yesOrNo.equals("y")){

                scanner.nextLine();
                System.out.print("Name: ");
                String nameEmployee = scanner.nextLine();
                System.out.print("Hours: ");
                int hoursEmployee = scanner.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = scanner.nextDouble();
                System.out.println("Additional charge: ");
                double additionalCharge = scanner.nextDouble();

                employees.add(new OutSourceEmployee(nameEmployee,hoursEmployee,valuePerHour,additionalCharge));

            } else if (yesOrNo.equals("n")){

                scanner.nextLine();
                System.out.print("Name: ");
                String nameEmployee = scanner.nextLine();
                System.out.print("Hours: ");
                int hoursEmployee = scanner.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = scanner.nextDouble();

                employees.add(new Employee(nameEmployee,hoursEmployee,valuePerHour));

            } else{
                System.out.println("comando invalido");
            }
        }

        System.out.println("PAYMENTS: ");
        for(Employee employee : employees){
            employee.showText();
        }

        scanner.close();
    }
}


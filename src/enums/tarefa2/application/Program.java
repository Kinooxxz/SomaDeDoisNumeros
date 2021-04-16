package enums.tarefa2.application;

import enums.tarefa2.entities.Department;
import enums.tarefa2.entities.HourContract;
import enums.tarefa2.entities.Worker;
import enums.tarefa2.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base Salary: ");
        Double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int contracts = scanner.nextInt();

        for(int i = 1; i <= contracts; i++){
            System.out.println("Enter contract #" + i + " Data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = formatDate.parse(scanner.next());
            System.out.print("Value Per Hours : ");
            double valuePerHour = scanner.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY) : ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: "+  worker.getDepartment().getName());
        System.out.println("income for " + monthAndYear + ": " + String.format(" $ %.2f", worker.income(year,month)));



        scanner.close();
    }
}

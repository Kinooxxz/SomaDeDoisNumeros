package tratamentoExcecoes.tarefa1.programa.application;

import tratamentoExcecoes.tarefa1.programa.model.entities.Reservation;
import tratamentoExcecoes.tarefa1.programa.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scanner.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = simpleDateFormat.parse(scanner.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation.toString());

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = simpleDateFormat.parse(scanner.next());

            reservation.updateDate(checkIn, checkOut);

            System.out.println("Reservation:" + reservation);

        }
        catch (ParseException parseException) {
            System.out.println("Invalid Date Format");
        }
        catch (DomainException DomainException) {
            System.out.println("Error in reservation : " + DomainException.getMessage());
        } /* catch generico */ catch(RuntimeException runtimeException) {
            System.out.println("Unexpected error");
        }
        scanner.close();
    }
}

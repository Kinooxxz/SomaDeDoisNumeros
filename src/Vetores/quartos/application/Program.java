package Vetores.quartos.application;

import Vetores.quartos.entities.Room;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be entered ? : ");
        int n = scanner.nextInt();
        Room[] rooms = new Room[n];

        for(int i = 0; i < rooms.length ; i++){
            scanner.nextLine();
            System.out.println("Rent #"+(i+1)+":");
            System.out.println("Name : ");
            String tempNameStudent = scanner.nextLine();

            System.out.println("Email : ");
            String tempEmail = scanner.nextLine();

            System.out.println("Room : ");
            int tempRoom = scanner.nextInt();

            rooms[i] = new Room(tempNameStudent, tempEmail, tempRoom);


        }

        for (Room room : rooms) {
            System.out.println("Busy Rooms: ");
            if (!(room == null)) {
                System.out.println(room.getRoom() + ": " + room.getNameStudent() + ", " + room.getEmail());
            }
        }

        scanner.close();
    }
}
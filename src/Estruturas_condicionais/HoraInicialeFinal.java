package Estruturas_condicionais;

import java.util.Scanner;

public class HoraInicialeFinal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int total;

        System.out.println("digite a hora inicial do jogo");
        int horaInicial = scanner.nextInt();
        System.out.println("digite a hora final do jogo");
        int horaFinal = scanner.nextInt();

        if(horaInicial < horaFinal){
            total = horaFinal - horaInicial;
        } else{
            total = 24 - horaInicial + horaFinal;
        }

        System.out.println("o jogo durou "+total+" horas!");


        scanner.close();
    }
}

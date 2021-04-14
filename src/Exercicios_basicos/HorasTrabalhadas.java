package Exercicios_basicos;

import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {
        /*
        Fazer um programa que
        leia o número de um
        funcionário, seu número
         de horas trabalhadas, o valor
         que recebe por hora e calcula o
         salário desse funcionário. A seguir, mostre o número
          e o salário do funcionário, com duas casas
         decimais.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero do funcionario: ");
        int numeroFuncionario = scanner.nextInt();
        System.out.println("digite o numero de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("digite o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salario = ((horasTrabalhadas*valorPorHora)*30);
        //considerando que mês = 30 dias.
        System.out.printf("FUNCIONÁRIO : %d%n",numeroFuncionario);
        System.out.printf("SALÁRIO : $ %.2f",salario);
        scanner.close();

    }
}

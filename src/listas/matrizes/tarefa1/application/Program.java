package listas.matrizes.tarefa1.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        int negativeNumbers = 0;
        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
                if(matriz[i][j] < 0){
                    negativeNumbers += 1;
                }
            }
        }
        System.out.println("Negative Numbers : "+negativeNumbers);
        System.out.println("Main Diagonal : ");
        for (int i = 0; i < matriz.length ; i++ ){
            System.out.println(matriz[i][i]);
        }

        scanner.close();
    }
}

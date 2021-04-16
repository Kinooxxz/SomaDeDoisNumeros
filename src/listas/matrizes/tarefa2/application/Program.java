package listas.matrizes.tarefa2.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int n = scanner.nextInt();
        System.out.println("digite outro numero");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        //fazer a estrutura de dados

        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz[i].length ; j++) {
                System.out.println("posição : ["+i+","+j+"]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Escolha um numero destaque : ");
        int numDestaque = scanner.nextInt();

        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == numDestaque){
                    System.out.println("Posição : ["+i+", "+j+"]");

                    //se o conteudo de [j] não for 0, imprima o da direita
                    if(j > 0){
                        System.out.println("Esquerda : ["+matriz[i][j-1]+"]");
                    }
                    //se o conteudo [j] da matriz for menor que a ultima linha da matriz, imprima o numero que está a direita
                    if(j < matriz[i].length-1){
                        System.out.println("Direita :  ["+matriz[i][j+1]+"]");
                    }
                    //se o I não for da posição [ultima] da matriz, imprima o número abaixo dela que está na [ultima]
                    if(i < matriz.length-1){
                        System.out.println("Cima : ["+matriz[i+1][j]+"]");
                    }
                    //se o I não for da posição [i = 0], imprima o numero que está na posição [i = 0]
                    if(i > 0){
                        System.out.println("Baixo : ["+matriz[i-1][j]+"]");
                    }
                }
            }
        }


        scanner.close();

    }
}


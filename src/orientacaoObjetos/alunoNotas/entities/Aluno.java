package orientacaoObjetos.alunoNotas.entities;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public void status(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o nome do aluno : ");
        this.nome = scanner.nextLine();
        System.out.print("digite a nota1 do aluno : ");
        this.nota1 = scanner.nextDouble();
        System.out.print("digite a nota2 do aluno : ");
        this.nota2 = scanner.nextDouble();
        System.out.print("digite a nota3 do aluno : ");
        this.nota3 = scanner.nextDouble();

        double media = nota1 + nota2 + nota3;
        System.out.println("GRADE FINAL = "+ media);
        if(media >= 60d){
            System.out.println("APROVADO");
        } else{
            double pontosFaltando = 60 - media;
            System.out.println("REPROVADO");
            System.out.println("faltando : "+ pontosFaltando+" pontos.");
        }
        scanner.close();
    }
}

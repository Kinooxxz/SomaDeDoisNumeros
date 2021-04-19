package classesMetodosAbstratos.tarefa2.application;

import classesMetodosAbstratos.tarefa2.modules.entities.Conta;
import classesMetodosAbstratos.tarefa2.modules.entities.ContaFisica;
import classesMetodosAbstratos.tarefa2.modules.entities.ContaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        System.out.print("Digite o numero de contribuintes: ");
        int numContribuintes = scanner.nextInt();

        for(int i = 1; i <= numContribuintes; i++){
            scanner.nextLine();
            System.out.print("Conta juridica ou Fisica? (j/f): ");
            char juridicaOuFisica = scanner.next().charAt(0);
            if(juridicaOuFisica == 'f'){
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Renda anual: ");
                double rendaAnual = scanner.nextDouble();
                System.out.print("Gastos com saude: ");
                double gastosComSaude = scanner.nextDouble();

                contas.add(new ContaFisica(nome,rendaAnual,gastosComSaude));


            } else if(juridicaOuFisica == 'j'){
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Renda anual: ");
                double rendaAnual = scanner.nextDouble();
                System.out.print("Numero de funcionarios: ");
                int numFuncionarios = scanner.nextInt();

                contas.add(new ContaJuridica(nome,rendaAnual,numFuncionarios));

            } else{
                System.out.println("comando invalido");
            }
        }

        for(Conta conta : contas){
            conta.calcularImposto();
        }
        scanner.close();
    }
}

package tratamentoExcecoes.tarefa2.application;

import tratamentoExcecoes.tarefa2.model.entities.Conta;
import tratamentoExcecoes.tarefa2.model.exception.ContaException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Coloque os dados da conta");
            System.out.print("Numero: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Titular: ");
            String titular = scanner.nextLine();
            System.out.print("Saldo inicial: ");
            double balancoInicial = scanner.nextDouble();
            System.out.print("Limite de saque: ");
            double valorLimite = scanner.nextDouble();

            //instancia do objeto Conta

            Conta conta = new Conta(numero,titular,balancoInicial,valorLimite);

            System.out.println("");
            System.out.print("Digite um valor para sacar: ");
            double valorSaque = scanner.nextDouble();
            System.out.println("Novo saldo : " + conta.sacar(valorSaque));

        } catch(ContaException contaException){
            System.out.println("Erro: "+ contaException.getMessage());
        } catch(RuntimeException runtimeException){
            System.out.println("Erro: Erro inesperado");
        }


        scanner.close();
    }
}

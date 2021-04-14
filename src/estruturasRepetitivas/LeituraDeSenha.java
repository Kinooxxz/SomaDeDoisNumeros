package estruturasRepetitivas;

import java.util.Scanner;

public class LeituraDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua senha : ");
        int senha = scanner.nextInt();

        while (!(senha == 2002)){
            System.out.print("Senha incorreta, digite novamente.");
            senha = scanner.nextInt();
        }
        System.out.print("Senha aceita!");
        scanner.close();
    }
}

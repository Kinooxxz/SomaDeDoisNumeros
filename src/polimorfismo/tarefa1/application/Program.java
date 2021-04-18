package polimorfismo.tarefa1.application;

import heranca.tarefa1.modules.entities.Account;
import heranca.tarefa1.modules.entities.SavingsAcount;

public class Program {
    public static void main(String[] args){

        Account x =  new Account(1000,"Jhonata",5000.0);
        Account y = new SavingsAcount(1000,"Alex",5000.0,0.01);

        x.withDraw(50);
        y.withDraw(50);

        System.out.println(String.format("%.2f",x.getBalance()));
        System.out.println(String.format("%.2f",y.getBalance()));

    }
}

package heranca.tarefa1.application;

import heranca.tarefa1.modules.entities.Account;
import heranca.tarefa1.modules.entities.BusinessAccount;
import heranca.tarefa1.modules.entities.SavingsAcount;

public class Program {

    public static void main(String[] args){

        Account account = new Account(1001,"Jhonata",0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Alex", 0.0,567.0);

        //upcasting

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003,"Lillia",0.0, 200.0);
        Account account3 = new SavingsAcount(1004,"Lily",0.0,240.0);


        // downcasting

        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(567);

        if(account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(550);
            System.out.println("Loan!");
        } else if (account3 instanceof SavingsAcount){
            SavingsAcount account5 = (SavingsAcount) account3;
            account5.updateBalance();
            System.out.println("Updated!");
        }

        Account acc1 = new Account(1678,"Jhonata",1000.0);
        acc1.withDraw(500);
        System.out.println( "saldo Acc1 : "+String.format("%.2f",acc1.getBalance()) );
        Account acc2 = new SavingsAcount(1679,"JhonataPlus",1000.0,1658.0);
        acc2.withDraw(500);
        System.out.println( "saldo Acc2 : "+String.format("%.2f",acc2.getBalance()) );

        Account acc3 = new BusinessAccount(1543, "Bob",5000.0,10000.0);
        acc3.withDraw(100);
        System.out.println( "saldo Acc3 : "+String.format("%.2f",acc3.getBalance()) );

    }
}

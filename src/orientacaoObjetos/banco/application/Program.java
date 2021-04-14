package orientacaoObjetos.banco.application;

import orientacaoObjetos.banco.entities.User;

public class Program {
    public static void main(String[] args) {
        User user = new User(123,"Jhonata",10);
        user.depositarValor(10);
        user.sacarValor(10);
    }
}

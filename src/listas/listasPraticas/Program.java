package listas.listasPraticas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //para adicionar qualquer coisa a lista
        list.add("Removido1");
        list.add("Padrao1");
        list.add("Padrao2");
        list.add("Padrao3");
        list.add("RemoverGeralt");
        list.add("RemovidoString");
        list.add("Alex");
        list.add("Arroz");
        list.add("Ana");

        // para adicionar elementos na lista
        list.add(2,"Intruso");

        // para remover elementos da lista
        list.remove("RemovidoString");
        list.remove(1);



        System.out.println("tamanho da lista : "+list.size());

        //estrutura For each
        for(String lista : list){
            System.out.println(lista);
        }
        System.out.println("------------------------------");
        //remover Geralt com expressões lambda
        list.removeIf(x -> x.charAt(0) == 'R');

        for(String lista : list){
            System.out.println(lista);
        }
        System.out.println("------------------------------");
        System.out.println("Index Of Padrao2" + list.indexOf("Padrao2"));
        System.out.println("Index Of Padrao3" + list.indexOf("Padrao3"));
        System.out.println("------------------------------");
        List<String> list2 = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String lista3 : list2){
            System.out.println(lista3);
        }

        System.out.println("------------------------------");
        // metodo para encontrar a primeira string que achar
        String string = list.stream().filter(z -> z.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(string);




    }
}

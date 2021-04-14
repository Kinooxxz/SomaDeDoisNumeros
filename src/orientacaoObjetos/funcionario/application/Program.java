package orientacaoObjetos.funcionario.application;


import orientacaoObjetos.funcionario.entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setDatas();
        funcionario.increaseSalary(20);
    }

}

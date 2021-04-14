package orientacaoObjetos.estoques.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //construtor padrão, aula de sobrecarga
    public Product(){

    }

    public Product(String name, double price, int quantity){ //construtor com 3 parametros
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){ //construtor com 2 parametros
        this.name = name;
        this.price = price;
    }



    /////////////////////////////

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    ////////////////////////////

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name;
    }

}

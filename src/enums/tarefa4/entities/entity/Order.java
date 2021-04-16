package enums.tarefa4.entities.entity;

import enums.tarefa1.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order(){}

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public Client getClient(){
        return client;
    }

    //--------------------------------------------

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.add(item);
    }

    public Double total(){
        double sum = 0.0;
        for(OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ");
        stringBuilder.append(dateFormat.format(moment) + "\n");
        stringBuilder.append("Order status: ");
        stringBuilder.append(status + "\n");
        stringBuilder.append("Client: ");
        stringBuilder.append(client + "\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem item : items) {
            stringBuilder.append(item + "\n");
        }
        stringBuilder.append("Total price: $");
        stringBuilder.append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}

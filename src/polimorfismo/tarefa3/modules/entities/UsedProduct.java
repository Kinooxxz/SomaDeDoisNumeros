package polimorfismo.tarefa3.modules.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
    private Date manufactureDate;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag(){
        return this.getName() + " (used) $ " + this.getPrice() + " (Manufacture date: " +  this.simpleDateFormat.format(this.getManufactureDate()) + ")";
    }
}

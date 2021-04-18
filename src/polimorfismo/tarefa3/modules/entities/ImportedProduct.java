package polimorfismo.tarefa3.modules.entities;


public final class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFree() {
        return customsFee;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFee = customsFree;
    }

    @Override
    public final String priceTag(){
        return this.getName() + " $ " +this.getPrice() + " (Customs fee: $ " + this.getCustomsFree() + ")";
    }

    public void totalPrice(){

    }
}

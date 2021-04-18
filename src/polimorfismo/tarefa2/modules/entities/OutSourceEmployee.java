package polimorfismo.tarefa2.modules.entities;

public final class OutSourceEmployee extends Employee {
    private Double additionalChange;


    public OutSourceEmployee(String name, Integer hours, Double valuePerHours, Double additionalChange) {
        super(name, hours, valuePerHours);
        this.additionalChange = additionalChange;
    }

    public OutSourceEmployee() {
    }

    public Double getAdditionalChange() {
        return additionalChange;
    }



    @Override
    public final Double payment(){
        return (super.payment() + (additionalChange * 1.1));
    }


    @Override
    public final void showText(){
        System.out.println(name +" - $ "+ this.payment());
    }

}

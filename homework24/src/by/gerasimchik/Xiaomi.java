package by.gerasimchik;

public class Xiaomi extends SmallHomeApplianses {

    private String model;
    private double price;

    public Xiaomi(int power, String manufacturer, double weigth, String model, double price) {
        super(power, manufacturer, weigth);
        this.model = model;
        this.price = price;
    }

    @Override
    void plugIn() {
        super.plugIn();
        System.out.println("Стою на зарядке не работаю");
    }
}

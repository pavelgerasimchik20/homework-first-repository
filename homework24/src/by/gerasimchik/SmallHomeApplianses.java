package by.gerasimchik;

public class SmallHomeApplianses extends Applianses {
    private double weight;

    public SmallHomeApplianses(int power, String manufacturer, double weigth) {
        super(power, manufacturer);
        this.weight = weigth;
    }

    @Override
    void plugIn() {
        isOn=true;
    }
}

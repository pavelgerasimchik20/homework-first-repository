package by.gerasimchik;

public class Atlant extends LargeHomeAppliances {

    private double width;
    private double length;
    private double height;

    public Atlant(int power, String manufacturer, String name, double w, double l, double h) {
        super(power, manufacturer, name);
        width = w;
        length = l;
        height = h;
    }

    @Override
    void plugIn() {
        super.plugIn();
        System.out.println("Включен в разетку и работаю, не то что ваш КСЯОМИ)))");
    }
}

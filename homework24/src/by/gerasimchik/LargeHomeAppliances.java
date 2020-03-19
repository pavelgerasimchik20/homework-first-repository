package by.gerasimchik;

public class LargeHomeAppliances extends Applianses {

    private String name;

    public LargeHomeAppliances(int power, String manufacturer, String name) {
        super(power, manufacturer);
        this.name = name;
    }

    @Override
    void plugIn() {
        isOn = true;
    }
}

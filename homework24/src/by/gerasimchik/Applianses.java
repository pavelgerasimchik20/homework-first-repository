package by.gerasimchik;

public abstract class Applianses {
    protected boolean isOn = false;
    private int power;
    private String manufacturer;

    public Applianses(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    abstract void plugIn();

    public boolean isOn() {
        return isOn;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

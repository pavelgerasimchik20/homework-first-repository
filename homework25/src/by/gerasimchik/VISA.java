package by.gerasimchik;

public class VISA extends InternationalCard {

    private int validity;

    public VISA(double balance, String cartName, int validity) {
        super(balance, cartName);
        this.validity = validity;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    @Override
    public void addMoney(double addCash) {
        super.addMoney(addCash);
    }

    @Override
    public void blockCard() {
        block = true;
        System.out.println("Карта заблокирована");
        ;
    }

    @Override
    public void unblockCard() {
        block = false;
        System.out.println("Карта разблокирована");
    }
}


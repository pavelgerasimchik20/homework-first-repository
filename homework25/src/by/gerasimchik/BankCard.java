package by.gerasimchik;

public abstract class BankCard implements functionCard {

    protected double balance;

    public BankCard(double balance) {
        this.balance = balance;
    }


    public abstract void addMoney(double addCash);

    public abstract void takeMoney();
    public abstract void keepMoney();
    private double toPay(double balance){
        return -balance;
    }

}

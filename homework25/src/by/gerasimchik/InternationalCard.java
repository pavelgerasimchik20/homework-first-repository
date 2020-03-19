package by.gerasimchik;

public class InternationalCard extends BankCard {

    private boolean onlyCredit;
    private String cartName;
    public boolean block;

    public InternationalCard(double balance, String cartName) {
        super(balance);
    }

    @Override
    public void addMoney(double addCash) {
        if (block) {
            System.out.println("Operation not available ");
        } else {
            balance += addCash;
            System.out.println("Operation was successful");
        }
    }

    @Override
    public void takeMoney() {

    }

    @Override
    public void keepMoney() {

    }

    @Override
    public void blockCard() {
        block = true;
    }

    @Override
    public void unblockCard() {
        block = false;
    }
}


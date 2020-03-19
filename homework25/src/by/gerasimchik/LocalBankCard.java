package by.gerasimchik;

public class LocalBankCard extends BankCard { // БЕЛКАРТ

    private String location;

    public LocalBankCard(double balance, String location) {
        super(balance);
        this.location = location;
    }

    @Override
    public void addMoney(double addCash) {

    }

    @Override
    public void takeMoney() {

    }

    @Override
    public void keepMoney() {

    }

    @Override
    public void blockCard() {

    }

    @Override
    public void unblockCard() {

    }
}


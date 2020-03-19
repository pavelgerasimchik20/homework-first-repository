package by.gerasimchik;

public class VirtualCard extends BankCard{

    private long identificationNumber;

    public VirtualCard(double balance, long identificationNumber) {
        super(balance);
        this.identificationNumber = identificationNumber;
    }

    public long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
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


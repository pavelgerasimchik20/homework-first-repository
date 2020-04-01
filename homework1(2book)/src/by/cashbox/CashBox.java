package by.cashbox;

public interface CashBox {

    Integer takeCash(int amount);

    void giveChange();

    boolean isRun = true;

    void printCashBalance();
}

package by.cashbox;

public class CashBoxImpl implements CashBox {

    private Integer cashBalance;
    public boolean isRun = true;

    @Override
    public void takeCash(int amount) {
        synchronized (cashBalance) {
            cashBalance += amount;
        }
    }

    @Override
    public void giveChange() {
        System.out.println("Сдача выдана");
    }

    @Override
    public void printCashBalance() {
        synchronized (cashBalance) {
            System.out.println(cashBalance);
        }
    }

    public void close() {
        isRun = false;
    }
}

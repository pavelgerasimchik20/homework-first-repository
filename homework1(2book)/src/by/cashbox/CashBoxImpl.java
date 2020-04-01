package by.cashbox;

public class CashBoxImpl implements CashBox {

    private int cashBalance;

    @Override
    public Integer takeCash(int amount) {
        cashBalance += amount;
        return cashBalance;
    }

    @Override
    public void giveChange() {
        System.out.println("Сдача выдана");
    }

    @Override
    public void printCashBalance() {
        System.out.println(cashBalance);
    }
}

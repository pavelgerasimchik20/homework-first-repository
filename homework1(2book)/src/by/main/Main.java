package by.main;

import by.cashbox.CashBox;
import by.cashbox.CashBoxImpl;
import by.shopper.ShopperImpl;

public class Main {

    public static void main(String[] args) {

    CashBoxImpl cashBox  = new CashBoxImpl();

    startNewShopper(cashBox, "Павел Чернышев ");
    startNewShopper(cashBox, "Марк Яковлев");
    startNewShopper(cashBox, "Александр Верамкович ");

    try {
        Thread.sleep(5_000);
    } catch (Exception e) {
        e.printStackTrace();
    }finally {
        cashBox.printCashBalance();
        cashBox.close();
    }

}
    static void startNewShopper(CashBox cashBox, String name) {
        ShopperImpl shopper = new ShopperImpl();
        shopper.setCashBox((CashBoxImpl) cashBox);
        new Thread(shopper, name).start();
    }
}

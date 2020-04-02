package by.shopper;

import by.cashbox.CashBoxImpl;
import by.product.Product;

public class ShopperImpl implements Shopper, Runnable {

    private CashBoxImpl cashBox;
    private static volatile int money = 240;
    Product product1 = new Product();
    Product product2 = new Product();
    Product product3 = new Product();

    public void setCashBox(CashBoxImpl cashBox) {
        this.cashBox = cashBox;
    }

    @Override
    public Integer giveCash() {
        if (money > product1.cost + product2.cost + product3.cost) {
            money -= (product1.cost + product2.cost + product3.cost);
            return (product1.cost + product2.cost + product3.cost);
        } else {
            System.out.println("У покупателя недостаточно средств");
            return null;
        }
    }

    @Override
    public void getChange() {
        System.out.println("Сдача получена ");
    }

    @Override
    public void run() {
        if (money > product1.cost + product2.cost + product3.cost) {
            try {
                Thread.currentThread().sleep(3_000);
                money -= giveCash();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Покупатель " + Thread.currentThread().getName() + " купил:\n товар 1 стоимостью " + product1.cost + "\n товар 2 стоимостью " + product2.cost + "\n товар 3 стоимостью " + product3.cost);
        } else {
            // System.out.println("Покупатель ушел без покупок ");
            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

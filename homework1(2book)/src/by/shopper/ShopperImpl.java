package by.shopper;

import by.product.Product;

public class ShopperImpl implements Shopper {

    private volatile int money = 220;
    Product product1 = new Product();
    Product product2 = new Product();
    Product product3 = new Product();

    public ShopperImpl(Product product1, Product product2, Product product3) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
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
}

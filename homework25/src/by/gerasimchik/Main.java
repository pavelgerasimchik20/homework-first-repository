package by.gerasimchik;

public class Main {

    public static void main(String[] args) {

        VISA visaGold = new VISA(100_000.20, "VISA gold", 36);

        visaGold.blockCard();
        visaGold.addMoney(50000);
        System.out.println("Текущий баланс: " + visaGold.balance);

        visaGold.unblockCard();
        visaGold.addMoney(20000.50);
        System.out.println("Текущий баланс: " + visaGold.balance);


    }
}

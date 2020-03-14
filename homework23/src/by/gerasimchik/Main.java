package by.gerasimchik;

public class Main {

    public static void main(String[] args) {

        Bankomat belinvestbank = new Bankomat(1000,500,200);

        belinvestbank.addCash(100,100,100);

        belinvestbank.showBanknote();
        belinvestbank.takeMoney(1220);
        belinvestbank.showBanknote();
    }
}

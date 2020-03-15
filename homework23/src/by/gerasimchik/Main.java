package by.gerasimchik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bankomat belinvestbank = new Bankomat(100, 100, 100);
        Scanner scanner = new Scanner(System.in);
        belinvestbank.showBanknote();
        //belinvestbank.addCash(10,10,10);

        while (true) {
            System.out.println("Запросите сумму в $ :");
            int s = scanner.nextInt();
            if (belinvestbank.takeMoney(s)) {
                System.out.println("Операция прошла успешно");
            } else {
                System.out.println("Операция не выполнена");
            }
            belinvestbank.showBanknote();
        }
    }
}

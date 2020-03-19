package by.gerasimchik;

public class Main {

    public static void main(String[] args) {

        Xiaomi robotCleaner = new Xiaomi(80, "China", 4.20, "X20", 400);
        Atlant refrigerator = new Atlant(250, "Belarus", "Refrigerator", 0.750, 0.750, 1.8);

        robotCleaner.plugIn();
        refrigerator.plugIn();
        System.out.println("Мощность холодильника : " + refrigerator.getPower() + " Wt");


    }
}

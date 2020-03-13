package by.gerasimchik;

public class Main {

    public static void main(String[] args) {

        Time interval1 = new Time(30, 10, 8);
        Time interval2 = new Time(3600);
        Time interval3 = new Time(0, 0, 1);

        System.out.println("Значение в обькте 1 -" + interval1.giveMeFullSec());
        System.out.println("Значение в обькте 2 -" + interval2.giveMeFullSec());
        System.out.println("Значение в обькте 3 -" + interval3.giveMeFullSec());

        System.out.println("Равны ли объекты 1 и 2 ?- " + Time.AreEqual(interval1, interval2));
        System.out.println("Равны ли объекты 1 и 3 ?- " + Time.AreEqual(interval1, interval3));
        System.out.println("Равны ли объекты 2 и 3 ?- " + Time.AreEqual(interval2, interval3));
    }
}

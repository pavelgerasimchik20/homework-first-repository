package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        Time interval1 = new Time(30, 10, 1,1);
        Time interval2 = new Time(3600,2);
        Time interval3 = new Time(30, 10, 1,3);
        Time interval4 = new Time(4230,4);

        System.out.println(interval1);
        System.out.println(interval2);
        System.out.println(interval3);
        System.out.println(interval4);

        System.out.println("Равны ли объекты 2 и 3 ?- " + Time.AreEqual(interval2, interval3));
        System.out.println("Равны ли объекты 3 и 4 ?- " + Time.AreEqual(interval3, interval4));
    }
}

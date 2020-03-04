package by.gerasimchik;

public class Main {

    static double t, t1 = 0, t2 = 0;
    static String str = " java forever ";

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            t = System.currentTimeMillis();
            str += " java forever ";
            t1 += System.currentTimeMillis() - t;
        }

        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < 100; i++) {
            t = System.currentTimeMillis();
            stringBuilder.append(" java forever ");
            t2 += System.currentTimeMillis() - t;
        }
        System.out.println("Strint execution speed: " + t1);
        System.out.println("StringBuilder execution speed: " + t2);
    }

}

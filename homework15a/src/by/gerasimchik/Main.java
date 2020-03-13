package by.gerasimchik;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mass = {19, 345, 1, 24, 6, 6, 6, 23, 41, 0, 66, 100};
        System.out.println(Arrays.toString(mass));
        boolean go = true;
        while (go) {
            go = false;
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] > mass[i - 1]) {
                    int x = mass[i];
                    mass[i] = mass[i - 1];
                    mass[i - 1] = x;
                    go = true;
                }
            }
        }
        System.out.println(Arrays.toString(mass));

        int sum = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            sum+=mass[i];
        }
        System.out.println(sum);
    }


}

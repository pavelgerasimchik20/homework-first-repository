package by.gerasimchik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i, (int) (Math.random()*10+1));
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
}

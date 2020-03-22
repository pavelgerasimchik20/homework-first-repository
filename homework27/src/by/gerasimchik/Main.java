package by.gerasimchik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i, (int) (Math.random() * 10));
        }
        Collections.sort(list);
        System.out.println("First list " + list);

        /*Iterator<Integer> listIterator = list.iterator();
        do {
            if (listIterator.next() == listIterator.next()) {
                listIterator.remove();
            }
        }while(listIterator.hasNext());
        System.out.println("Finish list " + list);*/
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Finish list " + set);
    }
}



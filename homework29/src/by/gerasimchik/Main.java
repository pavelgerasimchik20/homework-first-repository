package by.gerasimchik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
            text = text.toLowerCase();

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if ((ch >= 'а' && ch <= 'я') || ch == 'ё') {
                    map.compute(ch, (character, integer)
                            -> integer == null ? 1 : integer + 1);
                }
            }

            ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
            for (Map.Entry<Character, Integer> resultList : list) {
                System.out.println(resultList.getKey() + " " + resultList.getValue());
            }


    }
}
package by.gerasimchik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //ЗАДАНИЕ 15 НАХОДИТСЯ В ДРУГОМ КОММИТЕ

        //Задание 16
        int[] fff = new int[15];
        for (int j = 0; j < fff.length; j++) {
            fff[j] = (int) (Math.random() * 10);
        }
        System.out.print(Arrays.toString(fff));
        System.out.println();
        for (int i = 0; i < fff.length / 2; i++) {
            int tmp = fff[i];
            fff[i] = fff[fff.length - i - 1];
            fff[fff.length - i - 1] = tmp;
        }
        System.out.print(Arrays.toString(fff));
    }
}

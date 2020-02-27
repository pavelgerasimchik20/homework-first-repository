package by.gerasimchik;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        // Задание 8
        long sum = 1;
        int i = 1;
        int factorial = 16;
        while (i <= factorial) {
            sum *= i;
            i++;
        }
        System.out.println("Факториал числа " + factorial + " равен = " + sum);

        //Задание 9
        int max = 0;
        int q = 100;
        int rnd = (int) (Math.random() * q);
        while (rnd != 0) {
            rnd =   (int) (Math.random() * q);
            if (max < rnd)
                max = rnd;
        }
        System.out.println("Максимально значение из рандомных чисел в диапазоне от 0 до " + q + " равно = " + max);

        //Задание 10
        int val = 123_383_999;
        int sum1 = 0;
        while (val  != 0) {
            sum1 += val % 10;
            val = val / 10;
        }
        System.out.println("Sum of digits of number = "+ sum1);
    }
}

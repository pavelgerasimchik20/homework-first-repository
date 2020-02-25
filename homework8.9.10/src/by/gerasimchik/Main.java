package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        // Задание 8
        long sum = 1;
        long i = 1;
        int factorial = 200;
        while (i <= factorial) {
            sum *= i;
            i++;
        }
        System.out.println("Факториа числа " + factorial + " равен = " + sum);

        //Задание 9
        int max = 0;
        Integer q = 100;
        int rnd = (int) (Math.random() * q);
        while (rnd != 0) {
            rnd = (int) (Math.random() * q);
            if (max < rnd)
                max = rnd;
        }
        System.out.println("Максимально значение из рандомных чисел в диапазоне " + q + " равно = " + max);

        //Задание 10
        int val = 439;
        int sum1 = 0;
        int a, b, c;
        while (val % 10 != 0) {
            sum1 += val % 10;
            val = val / 10;
        }
        System.out.println();

    }
}

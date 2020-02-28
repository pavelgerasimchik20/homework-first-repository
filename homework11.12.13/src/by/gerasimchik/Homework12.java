package by.gerasimchik;

public class Homework12 {

    public static void main(String[] args) {
        int val = 123_383_999;
        int sum = 0;
        for (int i = 1000000000; i > ; i/1000) {
            sum = val / i;
            System.out.print(" " + sum);
            sum=val;
        }
    }
}

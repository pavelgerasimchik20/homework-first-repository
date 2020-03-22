package by.gerasimchik;

import java.util.Scanner;

public class TwoHome {

    public static void main(String[] args) {

        //Задание 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Ширина первого дома:");
        int a1 = sc.nextInt();
        System.out.println("Длина первого дома:");
        int b1 = sc.nextInt();
        System.out.println("Ширина второго дома:");
        int c1 = sc.nextInt();
        System.out.println("Длина второго дома:");
        int d1 = sc.nextInt();
        System.out.println("Размер участка OY:");
        int e = sc.nextInt(); // размеры
        System.out.println("Размер участка OX:");
        int f = sc.nextInt(); // участка

        if (f >= b1 + c1 && e >= d1 && e >= a1) {
            System.out.println("Дома вмещаются на участке");
        } else if (f >= b1 + d1 && e >= c1 && e >= a1) {
            System.out.println("Дома вмещаются на участке");
        } else if (f >= a1 + c1 && e >= b1 && e >= d1) {
            System.out.println("Дома вмещаются на участке");
        } else if (f >= a1 + d1 && e >= b1 && e >= c1) {
            System.out.println("Дома вмещаются на участке");
        } else {
            System.out.println("Дома НЕ вмещаются на участке");
        }
    }
}

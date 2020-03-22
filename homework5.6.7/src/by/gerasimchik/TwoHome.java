package by.gerasimchik;

import java.util.Scanner;

public class TwoHome {

    public static void main(String[] args) {

        //Задание 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Ширина первого дома:");
        int a = sc.nextInt();
        System.out.println("Длина первого дома:");
        int b = sc.nextInt();
        System.out.println("Ширина второго дома:");
        int c = sc.nextInt();
        System.out.println("Длина второго дома:");
        int d = sc.nextInt();
        System.out.println("Размер участка OY:");
        int e = sc.nextInt(); // размеры
        System.out.println("Размер участка OX:");
        int f = sc.nextInt(); // участка

        if ((e >= (c + a)) && (f >= d && f >= b)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((e >= (c + b)) && (f >= d && f >= a)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((e >= (d + a)) && (f >= c && f >= b)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((e >= (d + b)) && (f >= c && f >= a)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((f >= (c + a)) && (e >= d && e >= b)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((f >= (c + b)) && (e >= d && e >= a)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((f >= (d + a)) && (e >= c && e >= b)) {
            System.out.println("Дома вмещаются на участке");
        } else if ((f >= (d + b)) && (e >= c && e >= a)) {
            System.out.println("Дома вмещаются на участке");
        }
        else
            System.out.println("Дома НЕ вмещаются на участке");
    }
}

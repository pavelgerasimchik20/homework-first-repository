package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        //Задание 5
        int x = 133888888;
        if ((x - 1) % 10 == 0)
            System.out.println(x + " рубль");
        else if ((x - 2) % 10 == 0 || (x - 3) % 10 == 0 || (x - 4) % 10 == 0)
            System.out.println(x + " рубля");
        else
            System.out.println(x + " рублей");
        //Задание 6
        int a = 29; //число
        int b = 2;  //месяц
        int c = 2020; //год

        if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10) {
            if (a >= 1 && a < 31) {
                a++;
                System.out.println(a + " " + b + " " + c);
            } else if (a == 31) {
                a = 1;
                b++;
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("Такого числа не существует");
            }
        } else if (b == 4 || b == 6 || b == 9 || b == 11) {
            if (a >= 1 && a < 30) {
                a++;
                System.out.println(a + " " + b + " " + c);
            } else if (a == 30) {
                a = 1;
                b++;
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("Такого числа не существует ");
            }
        } else if (b == 12) {
            if (a >= 1 && a < 31) {
                a++;
                System.out.println(a + " " + b + " " + c);
            } else if (a == 31) {
                a = 1;
                b = 1;
                c++;
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("Такого числа не существует");
            }
        } else if (b == 2) {
            if (c % 400 == 0 || (c % 4 == 0 && c % 100 != 0)) {
                if (a >= 1 && a < 29) {
                    a++;
                    System.out.println(a + " " + b + " " + c);
                } else if (a == 29) {
                    a = 1;
                    b++;
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println("Такого числа не существует");
                }
            } else {
                if (a >= 1 && a < 28) {
                    a++;
                    System.out.println(a + " " + b + " " + c);
                } else if (a == 28) {
                    a = 1;
                    b++;
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println("Такого числа не существует");
                }
            }
        } else {
            System.out.println("Такого месяца не существует");
        }
        //Задание 7
        int a1 = 6;
        int b1 = 10;
        int c1 = 5;
        int d1 = 10;
        int e = 10; // размеры
        int f = 10; // участка

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

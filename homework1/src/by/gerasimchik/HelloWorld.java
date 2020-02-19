package by.gerasimchik;

public class HelloWorld {

    public static void main(String[] args) {
        int s =600;     // Р   А    Б    О    Т     А      Е       Т  !!!!!!!!!!!!
        int sec;           //          К
        int m;             //            А
        int min, h;        //              К
        int hh;            //
        int day, d, w;     //           Ч  А  С  Ы

        sec = s % 60;  // количество секунд
        m = (s-sec)/60;  // переменная содержащая ровное количество минут
        min = m % 60;   // количество минут
        h = (m-min)/60;// переменная содержащая ровное количество часов
        hh = h % 24; // количество часов
        day = (h-hh)/ 24 ; // переменная содержаща ровное количество суток
        d = day % 7;   //количество суток
        w = day/7; //количество недель

        System.out.println(w + " недель " +d+ " суток "+ hh +" часов "+ min +" минут "+ sec +" секунд ");
    }
}

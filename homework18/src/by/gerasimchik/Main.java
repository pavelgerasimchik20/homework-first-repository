package by.gerasimchik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку для подсчета знаков прининания в ней: ");
            String str = scanner.nextLine();
            int count = 0;
            char zn;
            for (int i = 0; i < str.length(); i++) {
                zn = str.charAt(i);
                if (zn == ',' || zn == '.' || zn == '!' || zn == '?' || zn == '-' || zn == ':' || zn == ';' || zn == '(' || zn == ')' || zn == '"')
                    count++;
            }
            System.out.println("В данной строке " + count + " знаков припинания");
        }
    }
}


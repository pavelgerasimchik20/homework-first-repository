package by.gerasimchik;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String arraySize = JOptionPane.showInputDialog(null,"Введите размер создаваемого массива");
        int size= Integer.parseInt(arraySize);
        int marks[] = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 100);
            System.out.print(marks[i] + "|");
        }
        System.out.println();

        int maxDigit = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxDigit < marks[i]) {
                maxDigit = marks[i];
            }
        }

        for (int i = 0; i < marks.length;i++ ) {
            if (maxDigit == marks[i]) {
               System.out.println("Индекс элемента массива, содержащего мах элемент= " + i);
            }
        }
    }
}

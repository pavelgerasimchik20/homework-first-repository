package by.gerasimchik;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        int count = 0;
        str = JOptionPane.showInputDialog("Введите текст (без пунктуационных ошибок):\n-вводите пробел после знаков препинания\n-не вводите пробел до и после дефиса");
        final String trim = str.trim();
        char space;
        for (int i = 0; i < trim.length(); i++) {
            space = trim.charAt(i);
            if (space == ' ') {
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "Количество слов в данном тексте = " + (count + 1));

    }
}

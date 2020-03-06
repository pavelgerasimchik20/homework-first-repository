package by.gerasimchik;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        int count = 0;
        str = JOptionPane.showInputDialog("Введите текст :");
        str = str.replaceAll("[!.,?:;-<>]", "");
        str = str.replaceAll("-?[0-9]+", "");
        String trim = str.trim();

        String[] txt = trim.split(" +");
        for (String word: txt){
            count++;
        }
        JOptionPane.showMessageDialog(null, "Количество слов в данном тексте = " + count);

    }
}

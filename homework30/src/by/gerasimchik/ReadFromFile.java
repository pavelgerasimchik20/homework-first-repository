package by.gerasimchik;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

    public String readFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] bytes = new byte[fis.available()];
            int bytesCount = fis.read(bytes);
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile();
        String textFile = readFromFile.readFromFile("readme.txt");
        System.out.println("Читаем текст : " + textFile);
        int coun = 0;
        char zn;
        for (int i = 0; i < textFile.length(); i++) {
            zn = textFile.charAt(i);
            if (zn == ',' || zn == '.' || zn == '!' || zn == '?' || zn == '-' || zn == ':' || zn == ';' || zn == '(' || zn == ')' || zn == '"')
                coun++;
        }
        textFile = textFile.replaceAll("[-!.,?:;<>+)(]", "");
        textFile = textFile.replaceAll("-?[0-9]+", "");
        String trim = textFile.trim();

        String[] txt = trim.split(" +");
        int count = 0;
        for (String word : txt) {
            count++;
        }
        JOptionPane.showMessageDialog(null,"Количество слов в данном тексте = " + count + "\nКоличество знаков припинания = " + coun);
    }

}

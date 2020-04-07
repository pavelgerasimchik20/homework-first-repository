package by.gerasimchik;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ReadToFile {

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

    public void result() {
        String textFile = readFromFile("readme.txt");
        System.out.println("Читаем текст : " + textFile);

        textFile = textFile.replaceAll("[-!?:;<_>`{}()=+*%#@]\"", "");
        textFile = textFile.replaceAll("[.,]", " ");
        textFile = textFile.replaceAll("[A-Za-z]", "");
        textFile = textFile.replaceAll("[А-Яа-я]", "");

        String trim = textFile.trim();

        String[] txt = trim.split(" +");

        ArrayList<String> beforeDelete = new ArrayList<>();
        HashSet<String> afterDelete = new HashSet<>();
        int sum = 0;
        for (String word : txt) {

            beforeDelete.add(word);
            afterDelete.add(word);
            sum += Integer.parseInt(word);
        }
        System.out.println("Числа в тексте: " + beforeDelete.toString());
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Числа в тексте после удаления дубликатов: " + afterDelete.toString());



    }
}

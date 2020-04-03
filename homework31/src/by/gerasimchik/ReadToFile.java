package by.gerasimchik;

import java.io.FileInputStream;
import java.io.IOException;

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

    public static void main(String[] args) {

        ReadToFile readFromFile = new ReadToFile();
        String textFile = readFromFile.readFromFile("readme.txt");
        System.out.println("Читаем текст : " + textFile);

        if (!textFile.matches("^\\D*$")) {
            int count = 0, sum = 0;
            System.out.print("Цифры в тексте: ");
            for (int i = 0; i < textFile.length(); i++) {
                if (Character.isDigit(textFile.charAt(i))) {
                    count++;
                    System.out.print(textFile.charAt(i) + " | ");
                    sum += Integer.parseInt(String.valueOf(textFile.charAt(i)));
                }
            }
            System.out.println("\nТекст содержит " + count + " цифр и их сумма = " + sum);
        }
    }

}

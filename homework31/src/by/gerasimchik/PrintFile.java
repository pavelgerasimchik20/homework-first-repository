package by.gerasimchik;
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrintFile {

    public boolean printToFile(String data, String fileName) {

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String textFile= JOptionPane.showInputDialog(null,"Enter your text: ");
        boolean result = new PrintFile().printToFile(textFile, "readme.txt");
        if (result) System.out.println("Finished");
        else System.out.println("Error");
    }

}

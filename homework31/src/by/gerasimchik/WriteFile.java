package by.gerasimchik;
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

    public boolean writeToFile(String data, String fileName) {

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void write () {
        String textFile= JOptionPane.showInputDialog(null,"Enter your text: ");
        boolean result = new WriteFile().writeToFile(textFile, "readme.txt");
        if (result) System.out.println("Finished");
        else System.out.println("Error");
    }

}

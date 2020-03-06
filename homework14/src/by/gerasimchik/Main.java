package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        int marks[] = new int[20];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 100);
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        int maxDigit = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxDigit < marks[i]) {
                maxDigit = marks[i];
            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (maxDigit == marks[i]) {
                System.out.println("Индекс элемента массива, содержащего мах элемент= " + i);
            }
        }

    }
}

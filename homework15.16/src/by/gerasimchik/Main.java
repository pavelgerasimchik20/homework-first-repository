package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        //ЗАДАНИЕ 15

        int sum = 0;
        int[] mass = {18, 0, 1, 2, 18, 2, 1, 0, 1, 10};
        for (int i = 1; i < mass.length - 1; i++) {
            sum += mass[i];
        }
        System.out.println("Сумма элементов массива (за исключением крайних)= " + sum);

        //Задание 16
        int[] fff = new int[15];
        for (int j = 0; j < fff.length; j++) {
            fff[j] = (int) (Math.random() * 10);
            System.out.print("|" + fff[j] + "| ");
        }
        System.out.println();
        for (int k = fff.length - 1; k >= 0; k--){
            System.out.print("|" + fff[k] + "| ");
        }
    }
}

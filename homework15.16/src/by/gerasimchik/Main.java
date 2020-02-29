package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        //ЗАДАНИЕ 15
        int sum = 0;
        int[] ggg = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
        for (int i = 1; i < ggg.length - 1; i++) {
            sum += ggg[i];
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

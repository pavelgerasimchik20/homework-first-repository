package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        // Задание 3
        int a = 55_288_455;
        if((a-7)%10==0)
           System.out.println("Последняя цифра этого числа = 7");
        else
           System.out.println("Последняя цифра этого числа не равна 7");
        //Задание 4
        int с=15;
        int b=25;
        int radius=17;
        if(radius>=(Math.sqrt(Math.pow(с,2)+Math.pow(b,2)))/2)
            System.out.println("Картонка с радиусом "+ radius + " полностью закроет отверстие");
        else
            System.out.println("Не закроет такая маленькая картонка ничего (((");
    }
}

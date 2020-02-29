package by.gerasimchik;

public class Main {

    public static void main(String[] args) {
        //Задание 17
        int x[][] = new int[5][5];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == 0) {
                    x[i][j] = 1;
                } else if (i == 1) {
                    x[i][1] = 1;
                    x[i][2] = 1;
                    x[i][3] = 1;
                } else if (i == 2) {
                    x[i][2] = 1;
                } else if (i==3){
                    x[i][1]=1;
                    x[i][2]=1;
                    x[i][3]=1;
                }else if (i==4){
                    x[i][j] = 1;
                }
                System.out.print(" `" + x[i][j] + "` ");
            }
            System.out.println();
        }
    }
}

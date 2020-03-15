package by.gerasimchik;

public class Bankomat {

    private int twentyDollar;
    private int fiftyDollar;
    private int hundredDollar;


    public Bankomat(int twentyDollar, int fiftyDollar, int hundredDollar) {
        this.twentyDollar = twentyDollar;
        this.fiftyDollar = fiftyDollar;
        this.hundredDollar = hundredDollar;
    }

    public void addCash(int banknote20, int banknote50, int banknote100) {
        System.out.println("Операция внесение денег в банкомат $$$ -------->>> ");
        twentyDollar += banknote20;
        fiftyDollar += banknote50;
        hundredDollar += banknote100;

    }

    public void showBanknote() {
        System.out.println("Остаток в банкомате : \n20$ : " + twentyDollar + "\n50$ : " + fiftyDollar + "\n100$ : " + hundredDollar);
    }

    public boolean takeMoney(int cash) {
        int sum = twentyDollar * 20 + fiftyDollar * 50 + hundredDollar * 100;
        if (cash > sum) {
            System.out.println("В банкомате НЕДОСТАТОЧНО средств. Макс. СУММА = " + sum);
            return false;
        } else if (cash == sum) {
            int tw = twentyDollar;
            twentyDollar -= twentyDollar;
            int fi = fiftyDollar;
            fiftyDollar -= fiftyDollar;
            int hu = hundredDollar;
            hundredDollar -= hundredDollar;
            System.out.println("Выданы купюры: \n 20$ : " + tw + "\n50$ : " + fi + "\n100$ : " + hu);
            return true;
        } else if (cash % 10 != 0) {
            System.out.println("Некорректная сумма. Мин.купюра 20$");
            return false;
        } else {
            int hu = cash / 100;     //полное количество соток
            if (hu >= hundredDollar ) {
                int hun = hundredDollar;
                hundredDollar -= hun-1;  //выдача всех соток
                cash -= (hun-1) * 100;
                int fi = cash / 50; //полное количество полтосиков
                if (fi > fiftyDollar) {
                    int fif = fiftyDollar;
                    fiftyDollar -= fif; //выдача всех 50-ок
                    cash -= fif * 50;
                    int tw = cash / 20;
                    twentyDollar -= tw;   //выдача 20-ок
                    System.out.println("Выданы купюры: \n 20$ : " + tw + "\n50$ : " + fif + "\n100$ : " + hun);
                } else {
                    fiftyDollar -= fi;
                    cash -= fi * 50;
                    int tw = cash / 20;
                    twentyDollar -= tw;
                    System.out.println("Выданы купюры: \n 20$ : " + tw + "\n50$ : " + fi + "\n100$ : " + hu);
                }

            } else {
                hundredDollar -= hu;
                cash -= hu * 100;
                int fi = cash / 50;
                fiftyDollar -= fi;
                cash -= fi * 50;
                int tw = cash / 20;
                twentyDollar -= tw;
                System.out.println("Выданы купюры: \n 20$ : " + tw + "\n50$ : " + fi + "\n100$ : " + hu);
            }
        }
        return true;
    }
}



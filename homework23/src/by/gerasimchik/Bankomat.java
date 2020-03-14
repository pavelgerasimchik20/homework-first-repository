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
        twentyDollar += banknote20;
        fiftyDollar += banknote50;
        hundredDollar += banknote100;
    }

    public void showBanknote() {
        System.out.println("Остаток в банкомате : \n20$ : " + twentyDollar + "\n50$ : " + fiftyDollar + "\n100$ : " + hundredDollar);
    }

    public boolean takeMoney(int Cash) {
        if (Cash % 20 != 0) {
            System.out.println("НЕКОРРЕКТНАЯ СУММА!!! Минимальная купюра 20$");
            return false;
        } else {
            int a = (Cash - (Cash % 100)) / (100);
            hundredDollar -= a;
            fiftyDollar -= 0;
            Cash = Cash % 100;
            int b = Cash / 20;
            twentyDollar -= b;
            System.out.println("Выданы купюры: \n 20$ : " + b + "\n50$ : " + 0 + "\n100$ : " + a);
            return true;
        }
    }
}

package by.gerasimchik;

public class Time {

    private int sec;
    private int min;
    private int hours;
    private int fullSEC;
    private int num;

    public Time(int sec, int min, int hours, int num) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
        this.num = num;
    }

    public Time(int fullSEC, int num) {
        this.fullSEC = fullSEC;
        this.num = num;
    }

    public int giveMeFullSec() {
        if (fullSEC != 0) {
            return fullSEC;
        } else {
            return sec + (min * 60) + (hours * 3600);
        }
    }

    public static boolean AreEqual(Time time1, Time time2) {
        return (time1.giveMeFullSec() == time2.giveMeFullSec());
    }

    @Override
    public String toString() {
        return "Значение в объекте "+ num + " = "+
                "interval{" +
                "секунды ='" + sec + '\'' +
                ", минуты ='" + min + '\'' +
                ", часы ='" + hours + '\'' +
                ", время в секундах =" + fullSEC +
                '}';
    }
}

package by.gerasimchik;

public class Time {

    private int sec;
    private int min;
    private int hours;
    private int fullSEC;

    public Time() {

    }

    public Time(int sec, int min, int hours) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    public Time(int fullSEC) {
        this.fullSEC = fullSEC;
    }


    public int giveMeFullSec() {
        if (fullSEC!=0) {
            return fullSEC;
        } else {
            int SEC = sec + (min * 60) + (hours * 3600);
            return SEC;
        }
    }

    public static boolean AreEqual(Time time1, Time time2) {
        return (time1.giveMeFullSec() == time2.giveMeFullSec());
    }

}

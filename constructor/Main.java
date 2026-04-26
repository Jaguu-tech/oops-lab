class Time {
    int hours;
    int minutes;

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}

class AdvanceTime extends Time {

    int seconds;
    int milliseconds;

    AdvanceTime(int hours, int minutes, int seconds, int milliseconds) {
        super(hours, minutes);
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }

    public AdvanceTime add(AdvanceTime other) {

        int newhours = this.hours + other.hours;
        int newminutes = this.minutes + other.minutes;
        int newseconds = this.seconds + other.seconds;
        int newmilliseconds = this.milliseconds + other.milliseconds;

        if (newmilliseconds >= 1000) {
            newseconds += newmilliseconds / 1000;
            newmilliseconds %= 1000;
        }

        if (newseconds >= 60) {
            newminutes += newseconds / 60;
            newseconds %= 60;
        }

        if (newminutes >= 60) {
            newhours += newminutes / 60;
            newminutes %= 60;
        }

        return new AdvanceTime(newhours, newminutes, newseconds, newmilliseconds);
    }

    public AdvanceTime sub(AdvanceTime other) {

        int newhours = this.hours - other.hours;
        int newminutes = this.minutes - other.minutes;
        int newseconds = this.seconds - other.seconds;
        int newmilliseconds = this.milliseconds - other.milliseconds;

        if (newmilliseconds < 0) {
            newmilliseconds += 1000;
            newseconds--;
        }

        if (newseconds < 0) {
            newseconds += 60;
            newminutes--;
        }

        if (newminutes < 0) {
            newminutes += 60;
            newhours--;
        }

        return new AdvanceTime(newhours, newminutes, newseconds, newmilliseconds);
    }

    void call() {
        System.out.println(hours + " hours " + minutes + " minutes "
                + seconds + " seconds " + milliseconds + " milliseconds");
    }
}

public class Main {
    public static void main(String[] args) {

        AdvanceTime t5 = new AdvanceTime(2, 30, 40, 800);
        AdvanceTime t6 = new AdvanceTime(1, 20, 30, 500);

        System.out.print("Time 1: ");
        t5.call();

        System.out.print("Time 2: ");
        t6.call();

        AdvanceTime sum = t5.add(t6);
        System.out.print("Addition: ");
        sum.call();

        AdvanceTime diff = t5.sub(t6);
        System.out.print("Subtraction: ");
        diff.call();
    }
}
 
    
 

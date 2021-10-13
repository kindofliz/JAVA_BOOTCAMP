package lesson6;

import lesson6.clockfeatures.domain.Hour;

public class Application {
    public static void main(String[] args) {

        DigitalClock digitalClock = new DigitalClock();

        String currentTime = digitalClock.showTime();

        System.out.println(currentTime);
        Hour hour = digitalClock.getTimeClock().getHour();


    }
}

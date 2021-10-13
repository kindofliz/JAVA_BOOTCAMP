package lesson6.clockfeatures;

import lesson6.clockfeatures.domain.Hour;
import lesson6.clockfeatures.domain.Minute;
import lesson6.clockfeatures.domain.Second;

public class TimeClock {

    private Hour hour;
    private Minute minute;
    private Second second;

    public TimeClock() {
    }

    public TimeClock(Hour hour, Minute minute, Second second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    public Minute getMinute() {
        return minute;
    }

    public void setMinute(Minute minute) {
        this.minute = minute;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }
}

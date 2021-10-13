package lesson6;

import lesson6.clockfeatures.Calendar;
import lesson6.clockfeatures.StopWatch;
import lesson6.clockfeatures.TimeClock;

public class DigitalClock {
    private TimeClock timeClock;
    private Calendar calendar;
    private StopWatch stopWatch;


    public DigitalClock() {
    }

    public DigitalClock(TimeClock timeClock, Calendar calendar, StopWatch stopWatch) {
        this.timeClock = timeClock;
        this.calendar = calendar;
        this.stopWatch = stopWatch;
    }


    public String showTime() {
        return String.valueOf(this.getTimeClock().getHour());
    }


    public TimeClock getTimeClock() {
        return timeClock;
    }

    public void setTimeClock(TimeClock timeClock) {
        this.timeClock = timeClock;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

    public void setStopWatch(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }
}

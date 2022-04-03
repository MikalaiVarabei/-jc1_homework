package homework.three.time;

public class IntervalTime {
    private final long secondsInterval;
    private final long hours;
    private final long minutes;
    private final long seconds;

    public IntervalTime(long secondsInterval) {
        this.secondsInterval = secondsInterval;
        hours = secondsInterval/3600;
        minutes = (secondsInterval - hours*3600)/60;
        seconds = secondsInterval - hours*3600 - minutes*60;
    }

    public IntervalTime(long seconds, long minutes, long hours) {
        secondsInterval = seconds + minutes*60 + hours*3600;
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public long getSecondsInterval() {
        return secondsInterval;
    }

    public long getSeconds(){
        return seconds;
    }

    public long getMinutes(){
        return minutes;
    }

    public long getHours(){
        return hours;
    }

    public Boolean ecualsTime(IntervalTime time){
        if(time == null) return null;
        return (this.secondsInterval == time.secondsInterval);
    }

    public long compareTimeTo(IntervalTime time){
        return (this.secondsInterval - time.secondsInterval);
    }

    public String getStrTime() {
        String sec = (seconds > 10) ? ("" + seconds) : ("0"+seconds);
        String min = (minutes > 10) ? ("" + minutes) : ("0"+minutes);
        String time = hours+":"+min+":"+sec;
        return time;
    }
}

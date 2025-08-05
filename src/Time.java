public class Time {
    int hour;
    int minute;
    int second;

    public Time(){}
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public long elapsedTime(){
        return 0;
    }
}

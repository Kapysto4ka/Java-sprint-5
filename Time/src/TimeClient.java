public class TimeClient implements ClientTime {
    int day;
    int sday = 21;
    int shour = 19;
    int sminute = 25;

    int hour;
    int minute;
    @Override
    public void setStandartTime() {
        day = sday;
        hour = shour;
        minute = sminute;
    }

    @Override
    public void setTime(int day, int hour, int minute) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public void getTime() {
        System.out.println("Day: "+ day +". Time: " +hour+':'+minute);
    }

    @Override
    public void notifyme() {
        System.out.println("I'll let you know in 5 minutes");
    }

    @Override
    public void resttime() {
        System.out.println("You need to rest in 30 minutes");
    }
}
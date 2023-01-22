public class Main {
    public static void main(String[] args) {
        TimeClient timeClient = new TimeClient();
        timeClient.setTime(12,16,15);
        timeClient.getTime();
        timeClient.setStandartTime();
        timeClient.getTime();
        timeClient.resttime();
        timeClient.notifyme();

    }
}
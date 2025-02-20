package dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class time {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time: " + nowTime);

        LocalTime specificTime = LocalTime.of(10, 30, 0);
        System.out.println("Specific time: " + specificTime);

        System.out.println("Hour: " + nowTime.getHour());
        System.out.println("Minute: " + nowTime.getMinute());

        LocalTime laterTime = nowTime.plus(30, ChronoUnit.MINUTES);
        System.out.println("Time after 30 minutes is: " + laterTime);

    }
}

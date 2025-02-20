package dateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime nowZone = ZonedDateTime.now(ZoneId.of("Asia/Kathmandu"));
        System.out.println("Current time in kathmandu: " + nowZone);

        ZonedDateTime londonTime = nowZone.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Equivalent time in London: " + londonTime);
    }
}

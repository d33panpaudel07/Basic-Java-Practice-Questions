package dateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class instantAndDuration {
    public static void main(String[] args) {
        Instant nowInstant = Instant.now();
        System.out.println("Current instant: " + nowInstant);

        LocalTime nowTime = LocalTime.now();
        LocalTime nextTime = LocalTime.now().plus(30, ChronoUnit.MINUTES);
        LocalDate nowDate = LocalDate.now();
        LocalDate nextDate = LocalDate.now().plus(1, ChronoUnit.DAYS);

        Duration timeDifference = Duration.between(nowTime, nextTime);
        System.out.println("Time difference: " + timeDifference);

        Period periodBetween = Period.between(nowDate, nextDate);
        System.out.println("Period between is: " + periodBetween);

        long daysBetween = ChronoUnit.DAYS.between(nowDate, nextDate);
        System.out.println("Days between (precise): " + daysBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(nowTime, nextTime);
        System.out.println("Minutes between (precise): " + minutesBetween);
    }
}

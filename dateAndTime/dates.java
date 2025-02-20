package dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class dates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalDate specificDate = LocalDate.of(2025, 12, 25);
        System.out.println("Specific date is: " + specificDate);

        System.out.println("Date of week is: " + today.getDayOfWeek());
        System.out.println("Date of month is: " + today.getDayOfMonth());
        System.out.println("Date of year is: " + today.getDayOfYear());

        // LocalDate nextWeek = today.plusWeeks(1);
        // System.out.println("Next week is in: " + nextWeek);
        System.out.println("Next week is in: " + today.plus(1, ChronoUnit.WEEKS));

    }
}

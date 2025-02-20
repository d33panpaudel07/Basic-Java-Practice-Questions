package dateAndTime;

import java.time.LocalDateTime;

public class localDateTime {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("LocalDate time currently is: " + nowDateTime);

        LocalDateTime specifLocalDateTime = LocalDateTime.of(2026, 2, 25, 7, 0, 0);
        System.out.println("Specific time is: " + specifLocalDateTime);

        System.out.println("Date part: " + nowDateTime.toLocalDate());
        System.out.println("Time part: " + nowDateTime.toLocalTime());

        LocalDateTime nextDay = nowDateTime.plusDays(1);
        System.out.println("Next day is: " + nextDay);
    }
}

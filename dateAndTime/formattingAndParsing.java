package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class formattingAndParsing {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.US);
        String formattedDateTime = nowDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        LocalDateTime parsDateTime = LocalDateTime.parse("2024-07-27 15:30:00", formatter);
        System.out.println("Parsed date and time of US: " + parsDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.UK);
        String formattedDateUk = today.format(formatter2);
        System.out.println("Formatted date and time of UK: " + formattedDateUk);

        LocalDate parsedDateUk = LocalDate.parse("25/12/2024", formatter2);
        System.out.println("Parsed date (UK): " + parsedDateUk);
    }
}

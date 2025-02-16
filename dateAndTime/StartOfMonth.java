package dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StartOfMonth {
    // Define the limits
    private static final int DAILY_LIMIT = 100;
    private static final int WEEKLY_LIMIT = 500;
    private static final int YEARLY_LIMIT = 1000;

    // Track the number of transactions
    private static int dailyTransactionCount = 0;
    private static int weeklyTransactionCount = 0;
    private static int yearlyTransactionCount = 0;

    // Track the start dates for day, week, and year
    private static LocalDate startOfDay = LocalDate.now();
    private static LocalDate startOfWeek = LocalDate.now();
    private static LocalDate startOfYear = LocalDate.now();

    public static void main(String[] args) {
        // Simulate transactions
        for (int i = 0; i < 1050; i++) {
            if (performTransaction()) {
                System.out.println("Transaction " + (i + 1) + " successful.");
            } else {
                System.out.println("Transaction " + (i + 1) + " failed: Limit exceeded.");
                break;
            }
        }
    }

    private static boolean performTransaction() {
        LocalDate currentDate = LocalDate.now();

        // Check if the day has changed and reset daily count
        if (!currentDate.isEqual(startOfDay)) {
            startOfDay = currentDate;
            dailyTransactionCount = 0;
        }

        // Check if the week has changed and reset weekly count
        if (ChronoUnit.WEEKS.between(startOfWeek, currentDate) >= 1) {
            startOfWeek = currentDate;
            weeklyTransactionCount = 0;
        }

        // Check if the year has changed and reset yearly count
        if (ChronoUnit.YEARS.between(startOfYear, currentDate) >= 1) {
            startOfYear = currentDate;
            yearlyTransactionCount = 0;
        }

        // Check limits
        if (dailyTransactionCount >= DAILY_LIMIT) {
            System.out.println("Daily limit reached.");
            return false;
        }
        if (weeklyTransactionCount >= WEEKLY_LIMIT) {
            System.out.println("Weekly limit reached.");
            return false;
        }
        if (yearlyTransactionCount >= YEARLY_LIMIT) {
            System.out.println("Yearly limit reached.");
            return false;
        }

        // Increment transaction counts
        dailyTransactionCount++;
        weeklyTransactionCount++;
        yearlyTransactionCount++;

        return true;
    }
}
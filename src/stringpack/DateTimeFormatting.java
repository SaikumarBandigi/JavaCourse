package stringpack;

import java.util.Date;

public class DateTimeFormatting {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // %tF: Formats date as "YYYY-MM-DD"
        System.out.printf("Date in yyyy-mm-dd format: %tF%n", currentDate);

        // %tT: Formats time as "HH:MM:SS"
        System.out.printf("Time in hh:mm:ss format: %tT%n", currentDate);

        // %tc: Formats complete date and time
        System.out.printf("Complete date and time: %tc%n", currentDate);

        // %tr: Formats time in 12-hour format with AM/PM
        System.out.printf("Time in 12-hour format: %tr%n", currentDate);

        // %tA: Formats full weekday name
        System.out.printf("Full weekday name: %tA%n", currentDate);

        // %tB: Formats full month name
        System.out.printf("Full month name: %tB%n", currentDate);

        // %td: Formats day of the month with leading zero
        System.out.printf("Day of the month with leading zero: %td%n", currentDate);

        // %tm: Formats month with leading zero
        System.out.printf("Month with leading zero: %tm%n", currentDate);

        // %ty: Formats year in two digits
        System.out.printf("Year in two digits: %ty%n", currentDate);
    }
}

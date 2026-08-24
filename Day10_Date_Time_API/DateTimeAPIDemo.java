import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIDemo {
    public static void main(String[] args) {

        // 1. Current Date, Time, and DateTime
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("1. Today's Date: " + today);
        System.out.println("2. Current Time: " + currentTime);
        System.out.println("3. Date & Time: " + currentDateTime);

        // 2. Manipulating Dates (Adding/Subtracting Days, Months, Years)
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate previousMonth = today.minusMonths(1);
        System.out.println("4. Date Next Week: "
         + nextWeek);
        System.out.println("5. Date Last Month: " + previousMonth);

        // 3. Time Zone Handling (ZonedDateTime)
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("6. India Time: " + indiaTime);
        System.out.println("7. UTC Time (Server Standard): " + utcTime);

        // 4. Formatting Dates (Custom Display)
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentDateTime.format(customFormat);
        System.out.println("8. Formatted Date: " + formattedDate);

        // 5. Parsing String back to LocalDateTime
        String dateString = "24-08-2026 10:15:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, customFormat);
        System.out.println("9. Parsed DateTime: " + parsedDateTime);
    }
}
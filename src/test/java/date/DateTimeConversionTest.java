package date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeConversionTest {
    @Test
    public void localDateConversionTest() {
        Date now = new Date();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "6/06/2024";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        localDate = localDate.plusMonths(1);
        System.out.println(localDate);
    }
    @Test
    public void simpleDateFormatTest() {
        Date now = new Date();

        //This is just Date's toString method and doesn't involve SimpleDateFormat
        System.out.println("toString(): " + now);  // dow mon dd hh:mm:ss zzz yyyy
        //Shows  "Mon Oct 08 08:17:06 EDT 2012"

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1:   " + dateFormatter.format(now));
        // Shows  "Mon, 2012-10-8 at 8:17:6 AM EDT"

        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2:   " + dateFormatter.format(now));
        // Shows  "Mon 2012.10.08 at 08:17:06 AM EDT"

        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3:   " + dateFormatter.format(now));

        dateFormatter = new SimpleDateFormat("EEEE, d MMM yyyy");
        System.out.println("Format 4:   " + dateFormatter.format(now));

        dateFormatter = new SimpleDateFormat("d");
        System.out.println("Format 5:   " + dateFormatter.format(now));
        // Shows  "Monday, October 8, 2012"

        // SimpleDateFormat can be used to control the date/time display format:
        //   E (day of week): 3E or fewer (in text xxx), >3E (in full text)
        //   M (month): M (in number), MM (in number with leading zero)
        //              3M: (in text xxx), >3M: (in full text full)
        //   h (hour): h, hh (with leading zero)
        //   m (minute)
        //   s (second)
        //   a (AM/PM)
        //   H (hour in 0 to 23)
        //   z (time zone)
        //  (there may be more listed under the API - I didn't check)
    }
    private static final ZoneId australiaSyd = ZoneId.of("Australia/Sydney");
    @Test
    public void localDateTimeTest() {
        String dateTimeString = "2024-10-15T15:30:10.000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println(">> " + localDateTime.toString());
    }
}

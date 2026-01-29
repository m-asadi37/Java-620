import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main1(String[] args) throws InterruptedException, ParseException {
        Date now = new Date();
        System.out.println(now);

        System.out.println(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(1000 * 60 * 60 * 24);
        System.out.println(date1);

        long time1 = System.currentTimeMillis() - 24 * 60 * 60 * 1000;
        Date yesterday = new Date(time1);
        System.out.println(yesterday);

        System.out.println(yesterday.after(now));

        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(yesterday.getDay());

        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
        Date userDate = formatter.parse(dateStr);
        System.out.println(userDate);

        String str1 = formatter.format(now);
        System.out.println(str1);
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 10, 16);
        System.out.println(date1);

        LocalDateTime dateTime = date1.atTime(10, 15);
        System.out.println(dateTime);

        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

        System.out.println((dateTime.getMonth()));

        Instant inst1 = new Date().toInstant();
        System.out.println(inst1);

        LocalDateTime now = LocalDateTime.now();

        OffsetDateTime ofst = now.atOffset(ZoneOffset.of("-02:00"));
        System.out.println(ofst);
    }
}

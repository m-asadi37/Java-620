import com.github.mfathi91.time.PersianDate;
import com.github.mfathi91.time.PersianMonth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
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

    public static void main2(String[] args) {
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

    public static void main3(String[] args) {
        Instant ins = Instant.now();
        System.out.println(ins);

        OffsetDateTime oft = ins.atOffset(ZoneOffset.of("+03:30"));
        System.out.println(oft);

        ZonedDateTime zdt = ins.atZone(ZoneId.of("Asia/Tehran"));
        System.out.println(zdt);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        String str = dateTime.format(formatter);
        System.out.println(str);

        LocalDateTime dateTime1 = LocalDateTime.parse("2026-02-01 18:50:36", formatter);
        System.out.println(dateTime1);
    }

    public static void main(String[] args) {
// Instantiate
        PersianDate today = PersianDate.now();
        PersianDate persianDate1 = PersianDate.of(1396, 7, 15);
        PersianDate persianDate2 = PersianDate.of(1396, PersianMonth.MEHR, 15);

// Convert
        PersianDate persianDate5 = PersianDate.of(1397, 5, 11);
        LocalDate gregDate = today.toGregorian();    // => '2018-08-02'
        PersianDate persianDate6 = PersianDate.fromGregorian(gregDate);  //  => '1397/05/11'

// Parse
        PersianDate persianDate3 = PersianDate.parse("1400-06-15");    // From the standard format
        PersianDate persianDate4 = PersianDate.parse("1400/06/15", DateTimeFormatter.ofPattern("yyyy/MM/dd"));    // From a desired format

// Format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String s1 = dtf.format(PersianDate.now());    // => e.g. '1396/05/10'
        System.out.println(s1);
    }
}

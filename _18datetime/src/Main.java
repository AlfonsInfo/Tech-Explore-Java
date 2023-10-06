import java.sql.SQLOutput;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //implementDate();
        //implementCalendarDate();
        //implementTimeZone();
        //implyCalendarTimeZone();
        //implyLocalDate();
        //implyLocalTime();
        //implyLocalDateTime();
        //implyYear_YearMonth_Month_Day();
        //implyZoneId();
        //implyZoneOffSet();
        //LocalDateTime, etc diatas tidak ada informasi timezone, secara default tidak ada informasi time zone
        //yyyy-MM-ddTHH:mm:ss.nanoZoneOffset[ZoneId, dimana ZoneId tidak wajib
        //implyDateTimeZone();
        //implyOffSet
        //implyInstant();
        //implyClock();
        //implyDuration();
        //implyPeriod() -> untuk tanggal
        //Temporal ->  kontrak dari API-API diatas
        //DayOfWeek
        //Parsing & Formaatting
        //Legacy Date
    }

    private static void implyDuration() {
        //waktu
        Duration duration50Hours = Duration.ofHours(50);
        System.out.println(duration50Hours.toDays());
        Duration durationbetween2LocalTime = Duration.between(LocalTime.of(10,10),LocalTime.of(20,20));
        System.out.println(durationbetween2LocalTime.toHours());
    }

    private static void implyClock() throws InterruptedException {
        Clock clockUTC= Clock.systemUTC();
        Clock clockSystem = Clock.systemDefaultZone();
        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(clockUTC);
        System.out.println(clockSystem);
        System.out.println(clockJakarta);

        Instant instantJakarta = clockJakarta.instant();
        Thread.sleep(1_000);
        Instant instantUTC = clockUTC.instant();

        System.out.println(instantJakarta);
        System.out.println(instantUTC);
        // instant representasi waktu yang tidak berpengaruh pada zona waktu yang sama

        LocalDateTime localDateTime = LocalDateTime.now(clockJakarta);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clockJakarta);
        ZonedDateTime zoneUtc = ZonedDateTime.now(clockUTC);

        System.out.println(zoneUtc); //instant yang sama, jika dikonversi bisa menghasilkan angka yang berbeda.
        System.out.println(localDateTime); //otomatis mengikuti timezone dari clock
        System.out.println(zonedDateTime);
    }

    private static void implyInstant() {
        //Time Zone instant menggunakan timezone utc (00:00)
        //Representasi timestamp
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());

        System.out.println(instant1);
        System.out.println(instant2);
    }

    private static void implyDateTimeZone() {
        ZonedDateTime zoneDateTimeNow = ZonedDateTime.now();
        ZonedDateTime ZoneDateTimeParse = ZonedDateTime.parse("1980-10-10T10:10:10+07:00[Asia/Jakarta]");
        System.out.println(zoneDateTimeNow);
        System.out.println(ZoneDateTimeParse);
        System.out.println(ZoneDateTimeParse.withDayOfMonth(12).withZoneSameLocal(ZoneId.of("GMT"))); // Ganti label aja
        System.out.println(ZoneDateTimeParse.withDayOfMonth(12).withZoneSameInstant(ZoneId.of("GMT")));//Real Di dunia nyata
    }

    private static void implyZoneOffSet() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(-7,-30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }

    private static void implyZoneId() {
        ZoneId defaultSystemZoneId = ZoneId.systemDefault();
        ZoneId indonesiaZoneId = ZoneId.of("Asia/Jakarta");
        Set<String> availableZoneId = ZoneId.getAvailableZoneIds();

        System.out.println(defaultSystemZoneId);
        System.out.println(availableZoneId);
        System.out.println(indonesiaZoneId);
    }

    private static void implyYear_YearMonth_Month_Day() {
        Year year1 = Year.now();
        Year year2 =  Year.of(2023);
        Year year3 = Year.parse("2023");

        YearMonth yearMonth= YearMonth.now();
        YearMonth yearMonth1= YearMonth.of(2023,Month.DECEMBER);
        YearMonth yearMonth2= YearMonth.parse("2023-10");

        MonthDay monthDayNow= MonthDay.now();
        MonthDay monthDayParse= MonthDay.parse("--10-10");
        MonthDay monthDay= MonthDay.of(Month.JULY, 10);
    }

    private static void implyLocalDateTime() {
        LocalDate localDate = LocalDate.of(2012,12,12);
        LocalTime localTime = LocalTime.of(2012,12,12, 1200);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.JANUARY, 20,10 ,10,20,10);
        LocalDateTime localDateCombine = LocalDateTime.of(localDate,localTime);

        System.out.println(localDateTimeNow);
        System.out.println(localDateTime);
        System.out.println(localDateCombine);

        LocalDate localDateOnly = localDateTimeNow.toLocalDate();
        System.out.println(localDateOnly);

        //plus minus, with etc
    }

    private static void implyLocalTime() {
        //LocalTime implementasi waktu tanpa tanggal
        //HH mm ss.nano (ss.nano optional)
        //HH:mm:ss.nano
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeSetTime =  LocalTime.of(12, 5);
        LocalTime localTimeParse = LocalTime.parse("12:05");

        System.out.println(localTime);
        System.out.println(localTimeSetTime);
        System.out.println(localTimeParse);
    }

    private static void implyLocalDate() {
        //Implementasi tanggal tanpa detail time
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateSetDate = LocalDate.of(2023, Month.SEPTEMBER, 10);
        LocalDate localDateParse = LocalDate.parse("2023-10-10");


        System.out.println(localDateNow);
        System.out.println(localDateParse);
        System.out.println(localDateSetDate);

        //with bosa chaining
        localDateNow = localDateNow.withMonth(12);

        System.out.println("LocalDateNow After update");
        System.out.println(localDateNow);
    }

    private static void implyCalendarTimeZone() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendarWithTimeZone = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarWithTimeZone.get(Calendar.HOUR_OF_DAY));
    }

    private static void implementTimeZone() {
        //Time zone
        TimeZone timeZone = TimeZone.getDefault();
        List<String> availableTimeZone = Arrays.stream(TimeZone.getAvailableIDs()).toList();

        System.out.println(timeZone);
        availableTimeZone.forEach(System.out::println);
        TimeZone timeZoneJakarta = TimeZone.getTimeZone("Asia/Jakarta");
        System.out.println(timeZoneJakarta);
    }

    private static void implementCalendarDate() {
        //Calendar help to set date time
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 20);

        Date date3 = calendar.getTime();

        System.out.println(date3);
    }

    private static void implementDate() {
        //Old Date time
        System.out.println("Hello world!");
        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis());
        Date date2 = new Date(1231232132912L);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
    }
}
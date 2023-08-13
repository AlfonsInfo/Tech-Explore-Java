package _3datecalendar;

import java.util.Calendar;
import java.util.Date;

public class Main {

  public static void main(String[] args) {

        //DATE
//        Date tanggal = new Date();
//        System.out.println(tanggal);
//        System.out.println(tanggal.getTime());
//        System.out.println(System.currentTimeMillis());

        //CALENDAR
      Calendar calendar =Calendar.getInstance();
      System.out.println(calendar.getTime());
      calendar.set(Calendar.YEAR , 2030); //Static // Enum // Table
      calendar.add(Calendar.DATE, 5);
      System.out.println(calendar.getTime());
      Date date = calendar.getTime();

  }
}

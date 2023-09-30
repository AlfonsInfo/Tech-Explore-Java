package alfonslagibelajar.i8n;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat()
    {
        Locale locale = new Locale("id", "ID");
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern, locale);

        var format = dateFormat.format(new Date());

        System.out.println(format);
    }


    @Test
    void testCreateDateFromString()
    {
        String pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern,locale);
        try{
            Date date = dateFormat.parse("Sabtu 30 September 2023");
            System.out.println(date);
        }catch (Exception e){
            System.out.println("ERROR " + e.getMessage());
        }
    }
}

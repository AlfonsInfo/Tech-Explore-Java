package alfonslagibelajar.i8n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat()
    {
        // English Format
        var numberFormat = NumberFormat.getInstance();
        var Englishformat = numberFormat.format(100_000.23);
        System.out.println(Englishformat);


        // Indo Format
        Locale locale = new Locale("id", "ID");
        numberFormat = NumberFormat.getInstance(locale);
        var IndoFormat = numberFormat.format(100_000.23);
        System.out.println(IndoFormat);
    }
}

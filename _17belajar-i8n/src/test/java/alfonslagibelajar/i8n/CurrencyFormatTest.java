package alfonslagibelajar.i8n;

import org.junit.jupiter.api.Test;

import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatTest {

    @Test
    void testCurrencyIndo()
    {
        Locale indonesia = new Locale("id", "ID");
        Currency rupiahCurrency = Currency.getInstance(indonesia);

        System.out.println(rupiahCurrency.getDisplayName());
        System.out.println(rupiahCurrency.getCurrencyCode());
        System.out.println(rupiahCurrency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyAmerika()
    {
        Locale US = new Locale("en", "US");
        Currency usCurrency = Currency.getInstance(US);

        System.out.println(usCurrency.getDisplayName());
        System.out.println(usCurrency.getCurrencyCode());
        System.out.println(usCurrency.getSymbol(US));
    }
}

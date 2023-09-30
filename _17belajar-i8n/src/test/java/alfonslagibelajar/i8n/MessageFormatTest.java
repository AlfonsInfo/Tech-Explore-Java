package alfonslagibelajar.i8n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    public void testMessageFormat()
    {
        var pattern = "Hi {0}, Anda bisa mencari data Anda dengan megnetikan \"{0}\" di pencarian";
        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Alfons"
        });
        System.out.println(format);
    }


    @Test
    public void testMessageFormatCollabResourceBundle()
    {

        var indonesia = new Locale("id", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);
        var pattern = resourceBundle.getString("welcome.message");
        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Alfons", "Indonesia"
        });
        System.out.println(format);
    }


}

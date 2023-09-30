package alfonslagibelajar.i8n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    @Test
    void testResourceBundle(){
        var indonesia = new Locale("id","ID");
        var resourceBundle = ResourceBundle.getBundle("message",indonesia);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }
}

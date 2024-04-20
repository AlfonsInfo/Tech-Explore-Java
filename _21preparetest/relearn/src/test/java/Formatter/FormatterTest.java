package Formatter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Formatter;

public class FormatterTest {

    @Test
    public void formatterTest(){
        String formatResult = new Formatter().format("Value : %d", 10).toString();
        Assert.assertEquals("Value : 10", formatResult);
        //        formatter.format("%d"
    }
}

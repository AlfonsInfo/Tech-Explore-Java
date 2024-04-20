package Number;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class IntegerTest {

    @Test
    public void primitiveInteger(){
        Integer nonPrimitiveInt = null;
        Assert.assertThrows(NullPointerException.class, nullPrimitiveInt(nonPrimitiveInt));
    }

    @Test
    public void nonPrimtitiveInteger(){
        Integer integer = 10;
        Assert.assertEquals(-1,integer.compareTo(20)); // lebih kecil -> -1
        Assert.assertEquals(1,integer.compareTo(5)); // lebih besar -> 1
        Assert.assertEquals(0,integer.compareTo(10)); // sama  -> 0
        //* method-method konversi
    }

    private static ThrowingRunnable nullPrimitiveInt(Integer nonPrimitiveInt) {
        return () -> {
            int a = nonPrimitiveInt;
        };
    }

}

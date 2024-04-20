package String;


import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {
    @Test // java mencari value yang sama di string pool
    public void testStringEqualityBehaviour(){
        String input1 = new String("alfons");
        String input2 = new String("alfons");
        String input3 = "alfons";
        System.out.println("input 1 hashcode " + input1.hashCode());
        System.out.println("input 2 hashcode " + input2.hashCode());
        assertEquals(input1, input2); // .equals()
        assertNotSame(input1, input2); // ==
        assertNotSame(input2,input3);
    }

    @Test
    public void testStringStaticMethod(){
        assertEquals("3", String.valueOf(3));
        assertEquals("data 3.0", String.format("data %.1f", 3.0f));
    }
    //@Test(expected = NullPointerException.class)
    @Test
    public void testStringNullPointer(){
        final String input = null;
        final String variableComparison = "";
        assertThrows(NullPointerException.class, () -> input.equals(variableComparison));
    }

}

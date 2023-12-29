package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTest {

    @Test
    void testString(){
        String stringSatu= "isi";
        String stringDua = new String("isi");
        boolean isEquals = stringSatu.equals(stringDua);
        boolean isSameObjectReference = stringSatu == stringDua;

        Assertions.assertTrue(isEquals);
        Assertions.assertFalse(isSameObjectReference);

    }
}

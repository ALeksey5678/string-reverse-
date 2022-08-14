package com.company.reverse;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @org.junit.jupiter.api.Test
    void testGetReversedStringMethod() {
        Reverse reverse=new Reverse();
        assertEquals("dcba1",reverse.getReversed("abcd1"));
    }
}
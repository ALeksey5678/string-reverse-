package com.company.reverse;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
   static Reverse reverse;

    @BeforeAll
   static void prepeareData() {
        reverse = new Reverse();
    }

    @org.junit.jupiter.api.Test
    void testGetReversedStringMethod() {
        assertEquals("dcba1", reverse.getReversed("abcd1"));
    }
}
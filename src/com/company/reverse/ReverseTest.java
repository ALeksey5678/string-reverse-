package com.company.reverse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    Reverse reverse = new Reverse();

    @Test
    void stringShouldReturnReversedStringWithDigitsUnchanged() {
        assertEquals("dcba1", reverse.getReversed("abcd1"));
    }

    @Test
    void stringShouldReturnReversedStringWithDigitsSpacesSymbolsUnchanged() {
        assertEquals("!b1 !A2", reverse.getReversed("!A1 !b2"));
    }

    @Test
    void getException() {

        assertThrows(IllegalArgumentException.class, () -> {reverse.getReversed(null);});
    }

    @Test
    void shouldNotReplaceDigitsAndSymbols() {
        assertEquals("!1asd2!", reverse.getReversed("!1dsa2!"));
    }
}
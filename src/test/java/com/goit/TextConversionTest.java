package com.goit;

import org.junit.Test;

import static com.goit.TextConversion.conversionText;
import static org.junit.Assert.*;

public class TextConversionTest {
    @Test
    public void testTextConversion() {
        // Given
        String input = "Hello World!";
        // When
        final String result = conversionText(input);
        // Then
        final String expected = "HeLlO WoRlD!";
        assertEquals(expected, result);
    }
}
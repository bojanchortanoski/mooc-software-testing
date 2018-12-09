package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void singleNumberWithLowercaseString() {
        int result = roman.convert("v");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void notARomanNumeralInputConversion() {
        int result = roman.convert("GAMBIT");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testIntAsInput() {
        int result = roman.convert("55");
        Assertions.assertEquals(-1, result);
    }

//    @Test
//    public void testInvalidSequenceOfRomanNumerals() {
//        int result = roman.convert("VIIIII");
//        Assertions.assertEquals(-1, result);
//    }
}

package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    public void init() {
        caesarShiftCipher = new CaesarShiftCipher();
    }

    @Test
    public void testShiftByThreeSpaces() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcd", 3)).equals("defg"));
    }

    @Test
    public void testShiftByThreeSpaceWithTwoWords() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcd efgh", 3))
                .equals("defg hijk"));
    }

    @Test
    public void testWithEmptyString() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("", 3))
                .equals(""));
    }

    @Test
    public void testWithNoShift() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcd", 0))
                .equals("abcd"));
    }

    @Test
    public void testWithShiftBy26() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcd", 26))
                .equals("abcd"));
    }

    @Test
    public void testWithLargeShift() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcd", 52))
                .equals("abcd"));
    }

    @Test
    public void testWithNegativeShift() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcd", -26))
                .equals("abcd"));
    }

    @Test
    public void testWithInvalidCharacter() {
        Assertions.assertTrue((caesarShiftCipher.caesarShiftCipher("abcD", -26))
                .equals("invalid"));
    }
}

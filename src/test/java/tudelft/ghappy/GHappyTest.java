package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    private GHappy result;

    @BeforeEach
    public void init() {
        result = new GHappy();
    }

    @Test
    public void testWithOneLetterG() {
        Assertions.assertFalse(result.gHappy("g"));
    }

    @Test
    public void testWithInputOfAllGs() {
        Assertions.assertTrue(result.gHappy("ggggg"));
    }

    @Test
    public void testWithInputOfNoGs() {
        Assertions.assertFalse(result.gHappy("xxxx"));
    }

    @Test
    public void testFirstExampleGiven() {
        Assertions.assertTrue(result.gHappy("xxggxx"));
    }

    @Test
    public void testSecondExampleGiven() {
        Assertions.assertFalse(result.gHappy("xxgxx"));
    }

    @Test
    public void testThirdExampleGiven() {
        Assertions.assertFalse(result.gHappy("xxggyygxx"));
    }

    @Test
    public void testFirstExampleGivenUsingUpperAndLowerCaseLetters() {
        Assertions.assertTrue(result.gHappy("xXgGxX"));
    }

    @Test
    public void testWithEmptyString() {
        Assertions.assertFalse(result.gHappy(""));
    }
}

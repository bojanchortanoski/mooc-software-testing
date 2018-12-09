package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsWhereOneEndsWithR() {
        int words = new CountLetters().count("liver|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void noMatchingWords() {
        int words = new CountLetters().count("no|match|x");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void wordEndsInR() {
        int words = new CountLetters().count("liver");
        Assertions.assertEquals(1, words);
    }
}
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class WordCounterTest {
    WordCounter wordCounter = new WordCounter();

    @Test
    public void testSmallString() {
        int words = wordCounter.countWordsInString("This is a sample test file for MAven Practice");
        System.out.println("The given sentence has " + words + " words");
        assertTrue(words == 9);
    }

    @Test
    public void testWordCountEmpty() {
        int count = wordCounter.countWordsInString("test1");
        assertTrue(count == 1);
    }

    @Test
    public void testWordCountNull() {
        int count = wordCounter.countWordsInString("test2");
        assertTrue(count == 1);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = wordCounter.countWordsInString("this will be skipped");
        assertTrue(count == 3);

    }
}

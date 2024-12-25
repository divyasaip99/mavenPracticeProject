import org.junit.*;

import static org.junit.Assert.assertTrue;

public class WordCounterSpec {
    WordCounter wordCounter = new WordCounter();

    @Test
    public void testSmallString(){
        int words = wordCounter.countWordsInString("This is a sample test file for MAven Practice");
        System.out.println("The given sentence has "+words+" words");
        assertTrue(words==9);
    }

}

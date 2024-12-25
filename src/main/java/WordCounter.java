public class WordCounter {
    public int countWordsInString(String sentence){
        String[] seperatedWords = sentence.split(" ");
        return seperatedWords.length;

    }
}

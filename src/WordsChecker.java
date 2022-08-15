
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] text1 = text.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>(Arrays.asList(text1));
        return set.contains(word);
    }
}


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private Set<String> check;

    public WordsChecker(String text) {
        this.check = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    protected boolean hasWord(String word) {
        return check.contains(word);
    }

}
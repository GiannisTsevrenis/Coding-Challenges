import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);
        if (matcher.find()) {
            return matcher.start();
        } else {
            return -1;
        }
    }
}

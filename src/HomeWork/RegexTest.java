package HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void Regex() {
        String pattern = "[a-z]+";
        String text = "code 2 learn java tutorial";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }
}


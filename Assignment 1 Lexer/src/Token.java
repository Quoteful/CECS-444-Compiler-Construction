import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {
	TOK4 ("\\d+(\\.\\d+)?"),
	TOK3 ("\\d\\d"),
	TOK5  ("\"[^\"]+\""),
	TOK6  (","),
	TOK7  (";"),
	TOK10 ("prog"),
	TOK11 ("main"),
	TOK12 ("fcn"),
	TOK13 ("class"),
	
	TOK15 ("float"),
	TOK16 ("int"),
    TOK17 ("string"),
    TOK18 ("if"),
    TOK19 ("elseif"),
    TOK20 ("else"),
    TOK21 ("while"),
    TOK22 ("input"),
    TOK23 ("print"),
    TOK24 ("new"),
    TOK25 ("return"),
    TOK26 ("var"),
    
    TOK31 ("<"),
    TOK32 (">"),
    TOK33 ("\\{"),
    TOK34 ("\\}"),
    TOK35 ("\\["),
    TOK36 ("\\]"),
    TOK37 ("\\("),
	TOK38 ("\\)"),
	
	TOK41 ("\\*"),
	TOK42 ("\\^"),
	TOK43 ("\\:"),
	TOK44 ("\\."),
	TOK45 ("="),
	TOK46 ("-"),
	TOK47 ("\\+"),
	TOK48 ("/"),

	TOK51 ("->"),
	TOK52 ("=="),
	TOK53 ("!="),
	TOK54 ("<="),
	TOK55 (">="),
	TOK56 ("<<"),
	TOK57 (">>"),
	TOK2 ("\\w+");
	
    private final Pattern pattern;

    Token(String regex) { //regex pattern finder
        pattern = Pattern.compile("^" + regex);
    }
    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);
        if (m.find()) {
            return m.end();
        }
        return -1;
    }
}

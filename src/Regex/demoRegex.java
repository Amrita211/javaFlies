package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demoRegex {
    public static void main(String[] args) {
        String str = ".a";
        Pattern p  = Pattern.compile(str);
        Matcher match = p.matcher("sa");
        System.out.println(match.matches());

        System.out.println();
        System.out.println(Pattern.matches("[abc]","b"));// return true for character a or b or c i.e it matches only one character
        System.out.println(Pattern.matches("[^amc]","t")); // return true for any character except a or m or c
        System.out.println(Pattern.matches("[a-sA-G]","t")); // range for a character
        System.out.println(Pattern.matches("[MS][a-z]{5}","Sonica")); // string start from M or s followed by any small character of length 5 [return true for this]
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","mon78A")); // any character from a-z or A-Z or 0-9 but length should be 6
        System.out.println();
        // x or y or z occurs one time or not at all[zero times]
        System.out.println(Pattern.matches("[xyz]?","yy"));  // return false
        System.out.println(Pattern.matches("[xyz]","y")); // return true

        System.out.println();
        // x or y or z occur one or more than one time
        System.out.println(Pattern.matches("[xyz]+","xxxy"));// return true
        System.out.println(Pattern.matches("[xyz]+","")); // return false

        // x or y or z occur zero or many times
        System.out.println(Pattern.matches("[xyz]*",""));//return true
        System.out.println(Pattern.matches("[xyz]*","xncnnsj")); // return false [as other than pattern characters are ocurring]

        // matching number character
        System.out.println();
        System.out.println(Pattern.matches("\\d","8")); //Any digits, short of [0-9]
        System.out.println(Pattern.matches("\\D","8")); // Any non digit, short of[^0-9] // false
        System.out.println(Pattern.matches("\\D","a")); // return true

        // uninion and intersection
        System.out.println();
        System.out.println(Pattern.matches("[a-d[c-h]]","b")); // union[a-d or b-h , ] // true
        System.out.println(Pattern.matches("[c-h &&[e-l]]","f")); // intersection [c-h && e-l] // true
        System.out.println(Pattern.matches("[c-h &&[e-l]]","d")); // intersection // return false
    }
}

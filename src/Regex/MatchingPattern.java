package Regex;
import javax.swing.*;
import java.util.regex.*;
public class MatchingPattern {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abb");
        Matcher m = p.matcher("aabbaba");
        int cnt=0;
        while(m.find()){
            cnt++;
            System.out.println(m.start()+"  "+m.end()+"  "+m.group());  // m.group() [print the things which is matched]
            // m.end() returns the index+1 where the pattern found
        }
        System.out.println("NO. of matched patterns are : "+cnt);
    }
}

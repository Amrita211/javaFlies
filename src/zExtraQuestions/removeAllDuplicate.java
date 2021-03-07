package zExtraQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeAllDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            String str = s.next();
//            remove2("",str);
            System.out.println(removeDups(str));
        }
    }

    public static void remove2(String process,String unprocess){
        Set<Character> visited = new HashSet<>();
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        if(!visited.contains(ch)){
            visited.add(ch);
            remove2(process+ch,unprocess.substring(1));
        }
        else{
            remove2(process,unprocess.substring(1));
        }
    }
    public static String removeDups(String word) {
        Set<Character> chars = new HashSet<>();
        StringBuilder output = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (chars.add(ch)) {
                output.append(ch);
            }
        }
        return output.toString();
    }
//www.java67.com/2019/11/how-to-remove-duplicate-characters-from-string-in-java.html#ixzz6YZHWONDs
}

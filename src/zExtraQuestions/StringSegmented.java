package zExtraQuestions;
//Given an input string and a dictionary of words, find out if the input string can be segmented
// into a space-separated sequence of dictionary words
// Input:  ilikesamsung
//Output: Yes
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSegmented {

    private static Set<String> check = new HashSet<>();

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.next();
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                                     "man","mango","icecream","and",
                                     "go","i","like","ice","cream"};

        // adding array string elements in set
        for (String value: temp_dictionary){
            check.add(value);
        }

        System.out.println(isStrSegment("ilike"));
        System.out.println(isStrSegment("ilikecream"));
    }
    public static boolean isStrSegment(String str){
        if(str.length()==0){
            return true;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(check.contains(str.substring(0,i+1)) && isStrSegment(str.substring(i+1))){
                return true;
            }
        }
        return false;
    }
}

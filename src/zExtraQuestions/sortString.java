package zExtraQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(Sort(str));
    }

    public static String Sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

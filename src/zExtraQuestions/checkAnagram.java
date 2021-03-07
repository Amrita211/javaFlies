package zExtraQuestions;

import java.util.Scanner;

public class checkAnagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
//            String empty = s.nextLine();
            String str1 = s.next();
            String str2 = s.next();
            System.out.println(anagram(str1, str2));
        }

    }
    public static String anagram(String str1, String str2){
        str1.toLowerCase();
        str2.toLowerCase();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // storing the frequencies of characters of str1 in freq1
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            freq1[ch-'a']++;
        }
        // same for the str2
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            freq2[ch-'a']++;
        }
        // now comparing the frequecies of both string
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return "NO";
            }
        }
        return "YES";
    }
}

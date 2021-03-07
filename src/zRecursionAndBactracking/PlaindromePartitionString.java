package zRecursionAndBactracking;

import java.util.Scanner;

public class PlaindromePartitionString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        solution(str,"");
    }
    public static void solution(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <str.length() ; i++) {
            String prefix = str.substring(0,i+1);
            String restStr = str.substring(i+1);
            if(isPalindrome(prefix)){
                solution(restStr,ans+"("+prefix+")");
            }
        }
    }
    public  static  boolean isPalindrome(String str){
        int start =0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return  false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}

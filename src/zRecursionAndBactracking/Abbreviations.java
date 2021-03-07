package zRecursionAndBactracking;

import java.util.Scanner;

// given a string , we have to find its abbreviation
// example: "pep"
/*
abbreviations are:
pep
p
 */
public class Abbreviations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        solution(str,"",0,0);
    }
    public static void solution(String str, String ans, int count, int pos){
        if(pos==str.length()){
            if(count==0){
                System.out.println(ans);
            }
            else {
                System.out.println(ans+count);
            }
            return;
        }
        // for accepting the character
        if(count>0){
            solution(str,ans+count+str.charAt(pos),0,pos+1);
        }
        else{
            solution(str,ans+str.charAt(pos),0,pos+1);
        }
        // for not accepting the character
        solution(str,ans,count+1,pos+1);
    }
}

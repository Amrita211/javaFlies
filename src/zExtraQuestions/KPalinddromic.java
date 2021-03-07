package zExtraQuestions;
// not completed yet !
import java.util.Scanner;

public class KPalinddromic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int k = s.nextInt();
        isKPlaindrome(str,k);
    }
    public static boolean isKPlaindrome(StringBuilder str, int k){
        if(str.length()<2){
            return  true;
        }
        StringBuilder temp = str;
        int start = 0;
        int end = temp.length()-1;
        while(start<end && k>0){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                temp.deleteCharAt(start);
                isKPlaindrome(temp,k--);

            }
        }
        return true;
    }
}

package zExtraQuestions;

import java.util.*;
class countVowelsSubstr {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long count =0;
            String emp = sc.nextLine();
            String s = sc.nextLine();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U') {
                    count+= (long)(s.length()-j)*(j+1);
                }
            }
            System.out.println(count);
        }
    }
}


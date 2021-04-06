package zHackerearth;

import java.util.Scanner;

public class pruposal {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            String guyName = s.nextLine();
            String crushName = s.nextLine();
            int m = guyName.length();
            int n = crushName.length();
            char[] guyArray = guyName.toCharArray();
            char[] crushArray = crushName.toCharArray();
            boolean check = IsSequence(guyArray,crushArray, m , n);
            if(check){
                System.out.println("Love you too");
            }
            else{
                System.out.println("We are only friends");
            }
        }
    }
    public static boolean IsSequence(char[] guyArray, char[] crushArray, int m , int n){
        int j=0;
        for(int i=0; i<n && j<m ; i++){  // loop in crush Array
            if(guyArray[j]==crushArray[i]){
                j++;
            }
        }
        if(j==m){
            return true;
        }
        else{
            return false;
        }
    }
}

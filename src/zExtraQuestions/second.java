package zExtraQuestions;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if(a>=b && a>=c){
                if(b>=c){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }

            else if(b>=a && b>=c){
                if(a>=c){
                    System.out.println(a);
                }
                else{
                    System.out.println(c);
                }
            }

            else if(a>=b){
                System.out.println(a);
            }
            else if(b>=a){
                System.out.println(b);
            }
        }
    }
}

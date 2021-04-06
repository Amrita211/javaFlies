package pepcoding;

import java.util.Scanner;

public class Zpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printZ(n);
    }
    public static void printZ(int n ){
        int row =1;
        while(row<=n){
            if(row==1 || row ==n){
                for (int i = 1; i <=n ; i++) {
                    System.out.print("* ");
                }
            }
            else{
                int space=1;
                while(space<n-row){
                    System.out.print("  ");
                    space+=1;
                }
                System.out.print(" * ");
            }
            System.out.println();
            row++;
        }
    }
}

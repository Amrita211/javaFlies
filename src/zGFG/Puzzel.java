package zGFG;

import java.util.Scanner;

//Check whether jigsaw puzzle solveable or not
public class Puzzel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        if(row==1 || col ==1 ){
            System.out.println("yes, it is solvable");
        }
        else if (row ==2 && col== 2){
            System.out.println("yes, its not solvable");
        }
        else{
            System.out.println("not solvabale");
        }
    }
}

package Recursions;

import java.util.Scanner;

public class mazePath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int desRow =s.nextInt();
        int desCol=s.nextInt();
        findPath("",1,desRow, 1,desCol);
    }
    public static void findPath(String process, int srcRow, int desRow, int srcCol, int desCol){
        if(srcRow>desRow || srcCol>desCol){
            return;
        }
        if(srcRow==desRow && srcCol==desCol){
            System.out.println(process);
            return;
        }
        findPath(process+"H",srcRow,desRow,srcCol+1,desCol);
        findPath(process+"V",srcRow+1,desRow,srcCol,desCol);
    }
}

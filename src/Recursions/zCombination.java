package Recursions;

import java.util.Scanner;

public class zCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nboxes = s.nextInt();
        int rItems = s.nextInt();
        findCombi(1,nboxes,0,rItems," ");
    }
    public static void findCombi(int currBox, int totalBox, int currSelection, int totalSelection, String combi){
        if(currBox>totalBox){
            if(currSelection==totalSelection){
                System.out.println(combi);
            }
            return;
        }
        findCombi(currBox+1,totalBox,currSelection+1,totalSelection,combi+"i");
        findCombi(currBox+1,totalBox,currSelection, totalSelection,combi+"-");
    }
}

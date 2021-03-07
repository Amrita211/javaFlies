package Recursions;

import java.util.Scanner;

public class zpermutation2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // no.of boxes
        int r = s.nextInt(); // no. of items
        int[] ritems = new int[r];
        permuteFromCombConcept(1,n,0,r,ritems,"");
    }
    public static void permuteFromCombConcept(int currBox, int totalBoxes, int currSel, int totalSel, int[] ritems, String ans){
        if(currBox>totalBoxes){
            if(currSel==totalSel){
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i <ritems.length ; i++) {
            if(ritems[i]==0){
                ritems[i]=1;
                permuteFromCombConcept(currBox+1,totalBoxes,currSel+1,totalSel,ritems,ans+(i+1));
                ritems[i]=0;
            }
        }
        permuteFromCombConcept(currBox+1,totalBoxes,currSel,totalSel,ritems,ans+0);
    }
}

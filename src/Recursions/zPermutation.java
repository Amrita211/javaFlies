package Recursions;

import java.util.Scanner;

// find all the ways i.e permutation of putting r items in n boxes . nPr = ?
public class zPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] boxes = new int[n];
        int totalItem = s.nextInt();

        findPermute(boxes,1,totalItem);
    }
    public static void findPermute(int[] boxes, int currItem, int totalItem){
        if(currItem>totalItem){
            for (int i = 0; i <boxes.length ; i++) {
                System.out.print(boxes[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <boxes.length ; i++) {
            if(boxes[i]==0){
                boxes[i] = currItem;
                findPermute(boxes,currItem+1,totalItem);
                boxes[i] = 0;
            }
        }
    }
}

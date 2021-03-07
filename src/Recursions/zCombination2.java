package Recursions;

import java.util.Scanner;

public class zCombination2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] boxes = new boolean[n];
        int totalItems = s.nextInt();
        combi2(boxes,1,totalItems,-1);
    }
    public static void combi2(boolean[] boxes, int curritem , int totalItem, int lastBox){

        if(curritem>totalItem){
            for (int i = 0; i <boxes.length ; i++) {
                if(boxes[i]==true){
                    System.out.print("i");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }
        for (int b = lastBox+1; b <boxes.length ; b++) {
            if(boxes[b]==false){
                boxes[b]=true;
                combi2(boxes,curritem+1,totalItem,b);
                boxes[b]=false;
            }
        }
    }
}

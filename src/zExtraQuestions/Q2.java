package zExtraQuestions;

import java.util.LinkedList;
import java.util.Queue;

//How to find duplicate number on Integer array in Java?
// ex:- {0, 23,3, 1, 2,4, 3}, then duplicated number is 3 if there is only one duplicate
public class Q2 {
    public static void main(String[] args) {
        int[] ar ={0,23,3,45,1,3,2};
        System.out.println(findMissing(ar,ar.length));
    }
    public static int findMissing(int[] ar,int len){
        Queue<Integer> qu = new LinkedList<>();
        qu.add(ar[0]);
        for (int i = 1; i <=len ; i++) {

            if(qu.contains(ar[i])){
                return ar[i];
            }
            else{
                qu.add(ar[i]);
            }
        }
       return -1;
    }
}

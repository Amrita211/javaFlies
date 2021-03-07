package zExtraQuestions;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

// intersection of two arrays i.e  no common elements should print
public class Q4 {
    public static void main(String[] args) {
        int[] ar1 = {1,4,3,2,5,6,5};
        int[] ar2 = {2,7,8,5,4,12,5};

//        intersection(ar1, ar2);

        union(ar1, ar2);
    }
    public static void intersection(int[] ar1, int[] ar2){
        Queue<Integer> que= new LinkedList<>();
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar2.length ; j++) {
                if(ar1[i]==ar2[j]){
                    que.add(ar1[i]);
                    ar2[j]=-1;
                }
            }
        }
        for(Integer num:que){
            System.out.print(num+" ");
        }
    }

    // union of two arrays i.e print all elements of both arrays but common elements should print only once
    public static void union(int[] ar1, int[] ar2){
        Queue<Integer> que =new LinkedList<>();
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar2.length ; j++) {
                if(ar1[i]==ar2[j]){
                    que.add(ar1[i]);
                    ar2[j]=-1;
                    ar1[i]=-2;
                }
            }
        }
        for (int i = 0; i <ar2.length ; i++) {
            if (ar2[i] != -1) {
                que.add(ar2[i]);
            }
        }
            for (int j = 0; j <ar1.length ; j++) {
                if (ar1[j] != -2) {
                    que.add(ar1[j]);
                }
            }
            for (Integer num:que){
                System.out.print(num+" ");
            }
        }

}

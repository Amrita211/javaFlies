package zExtraQuestions;

import java.util.Arrays;

public class rowWiseSorting {
    public static void main(String[] args) {
        int[][] arr = { {77, 11, 22, 3},
                        {11, 89, 1, 12},
                        {32, 11, 56, 7},
                        {11, 22, 44, 33}};
        sortMatrix(arr,4,4);
    }
    public static void sortMatrix(int[][] arr, int row, int col){

    }
// pending hai code abhi !!!!
//    sorting algo to sort the each row
    public static  void sort(int[] ar){
        for (int i=0;i<ar.length-1;i++){
            for (int j = 0; j <ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}

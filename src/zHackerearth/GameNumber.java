package zHackerearth;

import java.util.Scanner;

public class GameNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for(int i =0; i<A.length; i++){
            A[i] = s.nextInt();
        }

        int i, j, k;
        for( i = 0; i < n; i++) {
            for( j = i+1; j < n; j++){
                if(A[i] < A[j]){
                    break;
                }
            }  // for j
            if(j != n) {
                for(k = j+1; k < n; k++) {
                    if(A[j] > A[k]){
                        break;
                    }
                }  // for k
                if(k != n){
                    System.out.print(A[k] + " ");
                }
                else{
                    System.out.print(-1 + " ");
                }
            }
            else{
                System.out.print(-1 + " ");
            }
        } // for i
    }
}

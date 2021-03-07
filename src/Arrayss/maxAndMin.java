package Arrayss;
// answer nahi aa raha hai .. its giving 0 for both max and min
import java.util.Scanner;

// find maximum and minimum using divide and conquer
public class maxAndMin {
    int max ;
    int min ;
    int[] arr;

    // initialising array
    public maxAndMin(int n, int[] arr){
        this.arr = arr;
//        arr = new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i] =(int) Math.round(Math.random() * 12 + 26); // random value
//        }
    }

    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
    public void MaxMin(){
        MaxMin(0,arr.length-1);
    }
    public void MaxMin(int start , int end){
        int max=0;
        int min=0;
        if(start==end){
            min = arr[start];
            max = arr[end];
        }
        else if(start==end-1){
            if(arr[start]>arr[end]){
                max = arr[start];
                min = arr[end];
            }
            else{
                min = arr[start];
                max = arr[end];
            }
        }
        else {
            int mid = (start + end) / 2;

            MaxMin(start, mid);
            int max1 = max;
            int min1 = min;
            MaxMin(mid + 1, end);

            if (max < max1) {
                max = max1;
            }
            if (min > min1) {
                min = min1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
    maxAndMin obj = new maxAndMin(6,arr);
    obj.MaxMin();
        System.out.println("maximum value is : "+obj.getMax());
        System.out.println("minimum value is : "+obj.getMin());

    }

}

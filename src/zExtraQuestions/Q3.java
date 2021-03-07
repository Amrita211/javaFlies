package zExtraQuestions;
//How to find largest and smallest number in unsorted array
public class Q3 {
    public static void main(String[] args) {
        int[] ar={23,21,45,3,4,56,1,223};
        System.out.println("largest number is:"+findlLargest(ar));
        System.out.println("Smallest number is:"+findSmallest(ar));
    }
    public static int findlLargest(int[] ar){
        int max=ar[0];
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }

    public static int findSmallest(int[] ar){
        int min=ar[0];
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }
}

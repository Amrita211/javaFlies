package Stringss;

//Given an array Arr of N positive integers, find K largest elements from the array.
// The output elements should be printed in decreasing order.

import java.util.*;

public class InterviewKLargestNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = s.nextInt();
        System.out.println("Enter the K value:");
        int k = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        KLargest(arr,k);

//        makeLargestnumber(arr);

        LargestNumber(arr);
    }
    public static void KLargest(int[] arr, int k){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 && k>0; i--,k--) {
            System.out.print(arr[i]+" ");
        }
    }
//    Given a list of non negative integers, arrange them in such a manner that they form the largest
//    number possible.The result is going to be very large, hence return the result in the form of a string.

//    ise comparator ki help se karna hoga tabhi hoga ..
    public static void makeLargestnumber(int[] arr){  // correct answer nhi aa raha hai !!!!
        ArrayList list = new ArrayList();
        for (int i = 0; i <arr.length ; i++) {
            list.add(Integer.toString(arr[i]));
        }
        Collections.sort(list);
        System.out.println();
        System.out.println("sorted list "+list);
        String result=" ";
        String zero="";
        for (int i = list.size()-1; i>=0; i--) {
            if(list.get(i)!="0"){
                result = result+list.get(i);
            }
            else{
                zero+=list.get(i);
            }
        }
        System.out.println(result+zero);
    }

//    another method using comparator .. giving correct output :-)
    public static void LargestNumber(int[] arr1){
        Vector<String> arr = new Vector<>(); // we can't take String array as comparator work for list not for any array
        for (int i = 0; i <arr1.length ; i++) {
            arr.add(Integer.toString(arr1[i]));
        }
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String X, String Y) {
                // first append Y at the end of X
                String XY=X + Y;
                // then append X at the end of Y
                String YX=Y + X;
                // Now see which of the two formed number is greater
                return XY.compareTo(YX)>0?-1:1 ;
            }
        });

        Iterator it = arr.iterator();
        while(it.hasNext())
            System.out.print(it.next());
    }
}

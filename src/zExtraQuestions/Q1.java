package zExtraQuestions;
//How to find the missing number in integer array of 1 to 100?
public class Q1 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        findMissing(ar,ar.length);
    }
    public static void findMissing(int[] ar, int len){
        int sumArr = 0;
        int sumActual = 0;
        for (int i = 0; i <len ; i++) {
            sumArr+=ar[i];
        }
        for (int i = 0; i <=len+1; i++) {
            sumActual+=i;
        }
        System.out.println(sumActual-sumArr);
    }

}

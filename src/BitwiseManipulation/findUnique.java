package BitwiseManipulation;


// find a unique number present in the array which occurs only once and there is only one unique number
public class findUnique {
    public static void main(String[] args) {
        int[] ar  ={1,1,2,5,7,7,6,2,4,4,5};
        int[] arr = {36,50,24,56,36,24,42,50};
//        unique(ar);
//        unique2(ar);
        twoUnique(arr);
    }
    public static void unique(int[] ar){

        int uni = ar[0];
        for(int i=0; i<ar.length-1;i++){
            uni = uni^ar[i+1];
        }
        System.out.println(uni);
    }

    // another method, xor of same number gives 0 and when we xor 0 with some number gives the that same number
    public static  void unique2(int[] arr){
        int uni =0;
        for (int val: arr){
            uni = uni^val;
        }
        System.out.println(uni);
    }

//     All repeating except two
//     All elements are same except two elements in an array , find that twp unique value
    public static void twoUnique(int[] arr){
        int xxory = 0;
        for (int val:arr){
            xxory = xxory ^ val;
        }
        int rsbm = xxory & -xxory;
        int x=0;
        int y=0;
        for (int val : arr){
            if((val &rsbm)==0){ // checing bits are off
                x = x^val;
            }
            else{
                y =y^val;
            }
        }
        // printing the x and y in incresing format
        if(x>y){
            System.out.println(x);
            System.out.println(y);
        }
        else{
            System.out.println(y);
            System.out.println(x);
        }
    }
}

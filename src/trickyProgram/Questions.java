package trickyProgram;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        adding two numbers withou '+' operator
//        int a = s.nextInt();
//        int b = s.nextInt();
//        System.out.println(a-(-b));

        addBitwise(5,6);
        subtract(6,-3);
    }
//    adding two numbers using bitwise operator
    public static void addBitwise(int x, int y ){
        while(y!=0){
            // carry now contains common
            // set bits of x and y
            int carry = x & y;

            // Sum of bits of x and
            // y where at least one
            // of the bits is not set
            x = x ^ y;

            // Carry is shifted by
            // one so that adding it
            // to x gives the required sum
            y = carry << 1;
        }
        System.out.println(x);
    }
//    subtraction without '-' operator
    public  static void subtract(int a , int b){
        System.out.println(a+(~b+1));
    }
}

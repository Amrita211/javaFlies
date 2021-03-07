package BitwiseManipulation;

import java.util.Scanner;

/* wirte a program to :
i) ON a particular bit i.e make that bit as 1
ii) OFF a particular bit i.e make that bit as 0
iii) toggle a particular bit i.e change the bit (0 to 1 or 1 to 0)
iv) check the bit i.e whether the partivular bit is ON (1) or OFF(0)
*/
public class simpleQues {
    public static void main(String[] args) {
        //Scanner s= new Scanner(System.in);
        int num =9; // s.nextInt();
        int on =2; // s.nextInt(); // bit you want to ON , OFF Toggle, check

        int onmask =(1<<on);
        System.out.println(num|onmask);

        int offmask = ~(1<<on);
        System.out.println(num&offmask);

        int toggle = (1<<on);
        System.out.println(num^toggle);

        int check = (1<<on);
        System.out.println((num&check)==0?false+": OFF hai":true+": ON hai"); // false is Off(0) and true is ON(1)

        // RSB Mask call the function
        findRSBMask(10);

        // call the function countSetBits
            countSetBits(7);

        // call the josephSolu function
        josephSolu(6);
        josephSolu(8);
    }

    // finding the RIGHT MOST SET BIT MASK( right most bit 1 set hona chaiye baaki saare bits 0 hona chahiye)

    public static void findRSBMask(int num){
        int rsb = (num & -num);
        System.out.println(Integer.toBinaryString(rsb));// print the value in binary form
        System.out.println(Integer.toBinaryString(num & (~num+1)));// give the same answer

       // note: 2's complement of x is -x or ~x+1(1's complement +1)
    }

    // KERNIGHANS Algorithm , use to find the set bits in a number
    // we can do an approach like running a loop through the bits and increse the counter when we find a set bit i.e 1 , but this is not a good approach
    // KERNIGHANS Algorithm directly count the set bits without going to the 0 bits
    // we use RSB Mask concept in this algo
    public static void countSetBits(int num){
        int count =0;
        while(num>0){
            int rsbm = (num & -num);
            count++;
            num = num - rsbm;
        }
        System.out.println("No. of set bits are: "+count);
    }

    /*JOSEPHUS PROBLEM ALGORITHM
        N number of soldiers standing in a circular form. Now, alternating soldiers are killed in every cycle.
         In ist cycle alternation start from secpond soldier. find the soldier who will remain alive at last.
         for ex: for n = 6 (1, 2,3,4,5,6) . answer is 5
         FORMULA to find this answer:
            i) n= 2^x + 1 where 2^x <=n and l will be remaining part of n
            ii) after finding l, answer will be 2*l+1 :)

    */

   public static void josephSolu(int num){
       int hp2 = powerOf2(num);
       int  l = num-hp2;
       System.out.println(2*l+1 +" : this soldier will remain alive after all alternative kills");
   }
   public static int powerOf2(int num){
       int i=1;
       while(i*2<=num){
           i=i*2;
       }
       return i;
   }
}
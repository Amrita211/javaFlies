package BitwiseManipulation;

import java.util.ArrayList;
import java.util.Scanner;

/*  finding all the gray codes for any N.
    for n=2, there are 4 gray codes [00, 01, 11, 10] at each next code there should be only bit changed !
*/
public class grayCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> grayCodes = findGrayCodes(n);
        for (String code : grayCodes){
            System.out.println(code);
        }
    }
    public static ArrayList<String> findGrayCodes(int n){
        if(n==1){
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }
        ArrayList<String> recursiveResult =findGrayCodes(n-1);
        ArrayList<String> myResult =new ArrayList<>();
        // loop for adding 0, and moving forward
        for (int i = 0; i <recursiveResult.size() ; i++) {
            String str = recursiveResult.get(i);
            myResult.add("0"+str);
        }
        // loop for adding 1 , but move reverse
        for (int i = recursiveResult.size()-1; i >=0 ; i--) {
            String str = recursiveResult.get(i);
            myResult.add("1"+str);
        }
        return myResult;
    }
}

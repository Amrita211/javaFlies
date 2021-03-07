package zExtraQuestions;

import java.util.Scanner;
// correct outpu for testcase on hackerearth but on submitting , getting run time error
public class bitsImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int x = s.nextInt();
            int count =0;
            for(int i=1; i<=x; i++){
                int res = x/i;
                int resCount =bitsCount(res);
                int iCount =bitsCount(i);

                if(resCount<=iCount){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static int bitsCount(int num){
        int cnt =0;
        while(num!=0){
            cnt++;
            num>>=1;
        }
        return cnt;
    }
}

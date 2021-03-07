package zExtraQuestions;

import java.util.Scanner;

public class recursionTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 2;
        int y=3;
        System.out.println(fun2(x,y));
    }
    public static int fun(int x, int y){
        if(y==0){
            return 0;
        }
        return (x+fun(x,y-1));
    }
    public static int fun2(int a , int b){
        if(b==0)
        {
            return 1;
        }
        return fun(a,fun2(a,b-1));
    }
}

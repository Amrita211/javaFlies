package zExtraQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class inpuTest {
//    public static void main(String[] args) throws Exception{
//        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the number of streets: ");
//        int street = Integer.parseInt(inp.readLine());
//        while(street-->0){
//            int NoBUilding = Integer.parseInt(inp.readLine());
//            int rupee = Integer.parseInt(inp.readLine());
//        }


//    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int turns = s.nextInt();
        int[] stoneAdded = new int[turns];
        int totalStones =0;
        for(int i=0; i<stoneAdded.length; i++){
            stoneAdded[i] = s.nextInt();
            totalStones+= stoneAdded[i];
        }
        int q  = s.nextInt();
        int[] queries = new int[q];
        for (int i = 0; i <q ; i++) {
            queries[i] = s.nextInt();
        }
        for (int i = 0; i <queries.length ; i++) {
            solution(stoneAdded,queries[i], totalStones);
        }
    }
    public static void solution(int[] stoneAdded, int positionX, int totalStones){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <stoneAdded.length ; i++) {
            int val = stoneAdded[i];
            for (int j = 0; j <val ; j++) {
                if(j%2==0){
                    stack.add('A');
                }
                else{
                    stack.add('B');
                }
            }
        }
        int positionFromStart = totalStones-positionX;
        System.out.println(stack.get(positionFromStart));
    }
}

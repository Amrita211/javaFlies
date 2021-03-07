package zExtraQuestions;

import java.util.*;

public class seclargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        while(t-->0){
//            int a = s.nextInt();
//            int b = s.nextInt();
//            int c = s.nextInt();
//            int[] ar = {a,b,c};
//            Arrays.sort(ar);
//            System.out.println(ar[1]);
//        }
        ArrayList<Integer> list = new ArrayList<>();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        System.out.println(list.get(1));
    }
}

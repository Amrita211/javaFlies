package zHackerearth;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);
        int o = s.nextInt();
        int a = s.nextInt();
        int u = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();

        if(x>y){
            System.out.println(y);
        }
        else{
            System.out.println(x);
        }
    }
}

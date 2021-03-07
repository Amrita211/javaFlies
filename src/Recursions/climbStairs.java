package Recursions;

import java.util.ArrayList;
import java.util.Scanner;
// you are at nth stair and you have to come to 0th. you can jump 1, 2 or 3 stairs at a time, basically it is stair down
public class climbStairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths+" ");
    }
    public static ArrayList<String> getStairPaths(int n){
        if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path:path1){
            paths.add(1+path);
        }
        for (String path:path2){
            paths.add(2+path);
        }
        for (String path:path3){
            paths.add(3+path);
        }
        return paths;
    }
}

package Stackss;

import java.util.Scanner;
import java.util.*;
class heackerearth2 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer t = Integer.parseInt(s.nextLine());
// int t = s.nextInt();      // this gives the output in opposite sequence, don't know the reason behind this !! :(
        for(int i = 0; i < t; i++){
            String str = s.nextLine();
            Stack<String> stac = new Stack<>();
            for(int j = 0; j < str.length(); j++){
                if(!stac.isEmpty() && stac.peek().equals(Character.toString(str.charAt(j)))){
                    stac.pop();
                }
                else{
                    stac.push(Character.toString(str.charAt(j)));
                }
            }
            str = stac.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(", ","");
            if(str.equals("")){
                System.out.println("KHALI");
            }
            else{
                System.out.println(str);
            }
        }
    }
}

package Recursions;
// error aa raha hai :(
import java.util.HashMap;
import java.util.Scanner;

public class zPermutationOfWord2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Character[] spots = new Character[str.length()];
        HashMap<Character, Integer> lastOccur = new HashMap<>();
        for (char ch:str.toCharArray()){
            lastOccur.put(ch,-1);
        }
        permuteWord2(0,str,spots,lastOccur);
    }
    public static void permuteWord2(int currChar, String str, Character[] spots, HashMap<Character,Integer> lastOccur){
        if(currChar==str.length()){
            for (int i = 0; i <spots.length ; i++) {
                System.out.print(spots[i]);
            }
            System.out.println();
            return;
        }
        char ch = str.charAt(currChar);
        int lo= lastOccur.get(ch);
        for (int i = lo+1; i <spots.length ; i++) {
            if(spots[i]==null){
                spots[i]=ch;
                lastOccur.put(ch,i);
                permuteWord2(currChar+1,str,spots,lastOccur);
                lastOccur.put(ch,lo);
                spots[i]=null;
            }
        }
    }
}

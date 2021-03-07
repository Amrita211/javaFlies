package Recursions;

import java.util.HashMap;
import java.util.Scanner;

// we have given a frequency hashmap of string like a2b2 (that is actually aabb) and we have to find all permutations
public class zPermutationOfWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(fmap.containsKey(ch)){
                fmap.put(ch,fmap.get(ch)+1);
            }
            else {
                fmap.put(ch,1);
            }
        }
//        for (char ch :fmap.keySet()){
//            System.out.println(ch+" "+fmap.get(ch));
//        }
        permuteWord(1,str.length(),fmap,"");
    }
    public static void permuteWord(int currSel, int totalSel, HashMap<Character,Integer> fmap, String res){
        if(currSel>totalSel){
            System.out.println(res);
            return;
        }
        for(char ch :fmap.keySet()){
            if(fmap.get(ch)>0){
                fmap.put(ch,fmap.get(ch)-1);
                permuteWord(currSel+1,totalSel,fmap,res+ch);
                fmap.put(ch,fmap.get(ch)+1);
            }
        }
    }
}

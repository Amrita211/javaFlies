package zRecursionAndBactracking;
/*
input :
+-+
---
+-+
2
and
ant
output:
+ a +
a n t
+ d +
**********************************************************
+ a +
a n d
+ t +
**********************************************************

 */
import java.util.Scanner;

public class CrosswordPuzzel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] arr = new char[3][3];
        for (int i = 0; i <arr.length ; i++) {
            String str = s.next();
            arr[i] = str.toCharArray();
        }
        int n = s.nextInt();
        String[] words = new String[n];
        for (int i = 0; i <words.length ; i++) {
            words[i] = s.next();
        }
        solution(arr,words,0);
    }
    public static void solution(char[][] arr, String[] words, int videx){
        if(videx==words.length){
            print(arr);
            return;
        }
        String word = words[videx];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i][j]=='-' || arr[i][j]==word.charAt(0)){
                    if(canPlaceWordHorizontal(arr,word,i,j)){
                        boolean[] weplaced =placeWordHorizontal(arr,word,i,j);
                        solution(arr,words,videx+1);
                        unplaceWordhorizontal(arr,weplaced,i,j);
                    }
                    if(canPlacewordVerticle(arr,word,i,j)){
                        boolean[] weplaced =PlacewordVerticle(arr,word,i,j);
                        solution(arr,words,videx+1);
                        unPlacewordVerticle(arr,weplaced,i,j);
                    }
                }
            }
        }
    }

    public static boolean canPlaceWordHorizontal(char[][] arr, String word, int i, int j){
        if(j-1>=0 && arr[i][j-1]!='+'){  // checking just left cell to the word
            return false;
        }
        else if(j+word.length()<arr[0].length && arr[i][j+word.length()]!='+'){  // checking just right cell to the word
            return false;
        }
        for (int jj = 0; jj <word.length() ; jj++) { // checking whether the words perfectly fit in space or not
            if(j+jj>=arr[0].length){  // out of the board
                return false;
            }
            if(arr[i][j+jj]=='-' || arr[i][j+jj]==word.charAt(jj)){ // when encounter an already filled character
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static boolean canPlacewordVerticle(char[][] arr, String word, int i, int j){
        if(i-1>=0 && arr[i-1][j]!='+'){  // checking just upper cell to the word
            return false;
        }
        else if(i+word.length()<arr.length && arr[i+word.length()][j]!='+'){  // checking just down cell to the word
            return false;
        }
        for (int ii = 0; ii <word.length() ; ii++) { // checking whether the words perfectly fit in space or not
            if(i+ii>=arr.length){  // out of the board
                return false;
            }
            if(arr[i+ii][j]=='-' || arr[i+ii][j]==word.charAt(ii)){ // when encounter an already filled character
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean[] placeWordHorizontal(char[][] arr, String word, int i, int j){
        boolean[] weplaced = new boolean[word.length()];
        for (int jj = 0; jj <word.length() ; jj++) {
            if(arr[i][j+jj]=='-'){
                arr[i][j+jj] = word.charAt(jj);
                weplaced[jj] = true;
            }
        }
        return weplaced;
    }
    public static void unplaceWordhorizontal(char[][] arr, boolean[] weplaced, int i, int j){
        for (int jj = 0; jj < weplaced.length ; jj++) {
            if (weplaced[jj] == true) {
                arr[i][j+jj]='-';
            }
        }
    }

    public static boolean[] PlacewordVerticle(char[][] arr, String word, int i, int j){
        boolean[] weplaced = new boolean[word.length()];
        for (int ii = 0; ii <word.length() ; ii++) {
            if(arr[i+ii][j]=='-'){
                arr[i+ii][j] = word.charAt(ii);
                weplaced[ii] = true;
            }
        }
        return weplaced;
    }
    public static void unPlacewordVerticle(char[][] arr, boolean[] weplaced, int i, int j){
        for (int ii = 0; ii < weplaced.length ; ii++) {
            if (weplaced[ii] == true) {
                arr[i+ii][j]='-';
            }
        }
    }

    public  static void print(char[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("**********************************************************");
    }
}

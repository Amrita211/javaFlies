package zExtraQuestions;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String unprocess = s.next();
        remove("","hello");
    }

    private static void remove(String process, String unprocess) {
        if(unprocess.length()==0) {
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        char ch2 = unprocess.charAt(1);
        unprocess = unprocess.substring(1);
        if (ch!=ch2 && unprocess.length()>=0){
            remove(process+ch,unprocess);
        }
        else{
            remove(process,unprocess);
        }
    }
}

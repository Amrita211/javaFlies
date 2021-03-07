package zExtraQuestions;

import java.util.*;
class vowelAfterConst {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int maxLength = s.nextInt();
            String str =null;
            while(str==null || str.length()!=maxLength){
                // taking the input by user untill the length is                       same sa maximum length
                str = s.next();
            }
            int count =0;
            for(int i=0;i<str.length()-1;i++){
                char ch = str.charAt(i);
                char chNext = str.charAt(i+1);
                if(ch!='a' && ch!='e'&& ch !='i'&& ch!='o' && ch!='u'){ // consonent
                    if(chNext=='a' || chNext=='e'|| chNext =='i'|| chNext=='o' || chNext=='u'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}


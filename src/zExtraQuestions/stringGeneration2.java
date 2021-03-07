package zExtraQuestions;

import java.util.Scanner;

public class stringGeneration2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
            int m = s.nextInt();
            int n = s.nextInt();
            char[][] mat = new char[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = s.next().charAt(0);
                }
            }

            String str = s.next();
            String res = "";
            // converting string nput into a char array
            char[] chr = new char[str.length()];
            for (int i = 0; i <chr.length ; i++) {
                chr[i] = str.charAt(i);
            }
            int row =0;
           int i=0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k <n ; k++) {
                    if(chr[i++]==mat[j][k] && i<str.length()){
                        res += mat[j][k];
                        mat[j][k] ='0';
                        break;
                    }
                    else {
                        i--;
                    }
                } // end for k
                if(j==m-1){
                    row =0;
                }
            }// end for j
            if (str.equals(res)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

package zExtraQuestions;

import java.util.Scanner;
// wrong output
public class stringGeneration {
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
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int row = 0;
                for (int j = row; j < m; j++) {
//                    char ch = str.charAt(i);
                    for (int k = 0; k < n; k++) {
                        if (ch == mat[j][k]) {
                            res += mat[j][k];
                            mat[j][k] = '0';
                            break;
                        }
                    }
                }
                if (i >= row) {
                    row = 0;
                }
            }
            if (str.equals(res)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

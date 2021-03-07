package zExtraQuestions;
import java.util.*;
class Generator {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int m = s.nextInt();
            int n = s.nextInt();
//            String str = s.next();
            char[][] mat = new char[m][n];
            for(int i=0; i<m;i++){
                for(int j =0;j<n;j++){
                    mat[i][j] = s.next().charAt(0);
                }
            }
            String str = s.next();
            findString(mat,str,m,n);
        }
    }
    public static void findString(char[][] mat, String str, int m, int n){
//        int row;
        int col;
        int cnt=0;
        for(int i=0;i<str.length();i++){
            int row = i%m;
            for(col=0;col<n;col++){
                if(mat[row][col]==str.charAt(i)){
                    mat[row][col]='0';
                    break;
                }
            }
            if(col==n){
                cnt=1;
                break;
            }
        }
        if(cnt==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}


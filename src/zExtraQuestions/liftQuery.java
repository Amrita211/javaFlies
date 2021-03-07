package zExtraQuestions;

import java.util.Scanner;

public class liftQuery {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int liftA = 0;
        int liftB = 7;
        while(t-->0){
//            int liftA = 0;
//            int liftB = 7;
            int floor = s.nextInt();

            int distanceBottom = Math.abs(liftA-floor);
            int distanceTop = Math.abs(liftB - floor);

            if(distanceBottom<distanceTop){
//                liftA = floor;
                System.out.println("A");
                liftA = floor;
            }
            else if(distanceBottom>distanceTop){
                System.out.println("B");
                liftB = floor;
            }
            else if(distanceBottom==distanceTop){
                System.out.println("A");
                liftA=floor;
            }
        }
    }
}

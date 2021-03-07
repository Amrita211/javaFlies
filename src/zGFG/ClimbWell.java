package zGFG;

import java.util.Scanner;

//Puzzle | Man fell in well Puzzle
//A man fell in a 50m deep well. He climbs 4 meters up and slips 3 meters down in one day.
// How many days would it take for him to come out of the well?
//  Answer: 47days
public class ClimbWell {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = 51;
        int calLength = 0;
        int countDay = 0;
        for (int i = calLength; i <length-4 ; i++) {
            calLength +=1;
            countDay +=1;
        }
        System.out.println(countDay+1);
    }
}

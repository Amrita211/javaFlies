package zExtraQuestions;

import java.util.Calendar;

// check a year is leap year or not
public class Q5 {
    public static void main(String[] args) {
        int year = 2001;
        System.out.println("is leap year ? "+isLeapyear(year));

        System.out.println(isLeap(2012));
    }
    public static boolean isLeapyear(int year){
         Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        int NOOfDays= cal.getActualMaximum(Calendar.DAY_OF_YEAR);

        if(NOOfDays>365){
            return true;
        }
        return false;

    }

//     or
    public static boolean isLeap(int year){
        return (year%400==0) || ((year%100!=0)&&(year%4==0));
    }
}

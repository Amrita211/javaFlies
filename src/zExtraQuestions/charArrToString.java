package zExtraQuestions;

public class charArrToString {
    public static void main(String[] args) {
        char[] arr = {'n','e','e','r','a','j'};
//        System.out.println(toString(arr));
//        System.out.println(cnvrtToString(arr));
//        System.out.println(strConvrt(arr));
        System.out.println(convrt(arr));
    }

//    1st method :- by using toString method which returns the string after converting any object into string
//    it is an inbuilt method in java
    public static String toString(char[] ar){
        String res = new String(ar);
        return res;
    }

//    2nd method:- by iterating each character of array and appending it to the stringbuilder
    public static String cnvrtToString(char[] a){
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <a.length ; i++) {
            build.append(a[i]);
        }
        return build.toString();
    }

//    3rd method :- by using valueOf() method , which simply converts the array to string
    public static String strConvrt(char[] a){
        String str = String.valueOf(a);
        return str;
    }
    public static String convrt(char[] a){
        return new String(a);
    }
}

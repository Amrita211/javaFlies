package ClassAndObjects;
public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "neeraj";
        s1.rollNo = 25;
        System.out.println("name is: "+s1.name+" and roll number is: "+ s1.rollNo);
    }
}

class Student{
    int rollNo;
    String name;
}
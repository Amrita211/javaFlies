package comparatorss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student {
    int age;
    String name;
    Student(String name, Integer age){
        this.age = age;
        this.name =name;
    }
    public Integer getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    //displaying
    public String toString(){
        return "Student{ "+ name +" = "+age+" }";
    }

    public static class StudentSorting implements Comparator<Student>{
        public int compare(Student a , Student b){
            int nameComp = a.getName().compareTo(b.getName());
            int agecomp = a.getAge().compareTo(b.getAge());
            if(nameComp==0){ // if names are same then sort according to age otherwise acc to name
                return agecomp;
            }
            else {
                return nameComp;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.add(obj6);

//        Iterator<Student> custIterator = list.iterator();
//
//        System.out.println("Before Sorting:\n");
//        while (custIterator.hasNext()) {
//            System.out.println(custIterator.next());
//        }
//        OR


        for (Student bacche:list){
            System.out.println(bacche);
        }
//        System.out.println(list);

        //sorting
        Collections.sort(list,new StudentSorting());
        System.out.println("After sorting ");
        for (Student bacche:list){
            System.out.println(bacche);
        }

    }
}

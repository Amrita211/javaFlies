package ClassAndObjects;

public class Q2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.a = 4;
        t1.b = 6;
        t1.c = 7;

        System.out.println(t1.getPerimeter());

        // creating an object of triangle2 class
        Triangle2 t2 = new Triangle2(4,6,7);
        System.out.println(t2.getPerimeter());
    }
}
class Triangle{  // without constructor
    int a, b, c;
    public double getPerimeter(){
        return (a+b+c)/2;
    }
}

class Triangle2{    // with constructor
    int a, b,c;
    Triangle2(int A , int B, int C){
        a = A;
        b = B;
        c = C;
    }
    public double getPerimeter(){
        return (a+b+c)/2;
    }
}

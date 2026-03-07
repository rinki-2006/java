abstract class shape{
    abstract double perimeter();
    abstract double area();
}
class my_circle extends shape{
    double radius;

    double perimeter(){
        return 2*Math.PI*radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
}
class my_rectangle extends shape{
    double length;
    double breadth;

    double perimeter(){
        return 2*(length + breadth);
    }
    double area(){
        return length*breadth;
    }
}
public class practise3abstract {
    public static void main(String[] args) {
        my_circle s = new my_circle();
        s.radius = 10.5;
        shape s2 = s;
        System.out.println(s2.area());
        System.out.println(s2.perimeter());

        my_rectangle r = new my_rectangle();
        r.length = 9.8;
        r.breadth = 6.8;
        shape s3 = r;
        System.out.println(s3.area());
        System.out.println(s3.perimeter());
    }
}

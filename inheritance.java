class circle2{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
}
class cylinder extends circle2{
    public double height;

    public void volume(){
        System.out.println("volume = "+ area()*height);
    }
}
public class inheritance {
    public static void main(String[] args) {
        circle2 c1 = new circle2();
        cylinder c2 = new cylinder();
        c2.radius= 2;
        c2.height = 4;
        c2.volume();
        c2.area();


    }
}

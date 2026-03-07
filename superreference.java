class Rectangle3{
    int length;
    int breadth;
    int x = 10;

    Rectangle3(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class cuboid3 extends Rectangle3{
    int height;
    int x = 20;

    cuboid3(int l, int b, int h){
        super(l,b);
        height = h;
    }
    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
    }

public class superreference {
    public static void main(String[] args) {
        cuboid3 c = new cuboid3(10,20,30);
        c.display();
    }
}

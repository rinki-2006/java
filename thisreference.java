class Rectangle2{
    int length;
    int breadth;

    Rectangle2(int length, int breadth){
        this.length = length;
        this.breadth= breadth;
    }
    void display(){
        System.out.println("Length = "+ this.length +"\n"+ "Breadth = "+ this.breadth);
    }
}
public class thisreference {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(10,20);
        r1.display();
    }
}

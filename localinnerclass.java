class outer1{
    int x = 10;
    void display(){
        class inner2{
            int y =20;
            void innerclass(){

                System.out.println(x + " " + y);
            }
        }
//        inner2 i = new inner2();
//        i.innerclass();
//        System.out.println(i.y);
        new inner2().innerclass();  // object of anonymous class
    }
}
public class localinnerclass {
    public static void main(String[] args) {
        outer1 o = new outer1();
        o.display();
    }
}

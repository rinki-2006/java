class test5{
    // static variable
    static int c = 10;
    int a = 20;
    //non-static method can access both static and non-static members
    void show(){
        System.out.println(c + " " + a);
    }
    // static method can access only static member
    static void display(){
        System.out.println(c);

    }
}
public class statickeyword {
    public static void main(String[] args) {
        test5 t = new test5();


        t.c = 50;
        t.a = 100;
        t.show();

        test5 t1 = new test5();
        t1.show();

        test5.display();
    }
}

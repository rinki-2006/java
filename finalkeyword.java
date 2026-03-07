// final class can not be extended by other class
final class my_super{
    //final variable
    final int MAX = 10; // 1st way
   static final int MIN;
   final double PI;
    static{
        MIN = 90;  // 2nd
    }
    my_super(){
        PI =3.14;  // 3rd
    }

    // final method can not be over_ride
    final void show(){
        System.out.println("hello");
    }
}

public class finalkeyword {
    public static void main(String[] args) {
    my_super m = new my_super();
    m.show();
    }
}

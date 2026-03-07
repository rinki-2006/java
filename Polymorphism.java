//  overloading or compile time polymorphism
class test3{
    public int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public int max(int x, int y, int c){
        if(x>y && x>c){
            return x;
        }
        else if(y>x && y>c){
            return y;
        }
        else{
            return c;
        }
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        test3 t = new test3();
        System.out.println(t.max(10,20));    // same function name but doing
                                    // different action so it is called polymorphism
        System.out.println(t.max(10,20,30));


    }
}

class base2{
    base2(){
        System.out.println("Non parametrized constructor");
    }
    base2(int x){
        System.out.println("Parameterized constructor" +x);
    }
}
class Derived extends base2{
    Derived(){
        System.out.println("Non parameterized constructor of derived class");
    }
    Derived(int y){
        System.out.println("Parametrized constructor of derived class" + y);
    }
    Derived(int x, int y){
        super(x);  // run base2(int x) constructor
        System.out.println("2 Parametrized constructor of child class");
    }
}
public class parametizedCI {
    public static void main(String[] args) {
        Derived d = new Derived(10,20);
    }

}

import java.lang.reflect.*;
class my_a{
    private int a;
    public int b;
    protected int c;
    int d;

    public my_a(){}

    public my_a(int x, int y){}

    public void display(String s1, String s2){}

    public int show(int s, int y){return 0;}
}
public class reflect {
    public static void main(String[] args) {
        Class c = my_a.class;
        System.out.println(c.getName());

        // for data member
        Field field[] = c.getDeclaredFields();
        for(Field f: field){
            System.out.println("Data member = " + f);
        }

        // for constructor
        Constructor con[] = c.getConstructors();
        for(Constructor c2 : con){
            System.out.print("Constructor = " + c2);
        }

        // for methods
        Method m[] = c.getMethods();
        for(Method m2 : m){
            System.out.println(m2);
        }

        // for parameter
        Parameter para[] = m[0].getParameters();
        for(Parameter p : para){
            System.out.println(p);
        }

    }
}

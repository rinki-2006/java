public class functioncalling {
    public static void main(String[] args) {
        fun3();
    }
    public static void fun1(){
        System.out.println("This is function 1");
    }
    public static void fun2(){
        System.out.println("This is function 2");
        fun1();
    }
    public static void fun3(){
        System.out.println("this is function 3");
        fun2();
    }
}

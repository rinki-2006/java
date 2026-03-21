class A{}
class B extends A{}
class C extends B{}
class generic1<T>{
    T data[] = (T[]) new Object[3];
    int length = 0;

    public void append(T v) {
        data[length++] = v;
    }

    public void display() {
        for (T x : data) {
            System.out.println(x);
        }
    }
}


public class genericwildcard {
    // wildcard
    static void fun(generic1<?> obj){
        obj.display();
    }

    // upper bound
//    static void fun(generic1<? extends Number> obj){
//        obj.display();
//    }

    //lower bound
//    static void fun(generic1<? super C> obj){
//        obj.display();
//    }
    public static void main(String[] args) {
        generic1<String> ma1 = new generic1<>();
        ma1.append("Hello");
        ma1.append("bye");

        generic1<Integer> ma2 = new generic1<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);


        // lower bound
//        generic1<A> ma1 = new generic1<>();
//        generic1<B> ma2 = new generic1<>();
//        fun(ma1);
//        fun(ma2);

    }
}

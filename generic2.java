class generic_g2<T>{
    T list[] =(T[]) new Object[3];
    int length = 0;

    public void appendd(T v){
        list[length++] = v;
    }

    public void display(){
        for(T x : list){
            System.out.println(x);
        }
    }
}
public class generic2 {
    public static void main(String[] args) {
//        generic_g2<Integer> g = new generic_g2<>();
//        g.appendd(10);
//        g.appendd(20);
//        g.appendd(30);

        // when no parameter is passed
        generic_g2 g = new generic_g2();
        g.appendd("hello");
        g.appendd(10);
        g.appendd("bye");

        g.display();
    }
}

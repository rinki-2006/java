// subtype
class generic_g3<T> {
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
class my_generic<T> extends generic_g3<T>{

}
public class generic3{
    public static void main(String[] args) {
    my_generic<String> i = new my_generic<>();
    i.append("hello");
    i.append("everyone");
    i.append("bye");

    i.display();
    }
}




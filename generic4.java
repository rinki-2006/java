// bounded type
class generic_g4<T extends Number>{
    T data[] = (T[]) new Number[3];
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

public class generic4 {
    public static void main(String[] args) {
        generic_g4<Float> g = new generic_g4<>();
        g.append(9.8f);
        g.append(7.98f);
        g.append(3.65f);

        g.display();
    }
}

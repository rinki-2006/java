import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40)); // sorted
        ts.add(25);
        System.out.println(ts.ceiling(15));
        System.out.println(ts.floor(15));
        System.out.println(ts);
    }
}

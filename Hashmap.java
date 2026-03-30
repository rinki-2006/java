import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A", 1, "B", 2,"C", 3, "D"));
        tm.put(4, "E");
        tm.put(5, "F");

        System.out.println(tm.get(3));
        System.out.println(tm.isEmpty());
        System.out.println(tm.remove(0));
        System.out.println(tm.replace(1,"I"));
        System.out.println(tm);

    }
}

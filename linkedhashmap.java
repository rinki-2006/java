// give value as the order in which keys are inserted
import java.util.*;
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"F");
        lhm.put(9,"I");
        lhm.put(8,"H");

        lhm.forEach((k,v)-> System.out.println(k + " " + v));
    }
}

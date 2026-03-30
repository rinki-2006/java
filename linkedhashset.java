import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("A");
        lhs.add("H");
        lhs.add("C");
        lhs.add("K");
        lhs.add("E");

       Iterator<String> i = lhs.iterator();
       while(i.hasNext()){
           System.out.println(i.next());
       }
    }
}

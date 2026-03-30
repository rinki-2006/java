import java.util.*;
public class linkedhashmap1 {
    public static void main(String[] args) {
        //whether you want the order of access if yes then mention true
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f,true){
            // the below method is written for the limit
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1); // recently used is 1, then 5 , 2
        lhm.put(6,"F");


        lhm.forEach((k,v) -> System.out.println(k + " " + v));
    }
}

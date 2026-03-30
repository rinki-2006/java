import java.util.*;
public class hashtable {
    public static void main(String[] args) {
//        Hashtable ht = new Hashtable(); // later on java generic class was introduced then this class was introduced generic
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        // it is not of generic type , so it is Object we cannot assign object to string so typecast it
        String s = (String)ht.get(3);
        //it is not generic, so iterator is not available for this class
        // there was a class called enumeration

//        Enumeration e = ht.elements(); // for values
        Enumeration e = ht.keys(); // for values
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
//        System.out.println(ht);
    }
}

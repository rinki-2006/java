import java.util.*;
public class listinterface2 {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>(20);
        // I can pass the elements using list interface
        ArrayList<Integer> all1 = new ArrayList<>(List.of(50,60,70,80,90));

        // traverse using iterator
//        Iterator<Integer> it = all1.iterator(); // iterator is like the reference on all the element, it is holding the element of 1st element
//        while(it.hasNext()){  // I will stop when no element
//            System.out.print(it.next() + " ");
//        }

//        ListIterator<Integer> it = all1.listIterator(); // iterator is like the reference on all the element, it is holding the element of 1st element
//        while(it.hasNext()){  // I will stop when no element
//            System.out.print(it.next() + " ");
//        }

        // using above by for loop
//        for(Iterator<Integer> it1 = all1.iterator(); it1.hasNext();){ // no updation
//            System.out.print(it1.next() + " ");
//        }

        // using for each
//        all1.forEach(n-> System.out.print(n + " "));
        all1.forEach(n->show(n));

    }
    static void show(int n){
        if(n>60){
            System.out.println(n);
        }
    }
}

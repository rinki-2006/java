// min heap
import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pi = new PriorityQueue<>();
        pi.add(20);   // instead of add we also use offer
        pi.add(10);
        pi.add(30);
        pi.add(5);
        pi.add(50);
        pi.add(3);

        System.out.println(pi.peek());

//        pi.forEach((x)-> System.out.print(x + " "));
        pi.poll();
        pi.forEach((x)-> System.out.print(x + " "));
    }
}

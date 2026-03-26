import java.util.Comparator;
import java.util.PriorityQueue;
class Mycom implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){  // this method tell us the order
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}
public class priorityqueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pi = new PriorityQueue<>(new Mycom());
        pi.add(20);   // instead of add we also use offer
        pi.add(10);
        pi.add(30);
        pi.add(5);
        pi.add(50);
        pi.add(3);
        pi.peek();
        pi.forEach((x)-> System.out.println(x));
    }
}

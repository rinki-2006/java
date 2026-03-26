import java.util.LinkedList;
import java.util.List;

public class linkedlistinterface {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> li1 = new LinkedList<>(List.of(50,60,70,80,90));

        li.add(10);
        li.add(0,5);
        li.addAll(li1);
        li.addAll(1,li1);
        li.addFirst(3);
        li.addLast(200);
        System.out.print(li + " ");
        System.out.println(li.getFirst());
        System.out.println(li.peek()); //give the first element
        System.out.println(li.poll()); // remove first element
        System.out.println(li.pop()); // remove first element but throw error if list is empty
        System.out.println(li.poll());
    }
}

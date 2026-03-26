import java.util.*;
public class listinterface {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>(20);  // initial size of array
        // I can pass the elements using list interface
        ArrayList<Integer> all1 = new ArrayList<>(List.of(50,60,70,80,90));
        all.add(10);
        all.add(0,5);
//        all.addAll(all1);
//        System.out.println(all);

        all.add(2,70);
        all.addAll(1,all1); // mention the element of all1 at index 1

        System.out.println(all.contains(60));
        System.out.println(all.containsAll(all1));

        System.out.println(all.get(5)); // give the value which is at index 5

//        System.out.println(all.indexOf(70)); // give the index of 70
        System.out.println(all.lastIndexOf(70));

        all.set(6,100); // the value which is at index 6 is replaced by 100
        System.out.println(all);

        // iterating through an array list
//        for(int i = 0; i<all.size(); i++){
//            System.out.print(all.get(i) + " ");
//        }

//        for(Integer x : all){
//            System.out.print(x + " ");
//        }


    }
}

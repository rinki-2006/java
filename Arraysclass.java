import java.util.*;
public class Arraysclass {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 1, 3, 5, 7};
        int b[] = {2, 4, 6, 8, 1, 3, 5,7};

        int c[] = Arrays.copyOf(a,a.length);
        Arrays.sort(c);  // for sorting
//        for(int x: c){
//            System.out.print(x + " ");
//        }
        System.out.println(Arrays.binarySearch(c,2));  // binary search is for sorted array


//        Arrays.fill(c,10);
//        for(int y : c){
//            System.out.println(y);
//        };



//        System.out.println(Arrays.compare(a,b));


    }
}

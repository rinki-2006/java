import java.util.*;
class My1 implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1<i2)
            return 1;
        else if(i1>i2)
            return -1;
        return 0;
    }
}
public class comparator {
    public static void main(String[] args) {
        Integer a[] = {2,4,6,8,1,3,5,7};
        Arrays.sort(a, new My1());
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}

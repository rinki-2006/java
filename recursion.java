public class recursion {
    public static void main(String[] args) {
        rec(5);
    }
    public static void rec(int n){
        if(n>0){
            System.out.println(n);  //reverse counting
            rec(n-1);
            System.out.println(n);  //forward counting
        }
    }
}

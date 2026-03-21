public class genericmethods {
    // genric method
    static<T> void show(T[] list){
        for(T x : list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"Hi", "Go", "Bye"});
        show(new Integer[]{10,20,30,40});
    }
}

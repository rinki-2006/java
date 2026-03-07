public class parameterpassing {
    public static void main(String[] args) {
        int a = 10;
        show(a);
        System.out.println(a);// actual parameter
    }
    public static int show(int x){  //formal parameter
        x++;
        System.out.println(x);
        return 0;

    }
}

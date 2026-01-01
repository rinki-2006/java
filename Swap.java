public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = (a^b);
        b = (a^b);
        a = (a^b);
        System.out.println(a + " " + b);

        int c = 3;
        int d = 7;
        c = (c^d);
        d = (c^d);
        c = (c^d);
        System.out.println(c + " " + d);
    }
}

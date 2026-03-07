public class wrapper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("78");
        System.out.println(i);
        Integer a = Integer.valueOf("B6",16);
        System.out.println(a);
        int d = i;
        System.out.println(i.equals(d));
        Integer b = Integer.decode("0xA7");
        System.out.println(b);


    }
}

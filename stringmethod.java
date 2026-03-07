public class stringmethod {
    public static void main(String[] args) {
       String str = new String("Java");
       show(str);
    }
    public static void show(String str){
        String x = str.replace('J', 'H');
        System.out.println(x);
        System.out.println(str);

    }
}

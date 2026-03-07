public class returnobject {
    public static void main(String[] args) {
        String str = new String("max@gmail.com");
        System.out.println(show(str));
    }
    public static String show(String str){
        int index = str.indexOf('@');
        String username = str.substring(0, index);
        return username;
    }
}

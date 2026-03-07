public class strings {
    public static void main(String[] args) {
       String str = "Java";
       String str1 = new String(str);
        System.out.println(str1);
        System.out.println(str.length());

        //char in string
        char c[] = {'h','e','l','l','o'};
        String str2 = new String(c);
        System.out.println(str2);

        char d[] = {68, 69, 70, 71};
        System.out.println(d);

        String str3 = "welcome";     //pool
        String str4 = new String("welcome");   //heap
        System.out.println(str3==str4);    //check reference
        System.out.println(str3.equals(str4));   //check only value

        byte b[] = {65, 66, 67, 68};
        System.out.println(b);
        String str6 = new String(b);
        System.out.println(str6);


    }
}

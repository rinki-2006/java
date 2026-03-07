public class Stringformat {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "World";
        int a = 2;
        char c = 'd';
        float f = 234.78f;
        System.out.println(str);
        System.out.print(str1);
//        System.out.print(str);
//        System.out.println(str1);
//        System.out.printf("%s", str);
        System.out.printf("-%4d\n", a);
        System.out.printf("%3d\n",a);

//        System.out.printf("%c", c);
//        System.out.printf("%f", f);

        //practise augmented index
        System.out.printf("%2$d %1$d\n", 10, 20);
        System.out.printf("%3$d %1$d %2$d\n", 40, 10, 30);

        //flags
        System.out.printf("%-5d\n", 10);
        System.out.printf("-%5d\n",20);
        System.out.printf("+%3d\n",78);
        System.out.printf("%+3d\n",67);
        System.out.printf("%05d\n", 10);
        System.out.printf("%,4d\n",100000);
        System.out.printf("%(d", -50);



    }
}

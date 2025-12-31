//import java.lang.*;
//class first{
//public static void main(String[] args){
//System.out.println("hello world");
//



//narrowing
public class narrowningwidening {
    public static void main(String[] args) {
        byte b = 10;
        int i = 183;
        b =  (byte)i;
        float f = i;    //widening
        System.out.println(f);
        System.out.println(b);
        System.out.println(Integer.parseInt("34"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(167));
        System.out.println(Integer.toOctalString(010));

    }
}
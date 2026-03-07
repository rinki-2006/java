public class multiplecatch {
    public static void main(String[] args) {
        int a[] = {10,0,2,3,5};
        try {
            int c = a[0] / a[1];
            System.out.println(c);
            System.out.println(a[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Divison by zero is not allowed, try again");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }
        System.out.println("Bye");

    }
}

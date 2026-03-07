public class nestedexception {
    public static void main(String[] args) {
        int a[] = {10,0,20,30,40};
        try{
            int c = a[0]/a[1];
            System.out.println(c);
            try{
                System.out.println(a[6]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bound");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Divison by zero is not allowed");
        }
        System.out.println("Bye");
    }
}

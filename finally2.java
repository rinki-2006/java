public class finally2 {
    static void meth1() throws Exception{
        // we write try for finally because we want to print final message
        try {
            throw new Exception();
        }
        finally {
            System.out.println("Final message");
        }
    }

    public static void main(String[] args) {
        try {
            meth1();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

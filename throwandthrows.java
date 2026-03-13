public class throwandthrows {
   static int area(int l, int b) throws Exception{
       if(l<0 || b<0)
           throw new Exception();  // Exception is built in class
        int a = l*b;
        return a;
    }
    static void meth1() throws Exception{
        System.out.println(area(-10,2));

    }
    public static void main(String[] args) {
       try {
           meth1();
       }
       catch (Exception e){
           System.out.println("please write positive dimension ");
       }
    }
}

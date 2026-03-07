class NegativeDimensionException extends Exception{
    public String getMessage(){
        return "Dimensions can never be negative";
    }
}
public class userdefinedexceptionclass {
    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException{
        System.out.println(area(-10,20));
    }
    public static void main(String[] args) {
        try {
            meth1();
        }
        catch (NegativeDimensionException e){
            System.out.println(e.getMessage());
        }
    }
}

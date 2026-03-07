public class gcdbymethod {
    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        System.out.println(gcd(a,b));

    }
    public static int gcd(int x, int y){
        while(x!=y){
            if(x>y){
                 x = x-y;
            }
            else{
                 y = y-x;
            }
        }
        return x;
    }
}

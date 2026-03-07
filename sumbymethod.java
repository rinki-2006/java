public class sumbymethod {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(sum(a));
    }
    public static int sum(int x){
        int sum = 0;
        for(int i = 0; i<=x; i++){
            sum = sum +i;
        }
        return sum;
    }
}

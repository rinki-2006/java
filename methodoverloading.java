public class methodoverloading {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(6.9f, 7.8f,4.6f));
        System.out.println(sum(8,9,7));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float x, float y, float z){
        return x+y+z;
    }
    public static int sum(int x,int y, int z){
        return x+y+z;
    }
}

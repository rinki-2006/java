public class variableargument {
    public static void main(String[] args) {
        show();
        show(10, 20);
        show(10,20,30,40);
        show(new int[]{3,4,5,6});
    }
    public static void show(int...x){
        for(int a : x){
            System.out.print(a + " ");
        }
    }
}

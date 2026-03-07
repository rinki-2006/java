class mysquare{
    private int side;

    public mysquare(){   //non parametrized
        side = 2;
    }
    public void show(){
        System.out.println("Area = " + side*side);
    }
}
public class nonparameter {
    public static void main(String[] args) {
        mysquare s1 = new mysquare();
        s1.show();

    }
}

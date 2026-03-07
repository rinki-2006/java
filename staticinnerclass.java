class outer4{
    static int x = 10;
    int y = 20;

    static class inner4{
        void display(){
            System.out.println(x);
        }
    }
}

public class staticinnerclass {
    public static void main(String[] args) {
    outer4.inner4 i = new outer4.inner4();
    i.display();

    }
}

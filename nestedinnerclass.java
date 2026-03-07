class outer{
    int x = 10;
    class inner{
        int y = 20;
        void innerdisplay(){
            System.out.println(x + " " + y);

        }
    }
    void outerdisplay(){
        inner i = new inner();
        i.innerdisplay();
        System.out.println(i.y);
    }
}
public class nestedinnerclass {
    public static void main(String[] args) {
//        outer o = new outer();
//        o.outerdisplay();

        // directly access innner class but not useful
        outer.inner i1 = new outer().new inner();
        i1.innerdisplay();
    }
}

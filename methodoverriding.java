class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class sub extends Super{
    public void display(){
        System.out.println("Hello welcome");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        Super s = new Super();
        s.display();
        sub s2 = new sub();
        s2.display();
    }
}

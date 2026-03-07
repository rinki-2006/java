class parent{
    public parent(){
        System.out.println("Parent constructor");
    }
}
class child extends parent{
    public child(){
        System.out.println("child constructor");
    }
}
class grandchild extends child{
    public grandchild(){
        System.out.println("Grandchild constructor");
    }
        }
public class consinheit {
    public static void main(String[] args) {
//        parent p = new parent();
//        child c = new child();
        grandchild g = new grandchild();
    }
}

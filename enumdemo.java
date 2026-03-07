enum dept{
    CS, IT, CIVIL, ECE

}
public class enumdemo {
    public static void main(String[] args) {
        dept d = dept.CIVIL;
        System.out.println(d.name());
        System.out.println(d.ordinal());
        System.out.println(dept.valueOf("CS"));

        dept list[] = dept.values();
        for(dept x : list){
            System.out.print(x + " ");
        }
    }
}

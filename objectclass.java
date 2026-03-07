public class objectclass {
    public static void main(String[] args) {
        Object o = new Object();  // object is the parent class
        System.out.println(o);  // by default it call toString method
        System.out.println(o.toString());

        Object o1 = new Object();
        System.out.println(o1.equals(o));  //check reference

        Object o2 = o;
        System.out.println(o2.equals(o));

        System.out.println(o.hashCode());
    }
}

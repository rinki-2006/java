class my_object{
    public String toString(){
        return "My_object";
    }
    public int hashCode(){
        return 100;
    }


    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
public class objectclass2 {
    public static void main(String[] args) {
    my_object m = new my_object();
        System.out.println(m);
   my_object o2 = new my_object();
        System.out.println(m.equals(o2));  // gives true on the basis of hash code
        // both object have same hash code

    }
}

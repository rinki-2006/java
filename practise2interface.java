interface Member{
    void callback();
}
class store{
    Member member[] = new Member[10];
    int count = 0;
    void register(Member m){
        member[count++] = m;
    }
    void invitesale(){
        for(int i = 0; i<count; i++){
            member[i].callback();
        }
    }
}
class customer2 implements Member{
    String name;
    customer2(String n){
       name = n;
    }
    public void callback(){
        System.out.println("OK, I will visit " + name);
    }
}
public class practise2interface {
    public static void main(String[] args) {
        store s= new store();
        customer2 c = new customer2("riya");  // goes to customer constructor
        customer2 c2 = new customer2("siya");
        s.register(c);  //value go to register method
        s.register(c2);
        s.invitesale();


    }
}

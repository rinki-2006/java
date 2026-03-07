class customer{
    private String custid;
    private String name;
    private String address;
    private int phoneno;

    void set(String address, int phoneno){
        this.address = address;
        this.phoneno = phoneno;
    }
    public customer(String custid,String name){
        this.custid = custid;
        this.name = name;
    }
    void get(){
        System.out.println("customer id = "+custid+"\n"+"Name = "+name+"\n"+
                "Address = "+address+"\n"+"Phone no = "+phoneno);
    }
}
public class constructpractise2 {
    public static void main(String[] args) {
        customer c1 = new customer("A23-89","rahul");
        c1.set("old bus stand", 987654);
        c1.get();


    }
}

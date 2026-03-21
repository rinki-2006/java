import java.io.*;

class customer_ser implements Serializable {
    String cust_id;
    String name;
    String phoneno;

   static int count = 1;

   // it is important to create for reading
   customer_ser(){}

    customer_ser(String n, String no){
       cust_id = "c" + count;
       count++ ;
        name = n;
        phoneno = no;
    }
 // override this for print
    public String toString(){
        return "customer id = " + cust_id+
                "Name " + name+
                "Phone number = " + phoneno;

    }
}
public class serailized3 {
    public static void main(String[] args) throws Exception{
        customer_ser s[] = {new customer_ser("Riya", "4568976"),new customer_ser("rinki", "409876")};
        FileOutputStream f = new FileOutputStream("C:/Users/HP/Data6.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);

        // we don't know how many object we are creating so first store the length of object
        o.writeInt(s.length);
        for(customer_ser s2 : s){
            o.writeObject(s2);
        }
        o.close();
        f.close();

        FileInputStream f2 = new FileInputStream( "C:/Users/HP/Data6.txt");
        ObjectInputStream oi = new ObjectInputStream(f2);

        // read the length of array
        int length = oi.readInt();
        customer_ser list[] = new customer_ser[length];

        for(int i = 0; i<length; i++){
            list[i]= (customer_ser)oi.readObject();
            System.out.println(list[i]);
        }
        oi.close();
        f2.close();

    }
}

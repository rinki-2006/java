class product{
    private String itemno;
    private String name;
    private double price;
    private int qty;

    void set(double price, int qty){  //price and qty are modified
        this.price = price;
        this.qty = qty;
    }
    public product(String itemno,String name){   //item no and name of
                            // product are given at the time of construction
        this.itemno = itemno;
        this.name = name;
    }
    void get(){
        System.out.println("Item no. = " + itemno+"\n"+ "Name = "+name+"\n"+"Price = "+price+"\n"+"quantity = "+qty);
    }
}
public class constructorpractise {
    public static void main(String[] args) {
        product p = new product("A75-90","can");
        p.set(34.89, 100);
        p.get();
    }
}

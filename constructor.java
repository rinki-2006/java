class employee{
    private String name;
    private int age;

    public employee(String name, int age){
        this.name = name;  //this is used to differentiate instance
                            // variables from constructor parameter
        this.age = age;
    }
    public void show(){
        System.out.println("Name = "+name +"\n"+ "Age = " + age);
    }
}
public class constructor{
    public static void main(String[] args) {
        employee e1 = new employee("rahul",34);
        e1.show();
    }
}

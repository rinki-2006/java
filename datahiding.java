class student1{
    private int age;
    private String name;

    void setinput(int fage, String fname){
        age = fage;
        name = fname;
    }
    void getdisplay(){
        System.out.println("Age = "+age+"\n"+"Name = "+name);
    }
}
public class datahiding {
    public static void main(String[] args) {
        student1 d1 = new student1();
        d1.setinput(19, "Rinki");
        d1.getdisplay();


    }
}

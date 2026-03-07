//instead of switch case we also use that
enum dept3{
    CS("John", "Block A"), IT("Smith", "Block B"),
    CIVIL("Riya", "Block C"), EC("Sonu", " Block D");  // this final is object

    String head;
    String location;


    private dept3(String head, String loc){
        this.head = head;
        location = loc;
    }
    public String getheadname(){
        return head;
    }
    public String getloacation(){
        return location;
    }
}
public class enumdemo3 {
    public static void main(String[] args) {
        dept3 d = dept3.CS;
        System.out.println(d.getheadname());
        System.out.println(d.getloacation());
    }
}

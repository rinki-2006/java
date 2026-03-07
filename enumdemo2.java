enum dept2{
    CS, IT, CIVIL, EC;

    private dept2(){
        System.out.print(this.name() + " " + "\n");  // get all value because constructor is called when enum is loaded
    }
    public void display(){
        System.out.print(this.name() + " " + this.ordinal());  //for CIVIL because d contain CIVIL
    }
}
public class enumdemo2 {
    public static void main(String[] args) {
        dept2 d = dept2.CIVIL;
        d.display();
//        switch (d){
//            case CS :
//                System.out.println("Head : john \nBlock : A");
//                break;
//            case IT :
//                System.out.println("Head : Smith \nBlock : B");
//                break;
//            case CIVIL :
//                System.out.println("Head : Riya \nBlock : C");
//                break;
//            case EC :
//                System.out.println("Head : sonu \nBlock : D");
//                break;
//
//        }
    }
}

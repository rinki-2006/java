class Rectangle1{
    int length = 1;
    int breadth = 1;
   Rectangle1(){  //non parametrized
       length = 1;
       breadth = 1;
   }
   Rectangle1(int l, int b){  // parametrized
       length = l;
       breadth = b;
   }
   int  area(){
       return length * breadth;
   }
}
class cuboid1 extends Rectangle1{
    int height;

    cuboid1(){
        height = 1;
    }

    cuboid1(int h){
        height = h;
    }
    cuboid1(int l, int b, int h){
        super(l,b);  // call Rectangle1(int l, int b)
            height = h;
        }


    int volume(){
        return area()*height;
    }
}
public class practisePCI {
    public static void main(String[] args) {
        cuboid1 c = new cuboid1(5, 10, 14);
        System.out.println(c.volume());
    }
}

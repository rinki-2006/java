// empty annotation understanding
import java.lang.annotation.Annotation;
@interface myanno{  // empty annotation

}
@myanno   //class leval
public class userdefinedannotation {
    @myanno       // instance variable also
    int data;
    @myanno       // method level
    public static void main(@myanno String[] args) {    // parameter level
    @myanno       // local variable level
            int x = 10;
    }
}

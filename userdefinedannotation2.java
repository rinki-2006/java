import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.CLASS)
@Target(value = ElementType.LOCAL_VARIABLE)
@interface MYanno{
    //this all is the information about the class so it is metadata
    String name();  // element of annotation
    String project();
    String date();
    String version() default "23.0.2";  // when we use default there is no need to mention it in annotation
}

public class userdefinedannotation2 {
    int data;

    public static void main(String[] args)
    {
        // we mention it in local variable because in target we mention local variable
        @MYanno(name = "Riya", project = "Bank", date = "6/3/26")  //riya is the developer of the class
        int x= 10;
    }
}

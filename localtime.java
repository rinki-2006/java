import java.time.LocalDateTime;
import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        //create another object for modification
        LocalTime lt1 = lt.minusHours(3);
        System.out.println(lt1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}

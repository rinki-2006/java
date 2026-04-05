import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.*;
public class datetimeformat {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(dt));

        // m stands for minute
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        System.out.println(df1.format(dt));

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df3.format(dt));


        // we use this because local datetime class don't use for zone
        ZonedDateTime zd = ZonedDateTime.now();
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh,mm,ss z");
        System.out.println(df4.format(zd));

        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
        System.out.println(df5.format(zd));
    }
}

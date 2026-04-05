import java.util.*;
import java.time.*;
public class newdateandtime {
    public static void main(String[] args) {
//        Date d = new Date();
//        d.setHours(21); // mutable
//        System.out.println(d);

        LocalDate dt = LocalDate.now();
        System.out.println(dt);
        LocalDate dt1 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dt1);
        LocalDate dt2 = LocalDate.now(ZoneId.of("Asia/Calcutta"));
        System.out.println(dt2);
        // date for specific value
        LocalDate dt3 = LocalDate.of(2026, Month.APRIL, 23);
        System.out.println(dt3);

        // EpochDay means starting date(1 JAN 1970)
        LocalDate DT4 = LocalDate.ofEpochDay(1);
        System.out.println(DT4);

        LocalDate dt5 = LocalDate.parse("2020-01-03");
        LocalDate dt6 = dt5.plusMonths(6);// it will not modify so, make new object
        System.out.println(dt6);


    }
}

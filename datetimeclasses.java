import java.time.*;

public class datetimeclasses {
    public static void main(String[] args) {
        // contain date , time , offset and zone
        ZonedDateTime zd = ZonedDateTime.now();
        System.out.println(zd);

        ZonedDateTime zd1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zd1);
// contain date , time and offset
        OffsetDateTime od = OffsetDateTime.now();
        System.out.println(od);

        MonthDay md = MonthDay.now();
        System.out.println(md);

        Period p = Period.of(2, 2, 30);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);

    }
}

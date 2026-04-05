// old date and time
import java.util.*;
public class dateandtime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());  // get millisecond since 1Jan 1970 till current date
//        System.out.println(System.currentTimeMillis()/1000); // get second
//        System.out.println(System.currentTimeMillis()/1000/60); // get minute
//        System.out.println(System.currentTimeMillis()/1000/60/60); // get hour
//        System.out.println(System.currentTimeMillis()/1000/60/60/24); // get day
//        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); // get year

        Date d = new Date();
//        System.out.println(d); // print current date and time
        System.out.println(d.getTime()); //get time in millisecond
        System.out.println(d.getDate());
        System.out.println(d.getDay()); // which day from the week
        System.out.println(d.getMonth());


        Date d1 = new Date("10/23/2006"); // set as MM/DD/YY
//        System.out.println(d1);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());  // java set jan as 0 , so it set oct as 9 not 10
        System.out.println(d1.getYear()+1900);


    }
}

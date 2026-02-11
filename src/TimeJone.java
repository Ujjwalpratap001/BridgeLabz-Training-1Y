import java.time.ZonedDateTime;
import java.time.ZoneId;
public class TimeJone {
    public static void main(String[] args) {
        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));

        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // now printing the time

        System.out.println("Greenwich Mean Time (GMT) time : "+gmt);
        System.out.println("Indian Standard Time (IST) time : "+ist);
        System.out.println("Pacific Standard Time (PST) time : "+pst);
    }
}

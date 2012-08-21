import org.elasticsearch.common.joda.time.DateTime;
import org.elasticsearch.common.joda.time.format.DateTimeFormat;
import org.elasticsearch.common.joda.time.format.DateTimeFormatter;

public class TestDateTimeParse {
    public static void main(String[] args) {
        DateTimeFormatter FORMATTER = DateTimeFormat.forPattern("dd/MMM/yyyy:HH:mm:ss Z");
        DateTime dateTime = FORMATTER.parseDateTime("29/Mar/2012:11:56:45 +0900");
        System.out.println(dateTime.toDate().getTime());

        DateTimeFormatter FORMATTER2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        DateTime dateTime2 = FORMATTER2.parseDateTime("2012-12-30 11:56:45 +0900");
        System.out.println(dateTime2.toDate().getTime());

    }
}

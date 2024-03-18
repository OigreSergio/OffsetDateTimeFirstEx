import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime justOneJerAgo = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(justOneJerAgo);
        String dateString = justOneJerAgo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateString2 = justOneJerAgo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateString3 = justOneJerAgo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println(dateString);
        System.out.println(dateString2);
        System.out.println(dateString3);

    }
}

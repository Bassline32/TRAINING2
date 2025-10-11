import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class LondonTime {
    public static String getCurrentLondonTime() {

        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        //System.out.println("Сейчас в Лондоне: " + formatter.format(londonTime));
        return formatter.format(londonTime);

    }
}





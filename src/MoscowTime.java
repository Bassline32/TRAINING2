import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class MoscowTime {
    public static String getCurrentMoscowTime() {


        ZonedDateTime moscowTime = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
       // System.out.println("Сейчас в Москве: " + formatter.format(moscowTime));
        return formatter.format(moscowTime);

    }
}

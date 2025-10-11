import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class AtamiTime {
    public static void main(String[] args) {
        ZonedDateTime japanTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Сейчас в Атами(Япония) : " + formatter.format(japanTime));
    }
}
 










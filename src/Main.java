
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ( "Сейчас в Москве: " + MoscowTime.getCurrentMoscowTime());
        System.out.println (" Вы также можете узнать текущее время в Токио или Лондоне");
        System.out.println(" Для этого введите 1 (Токио) или 2 (Лондон)");
        int choice = scanner.nextInt();



    }
    }
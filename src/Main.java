
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ( "Сейчас в Москве: " + MoscowTime.getCurrentMoscowTime());
        System.out.println (" Вы также можете узнать текущее время в Токио или Лондоне");

        boolean timeChoice = false;

        while (!timeChoice) {
        System.out.println(" Для этого введите 1 (Токио) или 2 (Лондон)");
        if (scanner.hasNextInt()){
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Сейчас в Токио: " + AtamiTime.getCurrentTokyoTime());
                timeChoice = true;
                break;

            case 2:
                System.out.println("Сейчас в Лондоне: " + LondonTime.getCurrentLondonTime());
                timeChoice = true;
                break;

            default:
                System.out.println("Ошибка: введено неправильное число. Попробуйте снова.");
                break;
        }
        } else {
            System.out.println("Ошибка: введено не число. Попробуйте снова.");
            scanner.next();
        }
    }
}
}
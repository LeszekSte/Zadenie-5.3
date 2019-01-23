import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY);

        final double powMin = 6;
        final double powMax = 100;

        System.out.printf("Podaj powierzchnię pokoju w zakresie od %.0f do %.0f\n", powMin, powMax);
        double powRoom = sc.nextDouble();
        sc.nextLine();
        if (powRoom < powMin || powRoom > powMax) {
            System.out.println("Zła powierzchnia pokoju - Kończę program ");
        } else {
            System.out.println("Podaj temperaturę w pokoju ");
            double tempWPokoju = sc.nextDouble();
            sc.nextLine();
            sc.close();
            Room room = new Room(powRoom, tempWPokoju, true);

            System.out.println("Temperatura początkowa - " + room.getTemperature());
            System.out.println("Czy obniżono temp lub czy jest klima ? - " + room.testTemperaturyRoom());
            System.out.println("Temperatura na koniec - " + room.getTemperature());
        }
    }
}

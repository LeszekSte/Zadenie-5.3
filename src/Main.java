import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY);


        System.out.println("Podaj temperaturę w pokoju ");
        double tempWPokoju = sc.nextDouble();
        sc.nextLine();
        sc.close();

        Room room = new  Room(45,tempWPokoju,true);

        System.out.println("Temperatura początkowa - " + room.getTemperature());
        System.out.println("Czy obniżono temp lub czy jest klima ? - " +room.testTemperaturyRoom(room));
        System.out.println("Temperatura na koniec - " + room.getTemperature());



    }
}

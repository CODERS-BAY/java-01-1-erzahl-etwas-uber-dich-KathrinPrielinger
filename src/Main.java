
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String fistName = "Kathrin";
        String lastName = "Prielinger";
        int age = 39;
        boolean married = true;
        boolean female = true;
        Date birthDate = new Date (381366000000L); // epoche Milli-Seconds: Mein Geburtsdatum in Millisekunden: L steht für den Datentyp Long

        System.out.println("Mein Name ist " + fistName + " " + lastName + ".");
        System.out.println("Mein Geburtstag ist am " + birthDate + ".");
        System.out.println("Ich bin weiblich " + female + " und verheiratet " + married + ".");
    }
}
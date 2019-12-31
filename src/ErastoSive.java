import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ErastoSive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Boolean> number = new ArrayList<>();
        String answer = "t";
        while (answer.equalsIgnoreCase("t")) {

            System.out.println("Podaj liczbę do której mam " +
                    "wyznaczyć liczby pierwsze: ");
            int max = scanner.nextInt();

            for (int i = 0; i <= max; i++) {
                number.add(true);
            }

            for (int i = 2; i * i <= max; i++) {

                if (number.get(i)) {

                    for (int j = 2; j * i <= max; j++) {
                        number.set(j * i, false);
                    }
                }
            }

            System.out.println("W zakresie do " + max + " liczby pierwsze to:");

            for (int n = 2; n < number.size(); n++) {
                if (number.get(n)) {
                    System.out.print(n + " ");
                }
            }
            number.clear();
            System.out.println("\nJeszcze raz? (t/n)");
            answer = scanner.next();
        }

        System.out.println("Koniec");
    }
}


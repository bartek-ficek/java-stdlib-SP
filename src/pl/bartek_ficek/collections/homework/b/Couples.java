package pl.bartek_ficek.collections.homework.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Couples {

    private final Scanner scanner = new Scanner(System.in);
    private Map<String, String> couples = new HashMap<>();

    public void addCouple() {
        do {
            System.out.println("Please type first person name from couple and hit Enter to confirm. To finish adding type \"-\".");
            String keyName = scanner.next();
            if (keyName.equals("-")) {
                break;
            }
            System.out.println("Please type second person name from couple and hit Enter to confirm.");
            String valueName = scanner.next();


        } while (true);
    }
}
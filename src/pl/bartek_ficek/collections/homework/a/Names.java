package pl.bartek_ficek.collections.homework.a;

import java.util.List;
import java.util.Scanner;

public class Names {

    Scanner scanner = new Scanner(System.in);
    private List<String> names;

    public void addToList() {
        do {
            System.out.println("Type name and hit the Enter to add it to list. If you want to break adding type \"-\".\n");
            String name = scanner.next();
            if (name.equals("-")) {
                break;
            }
            names.add(name);
        } while (true);
    }
}

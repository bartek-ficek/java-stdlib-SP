package pl.bartek_ficek.collections.homework.a;

import java.util.*;

public class Names {

    private final Scanner scanner = new Scanner(System.in);
    private List<String> names = new ArrayList<>();

    public void addToList() {
        do {
            System.out.println("\nType name and hit the Enter to add it to list. If you want to break adding type \"-\".\n");
            String name = scanner.next();
            if (name.equals("-")) {
                System.out.println(Arrays.toString(names.toArray()));
                Set<String> uniqueNames = new HashSet<>(names);
                System.out.println("You have " + uniqueNames.size() + " on your list.");
                break;
            }
            names.add(name);
        } while (true);
    }
}
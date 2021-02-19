package pl.bartek_ficek.collections.homework;

import pl.bartek_ficek.collections.homework.a.Names;
import pl.bartek_ficek.collections.homework.b.Couples;

import java.util.Scanner;

public class HomeworksResults {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Homework a result:
//        Names names = new Names();
//        names.addToList();

//        Homework b result:
        Couples couples = new Couples();
        couples.addCouple();

        do {
            System.out.println("\nType name to check second one from the couple. To finish type \"-\".");
            String givenName = scanner.next();
            if (givenName.equals("-")) break;
            couples.checkCoupleSecondName(givenName);

        } while (true);
    }
}

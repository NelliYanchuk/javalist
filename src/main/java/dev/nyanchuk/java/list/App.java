package dev.nyanchuk.java.list;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // Create an instance of Week
        Week newWeek = new Week();

        // Create the list of days of the week
        newWeek.createDayList();

        // Return the days of the week
        newWeek.getAllDaysOfWeek();

        // Sort the days
        newWeek.sortDayInWeek();

        // Return the length of the list week
        newWeek.getListLength();

        Scanner scanner = new Scanner(System.in);

        // Get a requested day of the week
        System.out.println("\n5. Enter a day number (1 to 7) to see its name:");
        String input = scanner.nextLine();
        newWeek.getDay(input);

        // If requested day exists in the list
        System.out.println("\n6. Enter a day to check if exists in the week:");
        String name = scanner.nextLine();
        newWeek.ifDayExists(name);

        // Delete a day of the week
        newWeek.deleteDay(scanner);

        // Clear the list
        newWeek.clearWeek();

        scanner.close();
    }

}

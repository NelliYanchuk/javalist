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
        System.out.println("\nNew week is created.");

        // Return the days of the week
        newWeek.getAllDaysOfWeek();

        // Return the length of the list week
        newWeek.getListLength();

        Scanner scanner = new Scanner(System.in);

        // Get a requested day of the week
        System.out.println("\nEnter a day number (1 to 7) to see its name:");
        String input = scanner.nextLine();
        // Get the returned String
        String dayResult = newWeek.getDay(input);
        System.out.println(dayResult);

        // If requested day exists in the list
        System.out.println("\nEnter a day to check if exists in the week:");
        input = scanner.nextLine();
        newWeek.ifDayExists(input);

        // Sort the days
        newWeek.sortDayInWeek();

        // Clear the list
        newWeek.clearWeek();

        System.out.println("\nCreating day list once again after deleting.");
        newWeek.createDayList();
        newWeek.getAllDaysOfWeek();

        // Delete a day of the week
        System.out.println("\nEnter a day number to remove it from the week");
        input = scanner.nextLine();
        newWeek.deleteDay(input);

        System.out.println("\nThanks for playing with me. See you soon!");
        scanner.close();

    }

}

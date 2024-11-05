package dev.nyanchuk.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Week {

    // Initialization
    public List<Day> week;
    int num;

    // Constructor
    public Week() {
        week = new ArrayList<>();
    }

    // Method to create the list of days of the week
    public void createDayList() {
        for (Day day : Day.values()) {
            week.add(day);
        }
        System.out.println("\n1. New week is created.");
    }

    // Getter to return the days of the week
    public void getAllDaysOfWeek() {
        System.out.println("\n2. The days of the week are:");
        System.out.println(week);
    }

    // Metod to sort days in alphabetical order
    public void sortDayInWeek() {
        System.out.println("\n3. Ordered days are:");
        Collections.sort(week, Comparator.comparing(Day::name));
        System.out.println(week);
    }

    // Metod to return list length
    public void getListLength() {
        System.out.println("\n4. The length of the week is: " + week.size());
    }

    // Method to get a day
    public void getDay(Scanner scanner) {
        System.out.println("\n5. Enter a day number (1 to 7) to see its name:");
        String input = scanner.nextLine();

        num = Integer.parseInt(input); // Convert the input to an integer
        if ((num >= 1) && (num <= week.size())) {
            System.out.println("Day " + num + " is: " + week.get(num - 1));
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    // Metod to check if day exists
    public void ifDayExists(Scanner scanner) {
        System.out.println("\n6. Enter a day to check if exists in the week:");
        String name = scanner.nextLine();
        for (Day day : week) {
            if (day.name().equalsIgnoreCase(name)) {
                System.out.println("Yes, " + name + " day exists.");
                return;
            }
        }
        System.out.println("No, " + name + " day does not exist.");
    }

    // Metod to delete a day from the list
    public void deleteDay(Scanner scanner) {
        System.out.println("\n7. Enter a day number to remove it from the week");
        String input = scanner.nextLine();
        num = Integer.parseInt(input);

        if ((num >= 1) && (num <= week.size())) {
            System.out.println(week.get(num - 1) + " is deleted.");
            week.remove(num - 1);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        System.out.println(week);
    }

    // Metod to clear the list
    public void clearWeek() {
        System.out.println("\n8. Remove all from the week");
        week.removeAll(week);
        System.out.println(week);
        System.out.println("week is empty now");
    }

}

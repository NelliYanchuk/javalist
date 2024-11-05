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
    public List<Day> getAllDaysOfWeek() {
        System.out.println("\n2. The days of the week are:");
        System.out.println(week);
        return week;
    }

    // Method to sort days in alphabetical order
    public void sortDayInWeek() {
        System.out.println("\n3. Ordered days are:");
        Collections.sort(week, Comparator.comparing(Day::name));
        System.out.println(week);
    }

    // Method to return list length
    public int getListLength() {
        System.out.println("\n4. The length of the week is: " + week.size());
        return week.size();
    }

    // Method to get a day
    public String getDay(String input) {
        try {
            num = Integer.parseInt(input);
            if (num >= 1 && num <= week.size()) {
                return "Day " + num + " is: " + week.get(num - 1);
            } else {
                return "Invalid input. Please enter 1 to 7.";
            }
        } catch (NumberFormatException e) {
            return "Invalid input. This is not a number.";
        }
    }

    // Method to check if day exists
    public boolean ifDayExists(String name) {
        for (Day day : week) {
            if (day.name().equalsIgnoreCase(name)) {
                System.out.println("Yes, " + name + " day exists.");
                return true;
            }
        }
        System.out.println("No, " + name + " day does not exist.");
        return false;
    }

    // Method to delete a day from the list
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

    // Method to clear the list
    public void clearWeek() {
        System.out.println("\n8. Remove all from the week");
        week.removeAll(week);
        System.out.println(week);
        System.out.println("week is empty now");
    }

}

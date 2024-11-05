package dev.nyanchuk.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    }

    // Get all days of the week
    public List<Day> getAllDaysOfWeek() {
        System.out.println("\nThe days of the week are:");
        System.out.println(week);
        return week;
    }

    // Method to sort days in alphabetical order
    public List<Day> sortDayInWeek() {
        System.out.println("\nAlphabetical ordered days are:");
        Collections.sort(week, Comparator.comparing(Day::name));
        System.out.println(week);
        return week;
    }

    // Method to return list length
    public int getListLength() {
        System.out.println("\nThe length of the week is: " + week.size());
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
                System.out.println("Yes, " + name + " exists.");
                return true;
            }
        }
        System.out.println("No, " + name + " day does not exist.");
        return false;
    }

    // Method to delete a day from the list
    public List<Day> deleteDay(String input) {

        try {
            num = Integer.parseInt(input);
            if ((num >= 1) && (num <= week.size())) {
                System.out.println(week.get(num - 1) + " is deleted.");
                week.remove(num - 1);
                System.out.println(week);
                return week;

            } else {
                System.out.println("Invalid input. Please enter 1 to 7.");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. This is not a number.");
            return null;
        }

    }

    // Method to clear the list
    public List<Day> clearWeek() {
        System.out.println("\nRemove all days from week");
        week.removeAll(week);
        System.out.println("week is empty now");
        return week;
    }

}

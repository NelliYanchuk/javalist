package dev.nyanchuk.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week {

    // Initialization
    public List<Day> week;

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

    // Metod to return list length
    public void getListLength() {
        System.out.println("\n3. The length of the week is: " + week.size());
    }

    // Metod to delete a day from the list
    public void deleteDay(Scanner scanner) {
        System.out.println("\n4. Enter a day number to remove it from the week");
        int num = scanner.nextInt();
        week.remove(num-1);
        System.out.println(week);
    }

    // Metod to get a day
    public void getDay(Scanner scanner) {
        System.out.println("\n5. Enter a day number (1 to 7) to see its name:");
        int num = scanner.nextInt();
    
        if ((num >= 1) && (num <= week.size())) {
            System.out.println("Day " + num + " is: " + week.get(num - 1));
        } else {
            System.out.println("Invalid day number.");
        }
    }
    
}

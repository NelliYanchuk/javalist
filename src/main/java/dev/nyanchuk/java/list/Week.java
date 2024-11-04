package dev.nyanchuk.java.list;

import java.util.ArrayList;
import java.util.List;

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
    public List<Day> getDaysOfWeek() {
        System.out.println("\n2. The days of the week are:");
        return week;
    }

    // Metod to return list length
    public void getListLength() {
        System.out.println("\n3. The length of the week is: " + week.size());
    }
}

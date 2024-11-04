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
        System.out.println("New week is created.");
    }

    // Getter to return the days of the week
    public List<Day> getDaysOfWeek() {
        return week;
    }
}

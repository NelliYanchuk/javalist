package dev.nyanchuk.java.list;

import java.util.ArrayList;
import java.util.List;

public class Week {

    // Initialization
    private List<Day> days;

    // Constructor
    public Week() {
        this.days = new ArrayList<>();
        initializeWeek();
    }

    // Initialize the week with all days
    private void initializeWeek() {
        for (Day day : Day.values()) {
            days.add(day);
        }
    }
}

package dev.nyanchuk.java.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WeekTest {
    private Week week;

    @BeforeEach
    // Initialize week list with days
    public void setUp() {
        week = new Week();
        week.createDayList(); 
    }

    // ----- testCreateDayList -----
    @Test
    public void testCreateDayList() {
        // Verify that the week list contains all 7 days
        assertEquals(7, week.week.size());
        assertEquals(
            Arrays.asList(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY,Day.SUNDAY),week.week);
    }

    // ----- testGetAllDaysOfWeek -----
    @Test
    public void testGetAllDaysOfWeek() {
        List<Day> expectedDays = Arrays.asList(
                Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY,
                Day.FRIDAY, Day.SATURDAY, Day.SUNDAY);

        // Get the actual days of the week from the method
        List<Day> actualDays = week.getAllDaysOfWeek();

        assertEquals(expectedDays, actualDays);
    }

    // ----- testGetDay -----
    @Test
    public void testGetDay() {
        // Test valid number (1)
        assertEquals("Day 1 is: MONDAY", week.getDay("1"));

        // Test out-of-range number (0)
        assertEquals("Invalid input. Please enter 1 to 7.", week.getDay("0"));

        // Test char ("k")
        assertEquals("Invalid input. This is not a number.", week.getDay("k"));
    }

    // ----- testSortDayInWeek -----
    @Test
    public void testSortDayInWeek() {
        // Expected order in alphabetical sorting
        List<Day> expectedOrder = Arrays.asList(
            Day.FRIDAY, Day.MONDAY, Day.SATURDAY, Day.SUNDAY, 
            Day.THURSDAY, Day.TUESDAY, Day.WEDNESDAY
        );

        // Get the sorted list from the method
        List<Day> sortedDays = week.sortDayInWeek();

        assertEquals(expectedOrder, sortedDays);
    }

    // ----- testGetListLength -----
    @Test
    public void testGetListLength() {
        // Check that the length of the week is correct
        assertEquals(7, week.getListLength());
    }

    // ----- testIfDayExists -----
    @Test
    public void testIfDayExists() {
        // Test Uppercase
        assertTrue(week.ifDayExists("MONDAY"), "MONDAY should exist in the week.");

        // Test lowercase
        assertTrue(week.ifDayExists("friday"), "friday (case-insensitive) should exist in the week.");

        // Test non-exist value
        assertFalse(week.ifDayExists("NEWday"), "NEWday should not exist in the week.");
    }

    /* @Test
    public void testDeleteDay() {
        // Test removing a day by its index and check the list's new state
        int initialSize = week.week.size();
        week.week.remove(Day.FRIDAY);
        assertEquals(initialSize - 1, week.week.size(), "After deletion, the week should have one less day.");
        assertFalse(week.week.contains(Day.FRIDAY), "FRIDAY should no longer exist in the week after deletion.");
    } */

   /*  @Test
    public void testClearWeek() {
        // Clear all days and check if the list is empty
        week.clearWeek();
        assertTrue(week.week.isEmpty(), "The week should be empty after calling clearWeek.");
    } */
}

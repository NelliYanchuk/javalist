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

        // Return the length of the list week
        newWeek.getListLength();

        Scanner scanner = new Scanner(System.in);

        //Remove a day of the week
        newWeek.getDay(scanner);

                            /*"\n6. To return whether the requested day exists in the list" +
                            "\n7. To sort the list of days in alphabetical order" +
                            "\n8. To clear the list");  */
        
        //Delete a day of the week
        newWeek.deleteDay(scanner);

    scanner.close();
    }

}

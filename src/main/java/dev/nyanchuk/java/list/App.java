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
        System.out.println(newWeek.getDaysOfWeek());

        // Return the length of the list week
        newWeek.getListLength();

        /* Scanner scanner = new Scanner(System.in);
                            "\n3. To return the length of the list" +
                            "\n4. To remove a day of the week" +
                            "\n5. To return the requested day of the week" +
                            "\n6. To return whether the requested day exists in the list" +
                            "\n7. To sort the list of days in alphabetical order" +
                            "\n8. To clear the list");
        
        int optioNum = scanner.nextInt();

        switch(optioNum) {
            case 1: newWeek.createDayList();
            break; 
            case 2: newWeek.getDaysOfWeek();
            break;
            default: System.out.println("\nIncorrect number. Please try again.");
          }

    scanner.close(); */
    }

}

package ex6_4;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        // Define arrays for months with 31, 30, and February
        String[] Month_31 = {"January", "Jan.", "Jan", "1", 
                             "March", "Mar.", "Mar", "3",
                             "May", "5",
                             "July", "Jul", "7",
                             "August", "Aug.", "Aug", "8",
                             "October", "Oct.", "Oct", "10",
                             "December", "Dec.", "Dec", "12"};
                             
        String[] Month_30 = {"April", "Apr.", "Apr", "4",
                             "June", "Jun", "6",
                             "September", "Sept.", "Sep", "9",
                             "November", "Nov.", "Nov", "11"};
                             
        String[] Month_2 = {"February", "Feb.", "Feb", "2"};
        
        // Initialize a single Scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int iYear;
            
            // Input year and check if it's valid
            while (true) {
                System.out.print("Year: ");
                iYear = scanner.nextInt();  // Input for year
                if (iYear >= 0) {
                    break;  // Exit if the year is non-negative
                } else {
                    System.out.println("Invalid year! Please enter a positive number.");
                }
            }

            // Input month
            System.out.print("Enter month: ");
            scanner.nextLine();  // Consume leftover newline from nextInt()
            String strMonth = scanner.nextLine();  // Input for month

            // Check if month is one of the months with 31 days
            for (String s : Month_31) {
                if (s.equalsIgnoreCase(strMonth)) {
                    System.out.println("Month " + s + " Year " + iYear + " has 31 days.");
                    scanner.close();
                    return;
                }
            }

            // Check if month is one of the months with 30 days
            for (String s : Month_30) {
                if (s.equalsIgnoreCase(strMonth)) {
                    System.out.println("Month " + s + " Year " + iYear + " has 30 days.");
                    scanner.close();
                    return;
                }
            }

            // Check if the month is February and handle leap year calculation
            for (String s : Month_2) {
                if (s.equalsIgnoreCase(strMonth)) {
                    if ((iYear % 4 == 0 && iYear % 100 != 0) || iYear % 400 == 0) {
                        System.out.println("Month " + s + " Year " + iYear + " has 29 days (Leap Year).");
                    } else {
                        System.out.println("Month " + s + " Year " + iYear + " has 28 days.");
                    }
                    scanner.close();
                    return;
                }
            }

            // If the input is not valid, prompt the user to try again
            System.out.println("Invalid month or year! Please try again.\n");
        }
    }
}

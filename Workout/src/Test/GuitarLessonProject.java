package Test;
import java.util.Scanner;

public class GuitarLessonProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A. Get membership type and set membership details
        String membershipType = getMembershipType();
        int freeLessonsIncluded = getMaxFreeLessons(membershipType);
        double baseCost = getBaseCost(membershipType);
        double hourlyRate = getHourlyRate(membershipType);

        // B. Display information about the user's membership
        displayMembershipInfo(membershipType, freeLessonsIncluded, hourlyRate, baseCost);

        // C. Book guitar lessons
        int totalLessonsBooked = 0;
        double totalHours = 0;
        double totalCharges = 0;
        String continueBooking = "yes";

        while (continueBooking.equalsIgnoreCase("yes")) {
            double hoursBooked = getHoursBooked(membershipType, freeLessonsIncluded, hourlyRate);
            double lessonCost = calculateLessonCost(freeLessonsIncluded, hourlyRate, hoursBooked);
            freeLessonsIncluded--;
            totalLessonsBooked++;
            totalHours += hoursBooked;
            totalCharges += lessonCost;

            System.out.print("Do you want to book another lesson? (yes/no): ");
            continueBooking = scanner.nextLine();
        }

        // Display the final invoice
        displayInvoice(baseCost, totalLessonsBooked, totalHours, totalCharges);
    }

    /**
     *1. Gets the membership type from the user.
     * Validates the input to ensure it's either "silver" or "gold".
     * @return The validated membership type.
     */
    public static String getMembershipType() {
        Scanner scanner = new Scanner(System.in);
        String membershipType;
        System.out.println("Book your Guitar lessons Today !");
        do {
            System.out.print("Enter your membership type: 'Silver' or 'Gold': ");
            membershipType = scanner.nextLine();
        } while (!membershipType.equalsIgnoreCase("Silver") && !membershipType.equalsIgnoreCase("Gold"));

        return membershipType;
    }

    /**
     * 2. Gets the base cost of the membership based on the membership type.
     * @param  The type of membership ("Silver" or "Gold").
     * @return The base cost of the membership.
     */
    public static double getBaseCost(String membershipType) {
    	if(membershipType.equals("Silver")) {
    		return 56.45;
    	} else {
    		return 75.85;
    	}
    }

    /**
     * 3.Gets the maximum number of free lessons included in the membership based on the membership type.
     * @param membershipType The type of membership ("Silver" or "Gold").
     * @return The maximum number of free lessons included.
     */
    public static int getMaxFreeLessons(String membershipType) {
    	if(membershipType.equals("Silver")) {
    		return 1;
    	} else {
    		return 3;
    	}
    }
    
    /**
     * 4. Gets the hourly rate of guitar lessons based on the membership type.
     * @param membershipType The type of membership ("silver" or "gold").
     * @return The hourly rate of guitar lessons.
     */
    public static double getHourlyRate(String membershipType) {
    	if(membershipType.equals("Silver")) {
    		return 18.95;
    	} else {
    		return 16.75;
    	}
    }

    /** 5.
     * Prompts the user to enter the number of hours booked for a guitar lesson.
     * Validates the input to ensure it's between 1 and 3.5 hours.
     * @param membershipType The type of membership ("Silver" or "Gold").
     * @param remainingFreeSessions The remaining number of free sessions in the membership.
     * @param hourlyRate The hourly rate for the membership.
     * @return The validated number of hours booked for the lesson.
     */
    public static double getHoursBooked(String membershipType, int remainingFreeSessions, double hourlyRate) {
        Scanner scanner = new Scanner(System.in);
        double hoursBooked;

        do {
            System.out.print("Enter the number of hours for the lesson (1 to 3.5): ");
            hoursBooked = scanner.nextDouble();
            scanner.nextLine();
        } while (hoursBooked < 1 || hoursBooked > 3.5);

        return hoursBooked;
    }

    /**
     * 6.Displays information about the user's membership.
     * @param membershipType The type of membership ("Silver" or "Gold").
     * @param freeLessonsIncluded The number of free lessons included in the membership.
     * @param hourlyRate The hourly rate for guitar lessons.
     * @param baseCost The base cost of the membership.
     */
    public static void displayMembershipInfo(String membershipType, int freeLessonsIncluded, double hourlyRate, double baseCost) {
        System.out.println();
    	System.out.println("Membership Information:");
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Free Lessons Included: " + freeLessonsIncluded);
        System.out.println("Hourly Rate: $" + hourlyRate + " per hour");
        System.out.println("Base Cost: $" + baseCost);
    }

    /**
     * 7. Displays the final invoice for the user's membership and guitar lessons.
     * @param baseCost The base cost of the membership.
     * @param totalLessonsBooked The total number of lessons booked.
     * @param totalHours The total number of hours booked for guitar lessons.
     * @param totalCharges The total charges for guitar lessons.
     */
    public static void displayInvoice(double baseCost, int totalLessonsBooked, double totalHours, double totalCharges) {
        double totalMembershipCost = baseCost - totalCharges;
        System.out.println();
        System.out.println("Invoice:");
        System.out.println("Base Cost of Membership: $" + baseCost);
        System.out.println("Total Lessons Booked: " + totalLessonsBooked);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Lesson Charges: $" + totalCharges);
        System.out.println("Total Membership Charges: $" + totalMembershipCost);
    }

    /**
     * 8. Calculates the price of a single guitar lesson.
     * @param remainingFreeSessions The remaining number of free sessions in the membership.
     * @param hourlyRate The hourly rate for guitar lessons.
     * @param hoursBooked The number of hours booked for the guitar lesson.
     * @return The calculated price of the lesson.
     */
    public static double calculateLessonCost(int remainingFreeSessions, double hourlyRate, double hoursBooked) {
        if (remainingFreeSessions > 0) {
            remainingFreeSessions--;
            return 0;
        } else {
            return hourlyRate * hoursBooked;
        }
    }
}

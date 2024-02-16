import java.util.Scanner;

public class CalculateGradeAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // How many do you lessons?
        System.out.println("Enter the number of courses:");
        int numberOfCourses = scanner.nextInt();

        // // We give initial values for defining the credit points and credit hours.
        double totalCreditPoints = 0;
        double totalCreditHours = 0;

        // We create loops for each lesson
        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.println("Enter Your First Quiz Point for Course " + i + "?");
            int firstQuiz = scanner.nextInt();

            System.out.println("Enter Your Second Quiz Point for Course " + i + "?");
            int secondQuiz = scanner.nextInt();

            System.out.println("Enter Credit Hours for Course " + i + "?");
            double creditHours = scanner.nextDouble();

            // Calculate Credit Point and Course Average for everyone.
            double courseAverage = (firstQuiz * 0.4) + (secondQuiz * 0.6);
            double courseCreditPoint = creditPointCalculate(courseAverage);

            // Update total credit point and credit hours
            totalCreditPoints += courseCreditPoint * creditHours;
            totalCreditHours += creditHours;
        }

        // Calculate General Grade Average
        double generalAverageGrade = totalCreditPoints / totalCreditHours;
        System.out.println("General Average Grade: " + generalAverageGrade);
    }

    // We convert the system of 100 to the system of 4
    public static double creditPointCalculate(double point) {
        if (point >= 90) {
            return 4.0;
        } else if (point >= 80) {
            return 3.5;
        } else if (point >= 70) {
            return 3.0;
        } else if (point >= 65) {
            return 2.5;
        } else if (point >= 60) {
            return 2.0;
        } else if (point >= 50) {
            return 1.5;
        } else if (point >= 30) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

}
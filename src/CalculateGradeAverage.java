import java.util.Scanner;

public class CalculateGradeAverage {
    public static void main(String[] args) {

        // We are want to learn users points so we use Scanner and then we convert to double type them.
        Scanner point = new Scanner(System.in);
        System.out.println("Enter Your First Math Quiz Point?");
        int firstMathQuiz = point.nextInt();
        System.out.println("Enter Your Second Math Quiz Point?");
        int secondMathQuiz = point.nextInt();

        System.out.println("Enter Your First Physics Quiz Point?");
        int firstPhysicsQuiz = point.nextInt();
        System.out.println("Enter Your Second Physics Quiz Point?");
        int secondPhysicsQuiz = point.nextInt();

        System.out.println("Enter Mathematical Lessons Hours");
        int mathHours = point.nextInt();

        System.out.println("Enter Physics Lessons Hours");
        double physicsHours = point.nextDouble();

        // This function is our main function. It find general average.
        System.out.println(calculate(firstMathQuiz, secondMathQuiz, firstPhysicsQuiz, secondPhysicsQuiz, mathHours,physicsHours));

    }

    public static double calculate(double firstMathQuiz, double secondMathQuiz,
                                   double firstPhysicsQuiz, double secondPhysicsQuiz,
                                   double mathHours, double physicsHours) {

        // We get 40% of the midterm and 60% of the final and we determine lessons average.
        double mathAverage = ((firstMathQuiz * 0.4) + (secondMathQuiz * 0.6));
        double physicsAverage = ((firstPhysicsQuiz * 0.4) + (secondPhysicsQuiz * 0.6));

        // We find the corresponding score of each course in the 4-point system.
        double mathCreditPoint = creditPointCalculate(mathAverage);
        double physicsCreditPoint = creditPointCalculate(physicsAverage);


        // To calculate the GPA, find the weighted average of each course according to the number of credits.
        double generalAverageGrade = (mathCreditPoint * mathHours + physicsCreditPoint * physicsHours) / (mathHours + physicsHours);

        return generalAverageGrade;

    }

    // Convert credit scores to 4-point system.
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
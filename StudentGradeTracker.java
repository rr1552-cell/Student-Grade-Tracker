import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades would you like to enter? ");
        int numberOfGrades = input.nextInt();

        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }

        double total = 0;
        double highest = grades[0];
        double lowest = grades[0];

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = total / grades.length;
        char letterGrade;

        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("\n----- Student Grade Summary -----");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.printf("Highest Grade: %.2f%n", highest);
        System.out.printf("Lowest Grade: %.2f%n", lowest);

        input.close();
    }
}

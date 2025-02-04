import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int grade;
        while (true) {
            System.out.print("Enter a grade: ");
            grade = scnr.nextInt();
            if  (grade <0) {
                System.out.println("Existing Program");
                break;
            }
            if (grade > 100) {
                System.out.println("Grade out of range. Please enter a number between 0 and 100.");
                continue;
            }
            if (grade >=90) {
                System.out.println("Grade: A");
            } else if (grade >= 80) {
                System.out.println("Grade: B");
            } else if (grade >= 70) {
                System.out.println("Grade: C");
            } else if (grade >=60) {
                System.out.println("Grade:D");
            } else  {
                System.out.println("Grade: F");
            }
        }
    }
}
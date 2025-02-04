import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int number = scnr.nextInt();
            if (number <= 0) {
                System.out.println("Exiting Program");
                break;
            }
            int sum = 0;
            int tempNumber = number;
            while (tempNumber > 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }
            System.out.println("Sum of digits: " + sum);
        }
    }
}
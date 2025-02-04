import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scnr.nextLine();
        String reversedString = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedString += userInput.charAt(i);
        }
        System.out.println("Reversed string: " + reversedString);
    }
}
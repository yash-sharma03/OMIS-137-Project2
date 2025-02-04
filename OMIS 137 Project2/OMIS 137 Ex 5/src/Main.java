import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        char searchChar;
        boolean found = false;
        System.out.print("Enter a string: ");
        userInput = scnr.nextLine();
        System.out.print("Enter a character to search for: ");
        searchChar = scnr.next().charAt(0);
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == searchChar) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The character  " + searchChar + " is found in the string.");
        } else {
            System.out.println("The character  " + searchChar + " is not found in the string.");
        }
    }
}
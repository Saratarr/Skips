import java.util.Scanner;

public class Main {

    String a = ("1. Select Skip Total Amount \n");
    String b = ("2. Skip 5 Times \n");
    String c = ("3. Edit Skip Total Amount \n");
    String d = ("4. Show Total \n");
    String e = ("\tInvalid input entered. Please choose a valid input from the main menu.");

    public static void main(String[] args) {
        skipWelcome();
        skipMenu();
        Scanner scanner = new Scanner(System.in); // creates scanner
        System.out.print("> "); // user prompt
        
        int choice = 0;
        int input = scanner.nextInt(); // read user input
        input = choice;
        scanner.close();
    }

    static void skipWelcome() {
        System.out.println("\nWelcome to Skips, a skipping program.");
        System.out.println("Please choose one of the following options: \n");
    }

    static void skipMenu() {
        System.out.println("\tMain Menu:");
        System.out.println("1. Select Skip Amount");
        System.out.println("2. Skip 5 Times");
        System.out.println("3. Edit Skip Amount");
        System.out.println("4. Show Total");
    }

}

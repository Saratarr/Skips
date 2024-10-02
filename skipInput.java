import java.util.Scanner;

public class skipInput {

    public static void askChoice() {
        Main skipInput = new Main();

        Scanner scanner = new Scanner(System.in); // creates scanner
        System.out.println(">"); // user prompt
        
        int input = scanner.nextInt(); // read user input
        
        int choice = input;


        if (choice == 1) {
            System.out.println(skipInput.a);
            System.out.println("Please choose a numerical value for each skip.");
            int skipAmount = scanner.nextInt();
            // MATH for skipAmount value
            System.out.println("Skip value is set at " + skipAmount);
            new skipMenu();
        }
        else if (choice == 2) {
            System.out.println(skipInput.b);
            System.out.println("Your total has skipped 5 times via the set value.");
            // MATH of skipAmount * 5 + total
            skipMenu();
        }
        else if (choice == 3) {
            System.out.println(skipInput.c);
            System.out.println("Please select a new numerical value for each skip.");
            int inputEdit = scanner.nextInt();
            // MATH of new skipAmount value
            System.out.println("The new skip value is set at " + inputEdit);
            skipMenu();
        }
        else if (choice == 4) {
            System.out.println(skipInput.d);
            // MATH of total
            System.out.println("The current total value is: " + total);
            skipMenu();
        }
        else (choice >= 5) {
            System.out.println(skipInput.e);
            skipMenu();

        }
    }
}

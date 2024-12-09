import java.util.Hashtable;
import java.util.Scanner;

public class HashingNameEmail {
    public static void main(String[] args) {
        // Create a hash table to store user data where the key is the name and the value is the email
        Hashtable<String, String> userTable = new Hashtable<>();
        
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Variable to store the user's menu choice
        String choice;

        // Start the main loop, which will continue until the user chooses to exit
        do {
            // Display the menu to the user
            System.out.println("\nMenu:");
            System.out.println("1. Add User");
            System.out.println("2. Find User");
            System.out.println("3. Remove User");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            // Get the user's choice
            choice = scanner.nextLine();

            // Handle each choice with a switch statement
            switch (choice) {
                case "1": // Add User
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();  // Get the name from user input
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();  // Get the email from user input
                    userTable.put(name, email);  // Add the name and email to the hash table
                    System.out.println("User added successfully!");
                    break;
                case "2": // Find User
                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.nextLine();  // Get the name to search for
                    // Check if the name exists in the hash table
                    if (userTable.containsKey(searchName)) {
                        // Print the email if the name is found
                        System.out.println("Email: " + userTable.get(searchName));
                    } else {
                        // Inform the user if the name is not found
                        System.out.println("User not found!");
                    }
                    break;
                case "3": // Remove User
                    System.out.print("Enter Name to Remove: ");
                    String removeName = scanner.nextLine();  // Get the name to remove
                    // Try removing the user by name and check if the removal was successful
                    if (userTable.remove(removeName) != null) {
                        System.out.println("User removed successfully!");
                    } else {
                        // Inform the user if the name was not found
                        System.out.println("User not found!");
                    }
                    break;
                case "4": // Exit the application
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default: // Handle invalid input
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (!choice.equals("4"));  // Repeat the loop until the user chooses to exit

        scanner.close();  // Close the scanner object when done
    }
}

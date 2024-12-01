import java.util.Hashtable;
import java.util.Scanner;

public class HashingNameEmail {
    public static void main(String[] args) {
        // Create a hash table to store user data
        Hashtable<String, String> userTable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add User");
            System.out.println("2. Find User");
            System.out.println("3. Remove User");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1"://Add User
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    userTable.put(name, email);
                    System.out.println("User added successfully!");
                    break;
                case "2"://Search User
                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.nextLine();
                    if (userTable.containsKey(searchName)) {
                        System.out.println("Email: " + userTable.get(searchName));
                    } else {
                        System.out.println("User not found!");
                    }
                    break;
                case "3"://Remove User
                    System.out.print("Enter Name to Remove: ");
                    String removeName = scanner.nextLine();
                    if (userTable.remove(removeName) != null) {
                        System.out.println("User removed successfully!");
                    } else {
                        System.out.println("User not found!");
                    }
                    break;
                case "4"://Exit the console/program
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default://if invalid input
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}

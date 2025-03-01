import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        String username = console.readLine("Enter username: ");
        char[] password = console.readPassword("Enter password: ");

        System.out.println("\nUsername: " + username);
        System.out.println("Password entered successfully.");
    }
}
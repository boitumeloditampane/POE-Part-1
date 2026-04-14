import java.util.Scanner;

public class Login {
    public void login(Registration reg) {
        Scanner s = new Scanner(System.in);
        int attempts = 0;
        boolean success = false;

        while (attempts < 3 && !success) {
            System.out.println("Enter your username:");
            String enteredUsername = s.nextLine();

            System.out.println("Enter your password:");
            String enteredPassword = s.nextLine();

            success = reg.loginUser(enteredUsername, enteredPassword);

            if (success) {
                System.out.println("Login successful");
            } else {
                attempts++;
                System.out.println("Username or password incorrect, please try again.");
            }
        }

        if (!success) {
            System.out.println("Too many failed attempts. Access denied.");
        }
    }
}

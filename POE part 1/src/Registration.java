import java.util.Scanner;

public class Registration {
    String username;
    String password;
    String phoneNo;

    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPassword(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*()].*");
    }

    public boolean checkPhoneNo(String phoneNo) {
        return phoneNo.matches("\\+27[0-9]{9}");
    }

    public void register() {
        Scanner s = new Scanner(System.in);

        // Username
        do {
            System.out.println("Enter Username:");
            username = s.nextLine();

            if (!checkUsername(username)) {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            }
        } while (!checkUsername(username));
        System.out.println("Username successfully captured.");

        // Phone number
        do {
            System.out.println("Enter phone number:");
            phoneNo = s.nextLine();

            if (!checkPhoneNo(phoneNo)) {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        } while (!checkPhoneNo(phoneNo));
        System.out.println("Cell phone number successfully added.");

        // Password
        do {
            System.out.println("Enter password:");
            password = s.nextLine();

            if (!checkPassword(password)) {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number and a special character.");
            }
        } while (!checkPassword(password));
        System.out.println("Password successfully captured.");
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Login successful";
        } else {
            return "Username or password incorrect, please try again";
        }
    }
}
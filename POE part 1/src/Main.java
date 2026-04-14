public class Main {
    public static void main(String[] args) {
        Registration reg = new Registration();
        Login log = new Login();
        reg.register(); // Registration process
        log.login(reg); // Login process
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    Registration reg;

    @BeforeEach
    void setUp() {
        reg = new Registration();
    }

    @Test
    void testUserRegistrationValid() {
        // Valid: contains "_" and length is 5 or less
        assertTrue(reg.checkUsername("bo_it"), "Username should be valid");
    }

    @Test
    void testUserRegistrationInvalid() {
        // Invalid: too long
        assertFalse(reg.checkUsername("boitumelo_123"), "Username should be invalid if > 5 chars");
        // Invalid: no underscore
        assertFalse(reg.checkUsername("boit"), "Username should be invalid without underscore");
    }

    @Test
    void testPasswordComplexity() {
        // Valid: 8+ chars, Cap, Num, Special
        // NOTE: Ensure your Registration.java regex includes '!'
        assertTrue(reg.checkPassword("SafePass1!"), "Password should meet complexity requirements");
    }

    @Test
    void testLoginLogic() {
        // Simulate a registered user by manually setting fields
        reg.username = "test_";
        reg.password = "Password123!";

        // Test matching credentials
        assertTrue(reg.loginUser("test_", "Password123!"), "Login should return true for matching credentials");

        // Test non-matching credentials
        assertFalse(reg.loginUser("test_", "WrongPass1!"), "Login should return false for incorrect password");
    }
}
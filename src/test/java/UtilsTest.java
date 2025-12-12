import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    void testCheckNameValid() {
        assertTrue(Utils.checkName("John"));
    }

    @Test
    void testCheckNameEmpty() {
        assertFalse(Utils.checkName(""));
    }

    @Test
    void testCheckNameNull() {
        assertFalse(Utils.checkName(null));
    }

    @Test
    void testIsValidAgeValid() {
        assertTrue(Utils.isValidAge(20));
    }

    @Test
    void testIsValidAgeNegative() {
        assertFalse(Utils.isValidAge(-1));
    }

    @Test
    void testIsValidAgeTooLargeBugAllows120Plus() {
        assertTrue(Utils.isValidAge(150));  // This exposes bug
    }
}

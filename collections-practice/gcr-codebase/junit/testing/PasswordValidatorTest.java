// package Junit.Test.demo;
import org.junit.jupiter.api.Test;

import Junit.Test.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongPass1"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(validator.isValid("Ab1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
}

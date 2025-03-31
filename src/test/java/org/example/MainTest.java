package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * With another method, you want to check if the password contains digits.
 * Additionally, you want to ensure with a method that both uppercase and lowercase letters are used in the password.
 * And a method should detect commonly used passwords.
 */
class MainTest {

    @Test
    void checkLength_shouldReturnTrue_whenCalledWithPasswordWith8Characters() {
        //GIVEN
        String password = "Pass1213";
        //WHEN
        boolean actual = Main.checkLength(password);
        //THEN
        assertTrue(actual);

    }

    @Test
    void checkLength_shouldReturnFalse_whenCalledWithPasswordWith7Characters() {
        //GIVEN
        String password = "Pass121";
        //WHEN
        boolean actual = Main.checkLength(password);
        //THEN
        assertFalse(actual);

    }

    @Test
    void containsDigit_shouldReturnFalse_whenCalledWithPasswordWithoutDigits() {
        //GIVEN
        String password = "Pass";
        //WHEN
        boolean actual = Main.containsDigit(password);
        //THEN
        assertFalse(actual);

    }
}
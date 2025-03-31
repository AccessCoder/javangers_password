package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
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

    @Test
    void containsDigit_shouldReturnTrue_whenCalledWithPasswordWithDigits() {
        //GIVEN
        String password = "Pass12";
        //WHEN
        boolean actual = Main.containsDigit(password);
        //THEN
        assertTrue(actual);

    }

    @Test
    void containsUppercase_shouldReturnTrue_whenCalledWithPasswordWithUpperCaseLetters() {
        //GIVEN
        String password = "Pass12";
        //WHEN
        boolean actual = Main.containsUppercase(password);
        //THEN
        assertTrue(actual);

    }

    @Test
    void containsUppercase_shouldReturnFalse_whenCalledWithPasswordWithoutUpperCaseLetters() {
        //GIVEN
        String password = "pass12";
        //WHEN
        boolean actual = Main.containsUppercase(password);
        //THEN
        assertFalse(actual);

    }

    @Test
    void containsLowercase_shouldReturnFalse_whenCalledWithPasswordWithoutLowerCaseLetters() {
        //GIVEN
        String password = "PASS12";
        //WHEN
        boolean actual = Main.containsLowercase(password);
        //THEN
        assertFalse(actual);

    }

    @Test
    void containsLowercase_shouldReturnTrue_whenCalledWithPasswordWithLowerCaseLetters() {
        //GIVEN
        String password = "Pass12";
        //WHEN
        boolean actual = Main.containsLowercase(password);
        //THEN
        assertTrue(actual);

    }

    @Test
    void containsIllegalPasswords_shouldReturnTrue_whenCalledWithIllegalPassword() {
        //GIVEN
        String password = "Passwort123";
        //WHEN
        boolean actual = Main.containsIllegalPassword(password);
        //THEN
        assertTrue(actual);

    }

}
package org.example;

/**
 *
 * Additionally, you want to ensure with a method that both uppercase and lowercase letters are used in the password.
 * And a method should detect commonly used passwords.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkLength(String password) {
       return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUppercase(String password) {
        return !password.toLowerCase().equals(password);
    }

    public static boolean containsLowercase(String password) {
        return false;
    }
}
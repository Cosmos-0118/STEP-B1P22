package PalindromeCheckerApp.src;

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome: ");
        String Input = sc.next();
        String reverse = "";
        for (int i = Input.length() - 1; i > -1; i--) {
                reverse = reverse + Input.charAt(i);
        }
        if (Input.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

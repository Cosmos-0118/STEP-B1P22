import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker Management System\n" +
                "Version : 1.0\n" +
                "System initialized successfully.");

        System.out.print("Input text: ");
        String input = sc.next();

        // Convert String to Character Array
        char[] characters = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}

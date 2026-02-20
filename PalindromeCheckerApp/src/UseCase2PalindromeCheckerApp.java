package PalindromeCheckerApp.src;

import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome: ");
        String Input = sc.next();
        int length = Input.length();
        boolean isPalindrome = true;
        for (int i = 0; i < Input.length()/2; i++) {
           if(Input.charAt(i) != Input.charAt(length - 1 -i)) {
                isPalindrome = false;
                break;
           }
        }
        if(isPalindrome == true) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}

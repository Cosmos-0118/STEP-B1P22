import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker Management System\n" +
                "Version : 1.0\n" +
                "System initialized successfully.");
        System.out.print("Input text: ");
        String input = sc.next();
        Deque<Character> deque = new LinkedList<>();
        boolean isPalindrome = true;
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        sc.close();
    }
}
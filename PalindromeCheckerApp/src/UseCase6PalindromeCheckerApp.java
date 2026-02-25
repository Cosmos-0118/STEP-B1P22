import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");
        System.out.println("System initialized successfully.");

        System.out.print("Input text: ");
        String input = sc.next();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            queue.add(ch);    
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   
            char fromStack = stack.pop();     

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result = check(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? : " + result);
        scanner.close();
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
}
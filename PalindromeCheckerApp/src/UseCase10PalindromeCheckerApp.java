import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Normalize: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(normalized, 0, normalized.length() - 1);

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
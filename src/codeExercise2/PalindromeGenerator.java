package codeExercise2;
import java.util.Random;

public class PalindromeGenerator {
    public static String generatePalindrome(int N, int K) {
        StringBuilder sb = new StringBuilder();

        // Create a set of K distinct random lower-case letters
        Random rand = new Random();
        for (int i = 0; i < K; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            sb.append(c);
        }
        System.out.println(sb);

        // Append the reverse of the set to the original string
//        sb.append(new StringBuilder(sb.toString()).reverse());
        
//        System.out.println(sb);

        // Repeat the set of K letters as many times as needed to reach N
//        while (sb.length() < N) {
//            sb.append(sb.substring(0, K));
//        }
//        System.out.println(sb);
//        // Truncate the string to the desired length N
//        sb.setLength(N);
//        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        int N = 3;
        int K = 2;
        String palindrome = generatePalindrome(N, K);
        System.out.println(palindrome);
    }
}
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class UseCase6PalindromeCheckerApp {


        public static void main(String[] args) {

            // Input string
            String input = "civic";

            // Queue (FIFO)
            Queue<Character> queue = new LinkedList<>();

            // Stack (LIFO)
            Stack<Character> stack = new Stack<>();

            // Insert characters into both structures
            for (char c : input.toCharArray()) {
                queue.add(c);
                stack.push(c);
            }

            boolean isPalindrome = true;

            // Compare queue dequeue and stack pop
            while (!queue.isEmpty()) {

                if (queue.remove() != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        String result = getBalanced(input) ? "YES" : "NO";

        System.out.println(result);

    }

    private static boolean getBalanced(String[] input) {
        Deque<String> stack = new ArrayDeque<>();

        for (String el : input) {

            switch (el) {
                case "}":
                    if (!stack.isEmpty()) return false;

                    if (!"{".equals(stack.pop())) {
                        return false;
                    }
                    break;
                case "]":
                    if (stack.isEmpty()) return false;

                    if (!"[".equals(stack.pop())) {
                        return false;
                    }
                    break;
                case ")":
                    if (stack.isEmpty()) return false;

                    if (!"(".equals(stack.pop())) {
                        return false;
                    }
                    break;
                default:
                    stack.push(el);
                    break;
            }

        }
        return true;
    }
}
/*
Given a sequence consisting of parentheses, determine whether the expression is balanced.
A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with a closing
parenthesis that occurs after the former. Also, the interval between them must be balanced.


 */